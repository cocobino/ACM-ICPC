import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
		
	static int r,c;
	static int map[][];
	static boolean visit[][];
	static Queue<Node> q = new LinkedList<Node>();
	
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		map = new int[r][c];
		
		
		for(int i=0; i<r; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<c; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
 int cnt=0;
 int time=0;
 int pre=0;
		while(true) {
			visit = new boolean[r][c];
			outside();
			
			
			 for(int i=1; i<r-1; i++) {
				 for(int j=1; j<c-1; j++) {
					 if(map[i][j] ==1 && isedge(i,j))bfs(i,j);
				 }
			 }
			 
			 cnt = q.size();
			 if(cnt==0)break;
			 pre = cnt;
			 time++;
			 
			 while(!q.isEmpty()) {
				 map[q.peek().x][q.poll().y]=-1;
			 }
		}
		bw.write(String.valueOf(time+"\n"+pre));
		bw.flush();
	}

	private static void bfs(int x, int y) {
		// TODO Auto-generated method stub
		Queue<Node> search = new LinkedList<>();
		search.offer(new Node(x,y));
		
		while( !search.isEmpty()) {
			x = search.peek().x;
			y = search.peek().y;
			visit[x][y]=true;
			
			if(isedge(x,y)) {
				map[x][y] = 2;
				q.offer(new Node(x,y));
			}
			
			for(int i=0; i<4; i++) {
				int nx = x +dx[i];
				int ny = y +dy[i];
				
				if( nx>=0 && ny>=0 && nx<r && ny<c && map[nx][ny]==1 && !visit[nx][ny]) {
					visit[nx][ny]=true;
					search.offer(new Node(nx,ny));
					
				}
			}
		}
		
	}

	private static boolean isedge(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=0 ;i<4; i++) {
			if(map[x+dx[i]][y+dy[i]]==-1)return true;
		}
		return false;
	}

	private static void outside() {
		// TODO Auto-generated method stub
		boolean outvisit[][] = new boolean[r][c];
		outvisit[0][0] =true;
		
		Queue<Node> air = new LinkedList<Node>();
		air.offer(new Node(0,0));
		
		while(!air.isEmpty()) {
			int x = air.peek().x;
			int y = air.peek().y;
			map[x][y]=-1;
			
			for(int i=0; i<4; i++) {
				int nx = x + dx[i];
				int ny = y + dy[i];
				
				if(nx>=0 && nx<r && ny>=0 && ny<c
					&& map[nx][ny] <=0 && !outvisit[nx][ny]) {
					air.offer(new Node(nx,ny));
					outvisit[nx][ny]=true;
				}
			}
			
		}
		
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