import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static ArrayList<Node> map[];
	static int dist[];
	static int n;
	static int max=0;
	static int start;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		n = Integer.parseInt(br.readLine());
		if(n==1) System.out.println(0);
		else {
		map = new ArrayList[10001];
		dist = new int[10001];
		
		for(int i=1; i<=10000; i++) map[i] = new ArrayList<Node>();
		
		for(int i=0; i<n-1; i++) {
			st =  new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int dist = Integer.parseInt(st.nextToken());
			
			map[from].add(new Node(to, dist));
			map[to].add(new Node(from, dist));
		}
		
		dist[1] = 1;
		dfs(1,0);
		
		
		dist = new int[10001];
		dist[start] = 1;
		
		dfs(start, 0);
		System.out.println(max);
		}
	}
	

	private static void dfs(int cur, int d) {
		
		
		if(d > max) {
			max = d;
			start = cur;
		}
		
		/*
		for(int i=0; i<=map[cur].size(); i++) {
			int nxt = map[cur].get(i).to;
			int weight = map[cur].get(i).dist;
			
			if(dist[nxt] == 0) {
				dfs(nxt, d+weight);
			}
		}
		*/
		for(Node node : map[cur]) {
			int nxt = node.to;
			int weight = node.dist;
			
			if(dist[nxt] == 0) {
				dist[nxt] = 1;
				dfs(nxt, d+weight);
			}
		}
		
	}
}

class Node {
	int to, dist;

	public Node(int to, int dist) {
		this.to = to;
		this.dist = dist;
	}
}