import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Constructor;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int[] map;
	static int[] vis;
	static int n, rst;
	static boolean flag =false;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		n=  Integer.parseInt(br.readLine());
		
		map = new int[n+1];
		vis = new int[n+1];
		
		st = new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			map[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		int start = Integer.parseInt(st.nextToken());
		int end = Integer.parseInt(st.nextToken());
		
		bfs(start, end);
		
		System.out.println(flag ? rst : -1);
	}

	private static void bfs(int start, int end) {
		Queue<Node> q = new LinkedList();
		Arrays.fill(vis, 0);
		q.add(new Node(start, 0));
		vis[start] = 1;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			if(cur.cur == end) {
				rst = cur.dist;
				flag =true;
			}
			
			int c = cur.cur;
			int dist = cur.dist;
			
			for(int i=1; c+(map[c] * i) <= n; i++) {
				int ncur = c + map[c]*i;
				if(vis[ncur] ==0) {
					vis[ncur]= 1;
					q.add(new Node(ncur, dist+1));
				}
			}
			
			for(int i=1; c - (map[c]*i) >= 1; i++) {
				int ncur = c - map[c]*i;
				if(vis[ncur] == 0) {
					vis[ncur] = 1;
					q.add(new Node(ncur, dist+1));
				}
			}
		}
		 
	}

}

class Node {
		int cur, dist;
		public Node(int cur, int dist) {
			this.cur =cur;
			this.dist =dist;
		}
}