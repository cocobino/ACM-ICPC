import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	//static char map[][];
	static int n;
	
					//©Л, аб, го, ╩С
	static int dx[] = {0,0,1,-1,1,1,-1,-1,0};
	static int dy[] = {1,-1,0,0,1,-1,-1,1,0};
	
	static long b;
	static String a;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 st = new StringTokenizer(br.readLine());
		 a = st.nextToken();
		 b = Long.parseLong(st.nextToken());
		 
		 Node start = new Node(a,0);
		 
		 Queue<Node> q = new LinkedList<>();
		 q.add(start);
		 long rst=Long.MAX_VALUE;
		 while(!q.isEmpty()) {
			 Node cur  = q.poll();
			String curNum = cur.cur;
			 //end option
			 if(Long.parseLong(cur.cur) == b) {
				 rst= Math.min(rst,cur.cnt);
			 }
			 
			 if(Long.parseLong(cur.cur)>b)continue;
			 
			 q.add(new Node(cur.cur+1, cur.cnt+1));
			 
			 q.add(new Node(Long.toString(Long.parseLong(cur.cur)*2), cur.cnt+1));
			 
		 }//while loop : bfs
			 if(rst==Long.MAX_VALUE)bw.write(String.valueOf(-1));
			 else bw.write(String.valueOf(rst+1));
			 bw.flush();
			 
		
	}//main

  
 
  
}//class
 
class Node{
	String cur;
	int cnt;
	public Node(String cur, int cnt) {
		this.cur = cur;
		this.cnt = cnt;
	}
	
}