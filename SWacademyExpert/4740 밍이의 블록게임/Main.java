import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int T,t;
    
    public static void main(String args[]) throws IOException {
    	T = Integer.parseInt(br.readLine());
    	
    	for(int tc=1; tc<=T; tc++)solution(tc); 
    }//main

    //declare
    static int n,m,q;
    static int map[][];
    
    static final int blank=0;
    static final int Red = 1;
    static final int Blue = 2;
    static final int Green = 3;
    static final int Yellow =4;
    static final int Purple =5;
    
    static int dx[] = {0,0,-1,1};
    static int dy[] = {1,-1,0,0};
    
	private static void solution(int tc) throws IOException {
	 
		StringTokenizer st= new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		q = Integer.parseInt(st.nextToken());
		
		map = new int[n][m];
		for(int i=0; i<n; i++) {
			String a = br.readLine();
			for(int j=0; j<m; j++) {
				char c = a.charAt(j);
				switch(c) {
				case 'R':
					map[i][j]=Red;
					break;
				case 'G':
					map[i][j] = Green;
					break;
				case 'B':
					map[i][j] = Blue;
					break;
				case 'P':
					map[i][j] = Purple;
					break;
				case 'Y':
					map[i][j] = Yellow;
					break;
				case '#':
					map[i][j] = blank;
					break;
				}
			}
		}
		
		for(int i=0; i<q; i++) {
			String command = br.readLine();
			switch(command) {
			case "D":
				delete();
				break;
			
			case "L":
				left();
				break;
			case "R":
				right();
				break;
			}
			if(command.charAt(0)== 'U') {
				upper(command);
			}
			
		}
		bw.write(String.valueOf("#"+tc+"\n"));
		for(int i=0; i<n; i++) {
			String out="";
			for(int j=0; j<m; j++) {
				switch(map[i][j]) {
				case blank:
					out+="#";
					break;
				case Red:
					out+="R";
					break;
				case Blue:
					out+="B";
					break;
				case Green:
					out+="G";
					break;
				case Yellow:
					out+="Y";
					break;
				case Purple:
					out+="P";
					break;
				}
			}
			bw.write(String.valueOf(out+"\n"));
		}
		bw.write(String.valueOf("\n"));
		bw.flush();
		
	 
	}//solution
	
	private static void upper(String command) {
		// TODO Auto-generated method stub
		//맨 윗줄에 블록이 있으면 return
		for(int i=0; i<m; i++) {
			if(map[0][i]!=blank)return;
		}
		
		// 한칸 올리기
		for(int i=0; i<m; i++) {
			LinkedList<Integer> up = new LinkedList<>();
			for(int j=n-1; j>=1; j--) {
				up.add(map[j][i]);
				map[j][i]=blank;
			}
			for(int j=n-2; j>=0; j--) {
				if(up.isEmpty())continue;
				map[j][i] = up.poll();
			}
		}
		
		//아래칸에 1줄 추가
		for(int i=0; i<m; i++) {
			switch(command.charAt(i+2)) {
			case 'R':
				map[n-1][i]=Red;
				break;
			case 'G':
				map[n-1][i] = Green;
				break;
			case 'B':
				map[n-1][i] = Blue;
				break;
			case 'P':
				map[n-1][i] = Purple;
				break;
			case 'Y':
				map[n-1][i] = Yellow;
				break;
			case '#':
				map[n-1][i] = blank;
				break;
			}
		}
		
		gravity();
	}

	private static void gravity() {
		// TODO Auto-generated method stub
		for(int i=0; i<m; i++) {
			LinkedList<Integer> gravity = new LinkedList<>();
			for(int j=n-1; j>=0; j--) {
				if(map[j][i]!=blank) {
					gravity.add(map[j][i]);
					map[j][i]=blank;
				}
			}
			
			for(int j=n-1; j>=0; j--) {
				if(gravity.isEmpty())continue;
				map[j][i]=gravity.poll();
			}
		}
	}

	private static void right() {
		// TODO Auto-generated method stub
		for(int i=n-1; i>=0; i--) {
			LinkedList<Integer> push_left = new LinkedList<>();
			for(int j=m-1; j>=0; j--) {
				if(map[i][j] != blank) {
					push_left.add(map[i][j]);
					map[i][j]=blank;
				}
			}
			for(int j=m-1; j>=0; j--) {
				if(push_left.isEmpty())continue;
				map[i][j] = push_left.poll();
			}
		}
	}

	private static void left() {
		// TODO Auto-generated method stub
			for(int i=0; i<n; i++) {
				LinkedList<Integer> push_left = new LinkedList<>();
			for(int j=0; j<m; j++) {
				if(map[i][j] != blank) {
					push_left.add(map[i][j]);
					map[i][j]=blank;
				}
			}
			for(int j=0; j<push_left.size(); j++) {
				map[i][j] = push_left.get(j);
			}
		}
			
			
	}

	//제일 큰색 칸 지우기
	static int dist[][];
	static int delmax;
	private static void delete() {
		// TODO Auto-generated method stub
		dist = new int[n][m];
		boolean visit[][] = new boolean[n][m];
		delmax =0;
	
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(!visit[i][j] && map[i][j]!=blank)
				bfs(i,j,visit);
			}
		}//색숫자 계수
		
		
		//최대영역 칸 지우기
		for(int i=0; i<n; i++) {
			for(int j=0; j<m ;j++) {
				if(dist[i][j]==delmax)map[i][j]=0;
			}
		}
		
		
		//빈칸 내리기
		gravity();
		
	}

	private static void bfs(int x, int y, boolean[][] visit) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<Node>();
		boolean chk[][] = new boolean[n][m];
		q.add(new Node(x,y));
		chk[x][y]= true;
		while(!q.isEmpty()) {
			int size = q.size();
		for(int i=0; i<size; i++) {	
			Node cur = q.poll();
			if(map[cur.x][cur.y] != map[x][y])continue;
			
			for(int j=0; j<4; j++) {
				int nx = cur.x +dx[j];
				int ny = cur.y +dy[j];
				
				if(nx<0 || ny<0 || nx>=n || ny>=m)continue;
				if(map[nx][ny] != map[x][y])continue;
				if(chk[nx][ny])continue;
				
				q.add(new Node(nx,ny));
				chk[nx][ny] =true;
			}
		}
		}//bfs
		int cnt=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(chk[i][j]) {
					visit[i][j]=true;
					cnt++;
				}
			}
		}
		delmax = Math.max(cnt, delmax);
		for(int i=0; i<n; i++) {
			for(int j=0; j<m; j++) {
				if(chk[i][j]) {
					dist[i][j]=cnt;
				}
			}
		}
	}
	  
	 
	
	}//class
 
 class Node{
	 int x,y;
	 public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		 this.x=x;
		 this.y=y;
		 
	}
 }