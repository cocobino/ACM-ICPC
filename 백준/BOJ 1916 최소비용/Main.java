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
		int curNode; // ������
		int d; // ������ �Ÿ�
		dist[start]=0; // ���������� �������� �Ÿ��� 0�̹Ƿ�
		
		for(int i=1;i<=n; i++) {
			d = INF+1; 
			curNode = -1;
			for(int j=1; j<=n; j++){
				if(!visit[j] && dist[j]<d) { // ��带 �湮���� �ʾҰ� , s ��忡�� ����� �Ÿ� ����
					curNode = j;
					d = dist[j];
				}
			}
			for(int j=1; j<=n; j++) { // curNode ���� j ���� ���� �ּҰŸ����
				if(dist[j] >dist[curNode]+map[curNode][j]) { //curNode -> j ���� �Ÿ��� > ������Ÿ� + curNode-> j �������� ũ�� ����
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