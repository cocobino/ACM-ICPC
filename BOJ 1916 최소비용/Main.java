import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	//static ArrayList<Node> arr[];
	static int map[][];
	static int dist[];
	static boolean visit[];
	static int s,e;
	static final int INF = 1000000000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		n = Integer.parseInt(br.readLine());
		m = Integer.parseInt(br.readLine());
		
		//arr = new ArrayList[n+1];
		//for(int i=1; i<=n; i++)arr[i] = new ArrayList<Node>();
		map = new int[n+1][n+1];
		dist= new int[n+1];
		visit = new boolean[n+1];
		
		for(int i=0; i<=n; i++) {
			dist[i] = INF;
			visit[i] = false;
			for(int j=0; j<=n; j++) {
				map[i][j] = INF;
			}
			
		}
		
		for(int i=1 ; i<=m ;i ++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int wgt = Integer.parseInt(st.nextToken());
			
			if(map[a][b]>wgt) {
				map[a][b] =wgt;
			}
			
		}
		st = new StringTokenizer(br.readLine());
		s = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		
		
		dijikstra(s,n,m,map,dist,visit);
		bw.write(String.valueOf(dist[e]));
		bw.flush();
		
		
		
	}

	private static void dijikstra(int start, int n, int m, int[][] map, int[] dist, boolean[] visit) {
		// TODO Auto-generated method stub
		int curNode; // 현재노드
		int d; // 현재노드 거리
		dist[start]=0; // 시작점에서 시작점은 거리가 0이므로
		
		for(int i=1;i<=n; i++) {
			d = INF+1; 
			curNode = -1;
			for(int j=1; j<=n; j++){
				if(!visit[j] && dist[j]<d) { // 노드를 방문하지 않았고 , s 노드에서 연결된 거리 측정
					curNode = j;
					d = dist[j];
				}
			}
			for(int j=1; j<=n; j++) { // curNode 에서 j 까지 가는 최소거리비용
				if(dist[j] >dist[curNode]+map[curNode][j]) { //curNode -> j 까지 거리가 > 현재노드거리 + curNode-> j 까지보다 크면 갱신
					dist[j] = dist[curNode]+map[curNode][j];
				}
			}
			visit[curNode]=true;
		
		}
		
	}

}



class Node{
	int end, cost;
	public Node(int end, int cost) {
		// TODO Auto-generated constructor stub
		this.end = end;
		this.cost = cost;
	}
	
}