import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n,m,start;
 
	static boolean visit[];
 

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // node
		m = Integer.parseInt(st.nextToken()); // edge
		
		start= Integer.parseInt(br.readLine()); // start
		
		//declare
		int dist[] = new int[n+1];
		 ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
			
		
		for(int i=0; i<=n; i++) {
			Arrays.fill(dist, Integer.MAX_VALUE);
			arr.add(new ArrayList<>());
		}
		//init 
		
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			
			int from = Integer.parseInt(st.nextToken());
			int to =  Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			arr.get(from).add(to*11 +cost);

		}//insert
		
		//dist[start]=0;
		//visit[start]=true;
		
		dijik(start, dist, arr);
		
		
		//result
		for(int i=1; i<=n; i++) {
			if(dist[i]<Integer.MAX_VALUE)bw.write(String.valueOf(dist[i]+"\n"));
			else bw.write(String.valueOf("INF\n"));
		}
		bw.flush();
		bw.close();
		br.close();
		
		
	}

	private static void dijik(int cur, int[] dist, ArrayList<ArrayList<Integer>> arr) {
		// TODO Auto-generated method stub
		PriorityQueue<Node> q = new PriorityQueue<>();
		
		dist[cur]=0;
		q.add(new Node(cur, dist[cur]));
		
		while(!q.isEmpty()) {
			int cost = q.peek().cost;
			int curNode = q.peek().node;
			
			q.poll();
			
			if(dist[curNode] < cost) {
				continue;
			}
			
		for(int go : arr.get(curNode)) {
			
			int nxtNode =go /11;
			int wgt= go % 11;
			
			if(dist[nxtNode] > dist[curNode] + wgt) {
				
				dist[nxtNode] = dist[curNode] + wgt;
				q.add(new Node(nxtNode, dist[nxtNode]));
			}
			
			
			
		}
			
		}
		
	}

}

class Node implements Comparable<Node>{
	int node,cost;
	
	public Node(int node, int cost) {
		// TODO Auto-generated constructor stub
		this.node = node;
		this.cost = cost;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.cost < o.cost ? -1 : 1;
	}
	
}