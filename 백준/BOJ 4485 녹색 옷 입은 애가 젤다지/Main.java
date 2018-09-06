import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static int map[][];
	static int dist[][];
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int num=0;
		while(true) {
			num++;
		n = Integer.parseInt(br.readLine());
		if(n==0)break;
		
		map = new int[n+1][n+1];
		dist = new int[n+1][n+1];
		for(int i=0; i<=n; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
			Arrays.fill(map[i], 0);
		}
		
		for(int i=1; i<=n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=1; j<=n; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<Node>();
		pq.add(new Node(1,1,0));
		dist[1][1]=map[1][1];
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			//end
			if(curNode.x == n && curNode.y ==n) {
				bw.write(String.valueOf("Problem "+num+": "+curNode.cost+"\n"));
				bw.flush();
				break;
			}
			// prevent duplicate
			if(dist[curNode.x][curNode.y] <curNode.cost)continue;
			
			for(int i=0; i<4;i ++) {
				int nx = curNode.x + dx[i];
				int ny = curNode.y + dy[i];
				
				if(nx<=0 || ny <=0 || nx>n || ny >n )continue;
				if(dist[nx][ny] > dist[curNode.x][curNode.y]+map[nx][ny]) {
					dist[nx][ny] = dist[curNode.x][curNode.y]+map[nx][ny];
					pq.add(new Node(nx,ny,dist[nx][ny]));
				}
			}
		}
		
		
		}//while- loop
	}
}


class Node implements Comparable<Node>{
	int x,y,cost;
	public Node(int x, int y, int cost) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.cost=cost;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.cost < o.cost ? -1 : 1;
	}
}