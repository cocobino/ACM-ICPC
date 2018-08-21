import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	 
		static int map[][];
		static boolean visit[][];
		
		static int dx[] = {0,0,-1,1};
		static int dy[] = {1,-1,0,0};
		
		static int r,c;
		
		
		static final int blank =0;
		static final int wall = -1;
		static final int door = 2;
		static final int people = 1;
		
		
	 
		
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int test_case = Integer.parseInt(br.readLine());
		for(int T=0; T<test_case; T++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		 		r = Integer.parseInt(st.nextToken())+2;
		 		c = Integer.parseInt(st.nextToken())+2;
		 		map = new int[r][c];
		 		
		 		
		 		Node people1 = new Node(-1,-1);
		 		Node people2 = new Node(-1,-1);
		 		Node helper = new Node(0,0);
		 		for(int i=1; i<r-1; i++	) {
		 			String a = "."+br.readLine()+".";
		 			for(int j=0; j<c; j++) {
		 				switch(a.charAt(j)) {
		 				case '*':
		 					map[i][j] = wall;
		 					break;
		 				case '.':
		 					map[i][j] = blank;
		 					break;
		 				case '$':
		 					map[i][j] = people;
		 					if(people1.x==-1) {
		 						people1 = new Node(i,j);
		 					}else {
		 						people2 = new Node(i,j);
		 					}
		 					break;
		 				case '#':
		 					map[i][j] = door;
		 					break;
		 				}
		 			}
		 		} // insert
		 		
		 		//테두리만들기 초기화
		 		for(int i=0; i<c; i++) {
		 			map[0][i] = map[r-1][i] = blank;
		 		}
		 		
		 		
		 		int dist1[][] =bfs(helper);
		 		int dist2[][] =bfs(people1);
		 		int dist3[][] =bfs(people2);
		 		
		 		int ans = r*c;
		 		int tmp=0;
		 		for(int i=0; i<r; i++) {
		 			for(int j=0; j<c; j++) {
		 				tmp = dist1[i][j] + dist2[i][j] + dist3[i][j];
		 				if(map[i][j] == door)tmp=-2;
		 				
		 				ans = ans > tmp ? tmp : ans;
		 			}
		 		}
		 		bw.write(String.valueOf(ans+"\n"));
		 		bw.flush();
		 		
		}//test_case
		
		
	}


	private static int[][] bfs(Node curNode) {
		// TODO Auto-generated method stub
		int dist[][] = new int[r][c];
		Queue<Node> q = new LinkedList<Node>();
		
		for(int i=0; i<r; i++)Arrays.fill(dist[i], -1);
		
		q.add(curNode);
		dist[curNode.x][curNode.y]= 0;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			for(int i=0; i<4 ; i++) {
			int nx = cur.x +dx[i];
			int ny = cur.y +dy[i];
			
			if(nx<0 || ny<0 || nx>=r || ny>=c)continue;
			if(map[nx][ny] == wall)continue;
			
				if(map[nx][ny] == blank || map[nx][ny] ==people) {
					
					if(dist[nx][ny] ==-1 || dist[nx][ny]> dist[cur.x][cur.y]) {
						
						dist[nx][ny] =dist[cur.x][cur.y];
						q.add(new Node(nx,ny));
					}
				}else if(map[nx][ny] == door) {
					
					if(dist[nx][ny] == -1 || dist[nx][ny] > dist[cur.x][cur.y]+1) {
						
						dist[nx][ny] = dist[cur.x][cur.y]+1;
						q.add(new Node(nx,ny));
					}
				}
			
			}
			
		}
		
		
		return dist;
	}


	
}


class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
}