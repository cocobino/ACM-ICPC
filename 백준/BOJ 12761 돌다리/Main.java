import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	 
	static boolean visit[] = new boolean[100001];
	static Queue<Node> q = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		st =new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int n = Integer.parseInt(st.nextToken()); // 동규
		int m = Integer.parseInt(st.nextToken()); // 주미
		 
		q.add(new Node(n,0));
		visit[n]=true;
		int rst =100000;
		int cnt=0;
		int dx[] = { 1,-1,a,b,-a,-b,a,b };
		
		while(!q.isEmpty()) {
			cnt++;
			Node cur = q.poll();
			//debug
			int curpos = cur.now;
			int curcnt = cur.cnt;
			//end option
			if(cur.now == m) {
			rst = Math.min(rst, cur.cnt);
			break;
			}
 
			int nxt;
			for(int i=0; i<8; i++) {
				if(i>=6)nxt = curpos *dx[i];
				else nxt = curpos+dx[i];
				
				if(nxt>=0 && nxt<=100000) {
					if(!visit[nxt]) {
						q.add(new Node(nxt,curcnt+1));
						visit[nxt]=true;
					}
				}
			}
	 
		}//bfs
		
		
	bw.write(String.valueOf(rst));
	bw.flush();
	bw.close();
	br.close();
		
	 
	}//main
		
	 	
		
}// class

class Node{
	int now,cnt;
	public Node(int now, int cnt) {
		// TODO Auto-generated constructor stub
		this.now=now;
		this.cnt=cnt;
	}
}