import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int r,c;
	static int map[][];
	static int dist[][];
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		c = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken());
		
		map = new int[r+1][c+1];
		dist = new int[r+1][c+1];
		
		for(int i=1; i<=r; i++) {
			String a = br.readLine();
			for(int j=1; j<=c; j++) {
				map[i][j] = a.charAt(j-1)-'0';
			}
		}
		
		for(int i=0; i<=r; i++) {
			Arrays.fill(dist[i], Integer.MAX_VALUE);
		}
		
		PriorityQueue<Node> pq = new PriorityQueue<>();
		pq.add(new Node(1,1,0));
		dist[1][1]=0;
		
		while(!pq.isEmpty()) {
			Node curNode = pq.poll();
			
			if(curNode.x ==r && curNode.y ==c) {
				bw.write(String.valueOf(curNode.cost));
				bw.flush();
				break;
			}
			
			if(dist[curNode.x][curNode.y]<curNode.cost) { //중복제거
				continue;
			}
			for(int i=0; i<4; i++) {
				int nx = curNode.x + dx[i];
				int ny = curNode.y + dy[i];
				
				if(nx<=0 || ny<=0 || nx>r || ny>c)continue;
				
				if(dist[nx][ny] > dist[curNode.x][curNode.y]+ map[nx][ny]) {
					dist[nx][ny] = dist[curNode.x][curNode.y]+ map[nx][ny];
					pq.add(new Node(nx,ny,dist[nx][ny]));
				}
			}
			
		}
		

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
	public int compareTo(Node arg0) {
		// TODO Auto-generated method stub
		return this.cost < arg0.cost ? -1 : 1;
	}
}
