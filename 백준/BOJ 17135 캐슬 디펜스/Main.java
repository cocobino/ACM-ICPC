import java.util.*;
import java.io.*;

public class Main {

		 
		static int map[][];
		static int r,c,d;
		static int rst;
		static int dx[] = {0,0,-1,1};
		static int dy[] = {1,-1,0,0};
		
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	 
		st =new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken())+1;
		c = Integer.parseInt(st.nextToken());
		d = Integer.parseInt(st.nextToken());
		
		map = new int[r+1][c];
		
		for(int i=0; i<r-1; i++) {
			st =new StringTokenizer(br.readLine());
			for(int j=0; j<c; j ++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//insert
		rst=0;
		dfs(0,map);
			
	 System.out.println(rst);
 
	}//main


	static boolean vis[][];
	static boolean flag;
	private static void dfs(int depth, int[][] prev) {
		if(depth==3) {
			//사수 위치를 기준으로 활을 쏘기
			
			flag = true;
			int cnt=0;
			while(flag) {
			flag =false;
			vis = new boolean[r][c];
			for(int i=0; i<c; i++) {
				if(prev[r-1][i] == 9) {
					bfs(r-1,i,prev);
				}
			}
			
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
					if(vis[i][j] && prev[i][j] == 1) {
						prev[i][j]=0;
						cnt++;
					}
				}
			}
			
			moveEnermy(prev);
			
			}
			rst = Math.max(rst, cnt);
			return;
		}//end option
		
		int tmp[][] = new int[r][c];
		
		
		for(int pos=depth; pos<c; pos++) {
			deepcopy(tmp, prev);
		
			if(tmp[r-1][pos] == 9)continue;
			tmp[r-1][pos] = 9;
			
			dfs(depth+1,tmp);
			
		}//for loop : pos
		
	}//func  dfs



	private static void moveEnermy(int[][] prev) {
		for(int j=0; j<c; j++) {
			for(int i=r-2; i>=0; i--) {
				if(i==r-2 && prev[i][j] == 1)prev[i][j]=0;
				else if(prev[i][j] == 1){
					prev[i][j]=0;
					prev[i+1][j]=1;
					flag=true;
				}
			}
		}
		
	}



	private static void bfs(int x, int y, int[][] prev) {
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(x,y));
		int dist[][] = new int[r][c];
		for(int i=0; i<r; i++)Arrays.fill(dist[i], Integer.MAX_VALUE);
		dist[x][y]=0;
		
		while(!q.isEmpty()) {
			Node cur =q.poll();
			
			for(int i=0; i<4; i++) {
				int nx = cur.x +dx[i];
				int ny = cur.y +dy[i];
				
				if(inrage(nx,ny) && dist[nx][ny] > dist[cur.x][cur.y]+1 && dist[cur.x][cur.y]+1<=d) {
					dist[nx][ny] = dist[cur.x][cur.y]+1;
					q.add(new Node(nx,ny));
				}
			}
		}//while loop
		ArrayList<Node> kill[] = new ArrayList[r+c];
		for(int i=0; i<kill.length; i++)kill[i] = new ArrayList<Node>();
		
		for(int i=0; i<r-1; i ++) {
			for(int j=0; j<c; j++) {
				if(dist[i][j] != Integer.MAX_VALUE && prev[i][j] == 1) {
					kill[dist[i][j]].add(new Node(i,j));
				}
			}
		}
		
		for(int i=0; i<kill.length; i++) {
			if(kill[i].size() !=0) {
				Collections.sort(kill[i]);
				vis[kill[i].get(0).x][kill[i].get(0).y] = true;
				break;
			}
		}
		
	}//func : bfs



	private static boolean inrage(int nx, int ny) {
		if(nx>=0 && ny>=0 && nx<r && ny<c)return true;
		return false;
	}



	private static void deepcopy(int[][] tmp, int[][] prev) {
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				tmp[i][j] = prev[i][j];
			}
		}
	}

 
  
}//class

class Node implements Comparable<Node>{
	int x,y;

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Node o) {
		if(this.y > o.y)return 1;
		else if(this.y < o.y)return -1;
		else 		return 0;
	}
	
	
}