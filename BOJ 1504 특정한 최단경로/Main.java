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

		public static final int INF = Integer.MAX_VALUE-1;
		public static int N, E;
		public static int M1,M2;
		public static int dist[];
		public static int visit[];
//		public static ArrayList arr[];
		public static int W[][];
		
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		E = Integer.parseInt(st.nextToken());
		dist = new int[N+1];
		visit = new int[N+1];
		W = new int[N+1][N+1];
		
		for(int i=0; i<E;i++) {
			st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());

	        if(W[a][b] ==0) {
	        	W[a][b] = c;
	        }else {
	        	W[a][b] = Math.min(W[a][b], c);
	        }

	        if(W[b][a]==0) {
	        	W[b][a] = c;
	        }else {
	        	W[b][a]=Math.min(W[b][a], c);
	        }
		}
		
		st= new StringTokenizer(br.readLine());
		 M1 = Integer.parseInt(st.nextToken());
		 M2 = Integer.parseInt(st.nextToken());
		
		long a1 = a(1, M1, M2, N);
		long a2 = a(1, M2, M1, N);
		
		if(a1 == -1 && a2 == -1) {
			bw.write(String.valueOf(-1+"\n"));
		}	else if(a1 == -1)bw.write(String.valueOf(a2+"\n"));
			else if (a2 == -1)bw.write(String.valueOf(a1+"\n"));
			else bw.write(String.valueOf(a1 <= a2 ? a1 : a2));
		bw.flush();
	}


	private static long a(int start, int m1, int m2, int end) {
		// TODO Auto-generated method stub
		long a1 = d(1, m1);
		long a2 = d(m1, m2);
		long a3 = d(m2, N);
		return (a1 ==INF || a1 ==INF || a1 ==INF) ? -1 : a1+a2+a3;
	}


	private static long d(int start, int end) {
		// TODO Auto-generated method stub
		Arrays.fill(dist, INF);
		Arrays.fill(visit, 0);
		dist[start] = 0;
		
		for(int i=0; i<N; i++) {
			long min = Integer.MAX_VALUE;
			int from =0;
			
			for(int k=1; k<=N; k++) {
				if(visit[k]==0 && dist[k] <min){
					min = dist[k];
					from =k;
				}
			}
			visit[from] = 1;
			for(int to=1; to<=N; to++) {
				if(W[from][to] !=0) {
					if (dist[to] > dist[from] + W[from][to]) {
						dist[to] = dist[from] + W[from][to]; 
						}
				}
			}
			
		}
		return dist[end];
	}

	
}

/*
class Node{
	int V;
	int W;
	public Node(int V, int W) {
		// TODO Auto-generated constructor stub
		this.V = V;
		this.W = W;
	}
}*/