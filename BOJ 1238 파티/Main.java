import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static int n, m;
	static int map[][], revmap[][];
	static int dist[], revdist[];
	static boolean visit[], revvisit[];
	static int s,e;
	static final int INF = 1000000000;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		
		map = new int[n+1][n+1];
		dist = new int[n+1];
		visit = new boolean[n+1];
		
		revmap = new int[n+1][n+1];
		revdist = new int[n+1];
		revvisit = new boolean[n+1];
		
		for(int i=0; i<=n; i++) {
			visit[i] = false;
			revvisit[i]= false;
			dist[i] = INF;
			revdist[i]=INF;
			for(int j=0; j<=n; j++) {
				map[i][j] = INF;
				revmap[i][j]=INF;
			}
		} // init
		
		for(int i=1; i<=m; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int wgt = Integer.parseInt(st.nextToken());
			
			if(map[a][b] > wgt)map[a][b]=revmap[b][a]=wgt;
			
		}
		
		dijikstra(e, dist, map, visit, n,m);
		dijikstra(e, revdist, revmap, revvisit, n,m);
		int max =0;
		for(int i=1; i<=n; i++) {
			max = Math.max(max, dist[i]+revdist[i]);
		}
		bw.write(String.valueOf(max));
		bw.flush();

	}
	private static void dijikstra(int end, int[] dist, int[][] map, boolean[] visit, int n, int m) {
		// TODO Auto-generated method stub
		int d;
		int curNode;
		dist[end] = 0;
		
		for(int i=1; i<=n; i++) {
		 d = INF +1;
		 curNode = -1;
		 for(int j=1; j<=n; j++) {
			 if(!visit[j] && dist[j]<d) {
				 curNode= j;
				 d = dist[j];
			 }
		 }
		 for(int j=1; j<=n; j++) {
			 if(dist[j]>dist[curNode] + map[curNode][j]) {
				 dist[j] = dist[curNode] + map[curNode][j];
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