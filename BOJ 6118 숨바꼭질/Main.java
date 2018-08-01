import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static ArrayList<Integer> map[];
	static int n,m, INF = Integer.MAX_VALUE, farthest=0, farthestDist=0, sameDist=0;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new ArrayList[n];
		for(int i=0; i<n; i++)map[i] = new ArrayList<>();
		
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken())-1;
			int to = Integer.parseInt(st.nextToken())-1;
			map[from].add(to);
			map[to].add(from);
		}
		
		dijikstra(0);
		bw.write(String.valueOf(farthest+1 +" "+ farthestDist +" "+ sameDist));
		bw.flush();
	}

	private static void dijikstra(int start) {
		// TODO Auto-generated method stub
		int i, curNode;
		
		Node dist[] = new Node[n];//
		for(i=0; i<n; i++)dist[i] = new Node(i,INF);//
		dist[start].cost =0;
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		pq.offer(start);
		
		while(!pq.isEmpty()) {
			curNode = pq.poll();
			for(int nextNode : map[curNode]) 
				if(dist[nextNode].cost > 1 + dist[curNode].cost) {
					dist[nextNode].cost = 1 + dist[curNode].cost;
					pq.offer(nextNode);
				}
			
		}
			Arrays.sort(dist);
			farthest = dist[0].node;
			farthestDist = dist[0].cost;
				
			for( i=0; i<n; i++) {
				if(dist[i].cost == farthestDist)sameDist++;
				else break;
			
			}
		}
	}
	


class Node implements Comparable<Node>{
	int node, cost;
	public Node(int node, int cost	) {
		// TODO Auto-generated constructor stub
		this.node = node;
		this.cost = cost;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(cost == o.cost) return Integer.compare(node, o.node);// 거리가같다면 오름차순
		return Integer.compare(o.cost, cost); // 내림차순
	}
}