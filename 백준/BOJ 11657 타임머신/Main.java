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
		 * 1-> 1 ���ƿ����� T ���� ���� 
		 */
		static int N;// ��� ����
		static int M; // ���� �뼱 ����
		static int [][] maps; // �뼱����
		static int[] dist; // �ּҰŸ�����, ������������ �Ÿ�
		
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); // ����
		int M = Integer.parseInt(st.nextToken()); // ����
		
		Node bus[] = new Node[M];
		int dist[] = new int[N+1];
		Arrays.fill(dist, Integer.MAX_VALUE);
		dist[1] =0;
		for(int i=0; i<M; i++) {
			st = new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost = Integer.parseInt(st.nextToken());
			
			bus[i] = new Node(from, to, cost);
			
		}
		if(BellamFord(dist, bus, N, M)) {
		for(int i=2; i<=N; i++) {
			bw.write(String.valueOf(dist[i] == Integer.MAX_VALUE ? -1 : dist[i]+"\n"));
		}
		}else bw.write(String.valueOf(-1));
		
		bw.flush();
		
	}

	private static boolean BellamFord(int[] dist, Node[] bus, int N, int M) {
		// TODO Auto-generated method stub
		for(int i=1; i<=N; i++) {
			for(int j=0; j<M; j++) {
				if(dist[bus[j].to] > bus[j].cost + dist[bus[j].from]) {
					dist[bus[j].to] = bus[j].cost + dist[bus[j].from];
				}
			}
		}
		for(int i=0; i<M; i++) {
			if(dist[bus[i].to] > bus[i].cost + dist[bus[i].from]) return false;
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

