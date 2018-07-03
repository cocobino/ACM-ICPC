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
		/*
		 * 1-> 1 돌아왔을때 T 값이 음수 
		 */
		public static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case; // 테스트 케이스
		int N;
		int M;
		int W;
		Node [] edges;
		int S; // source1
		int E; // source2
		int T; // weight
		int [] start;
		int totalEdgeCount;
		
		test_case = Integer.parseInt(br.readLine());
		
		for(int test=0; test<test_case; test++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			
			N = Integer.parseInt(st.nextToken());
			M = Integer.parseInt(st.nextToken());
			W = Integer.parseInt(st.nextToken());
			
			totalEdgeCount = 2*M +W; // 도로방향 ->양방향
			
			int idx_edges = -1; // 인덱스 번호를 이어서 붙여주기위해서
			edges = new Node[totalEdgeCount];
			
			 for (int m = 0; m < M; m++) {

	                st = new StringTokenizer(br.readLine());

	                S = Integer.parseInt(st.nextToken());
	                E = Integer.parseInt(st.nextToken());
	                T = Integer.parseInt(st.nextToken());

	                edges[++idx_edges] = new Node(S, E, T);
	                edges[++idx_edges] = new Node(E, S, T);
	            }
			 
			 start = new int[W];
			 for (int w = 0; w < W; w++) {

	                st = new StringTokenizer(br.readLine());

	                S = Integer.parseInt(st.nextToken());
	                E = Integer.parseInt(st.nextToken());
	                T = Integer.parseInt(st.nextToken());

	                edges[++idx_edges] = new Node(S, E, -T);

	                start[w] = E; //웜홀  도착지 = 벨만포드 출발
	            }
			 
			 boolean isnegative = false;
			 for(int i=0; i<W; i++) {
				 if(!BellamFord(edges, N, totalEdgeCount, start[i])) {
					 isnegative = true;
					 break;
				 }
			 }
			 bw.write(String.valueOf(isnegative ? "YES" : "NO" +"\n"));
			 
		}
	bw.flush();
	}
	private static boolean BellamFord(Node[] edges, int N, int totalEdgeCount, int source) {
		// TODO Auto-generated method stub
		int [] dist = new int[N+1];
		Arrays.fill(dist, INF);
		dist[source] = 0;
		
		for(int i=0; i<N-1; i++) {
			for(int j=0; j<totalEdgeCount; j++) {
				
				if(dist[edges[j].to] > dist[edges[j].from] + edges[j].cost) {
					dist[edges[j].to] = dist[edges[j].from] + edges[j].cost;
				}
				
			}
		}
		for(int i=0; i<totalEdgeCount; i++) {
			 if (dist[edges[i].to] > dist[edges[i].from] + edges[i].cost) {

	                return false;
	            }
		}
		return true;
	}
}

class Node {
		public int from, to, cost;
		public Node(int from, int to, int cost) {
			// TODO Auto-generated constructor stub
			this.from =from;
			this.to= to;
			this.cost = cost;
		}
}