import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	
	static int n;
	
	static boolean visit[];
	static Node[] map;
	static Queue<Integer> q =new LinkedList<>();
	static int cnt;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	  n = Integer.parseInt(br.readLine());
	  
	   map =new Node[n+1];
	   visit = new boolean[n+1];
	   
	  map[0] = new Node(0,0,0,0);
	  
	  for(int i=1; i<=n; i++) {
		  st= new StringTokenizer(br.readLine());
		  int x1 = Integer.parseInt(st.nextToken());
          int y1 = Integer.parseInt(st.nextToken());
          int x2 = Integer.parseInt(st.nextToken());
          int y2 = Integer.parseInt(st.nextToken());
          map[i] = new Node(x1, y1, x2, y2); 
	  }
	 
  for(int i=0; i<=n; i++) {
	  if(visit[i])continue;
	  
	  visit[i] =true;
	  q.add(i);
	  
	  while(!q.isEmpty()) {
		  int cur = q.poll();
		  
		  for(int j=0; j<=n; j++){
			  if(cur ==j || !check(cur,j) || visit[j])
				  continue;
			  
			  visit[j]=true;
			  q.add(j);
		  }
	  }
	  cnt++;
  }
	bw.write(String.valueOf(cnt-1));
	bw.flush();
  
	}//main

	private static boolean check(int cur, int next) {
		// TODO Auto-generated method stub
		Node c = map[cur];
		Node n = map[next];
		
		 if((c.x1 < n.x1 && n.x2 < c.x2 && c.y1 < n.y1 && n.y2 < c.y2)
	     || (c.x1 > n.x1 && n.x2 > c.x2 && c.y1 > n.y1 && n.y2 > c.y2) 
	      || c.x2 < n.x1 || c.x1 > n.x2 || c.y2 < n.y1 || c.y1 > n.y2 )
	            return false;
	        
	        return true;
	}
  
}//class

class Node{
	int x1,y1,x2,y2;
	public Node(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated constructor stub
		this.x1=x1;
		this.y1=y1;
		this.x2=x2;
		this.y2=y2;
	}
}