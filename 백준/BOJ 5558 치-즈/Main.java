import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static int r,c; //map 크기
	static char map[][];
	static int n; //치즈개수
	static boolean visit[][];
	
	static int mousex,mousey;
	static int movecnt=0,min=Integer.MAX_VALUE;
	static int rst=0;
	
	static int dx[] = {0,-1,0,1};
	static int dy[] = {1,0,-1,0}; //동 북 서 남
	
	static Queue<Node> q = new LinkedList<Node>();
	
	 
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st=  new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		map = new char[r][c];
		
		for(int i=0; i<r; i++) {
			String a= br.readLine();
			for(int j=0; j<c; j++) {
			 map[i][j] = a.charAt(j);
			 if(map[i][j] =='S') {
				 mousex=i; mousey=j;
			 }
			}
		}//insert
		
		//1~n까지 치즈찾기
	
		for(int i=1; i<=n; i++) {
		rst += bfs(i);
		q = new LinkedList<Node>();
		
		}
		 
	
		 
		bw.write(String.valueOf(rst));
		bw.flush();
		
	}



	private static int bfs(int k) {
		// TODO Auto-generated method stub
		int cnt= -1;
		
		visit = new boolean[r][c];
		q.add(new Node(mousex,mousey));
		visit[mousex][mousey]=true;
		boolean exit = false;
		while(!q.isEmpty()) {
			cnt++;
			int size= q.size();
			for(int i=0; i<size; i++) {
				Node cur = q.poll();
				int x = cur.x;
				int y = cur.y;
				
				if(map[x][y] == k+'0') {
					exit = true;
					mousex = x;
					mousey = y;
					return cnt;
				}
				
				for(int j=0; j<4; j++) {
					int nx = x +dx[j];
					int ny = y+ dy[j];
					
			 if(nx<0 || ny<0 || nx>=r || ny >=c)continue;
			 if(map[nx][ny] == 'X')continue;
			 if(visit[nx][ny])continue;
			 
			 visit[nx][ny] = true;
			 q.add(new Node(nx,ny));
			 
				}
			}
			if(exit)return cnt;
		}
		
		return 0;
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