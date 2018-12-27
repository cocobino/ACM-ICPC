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
 
	static int n;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static int m=Integer.MAX_VALUE;
	static int map[][];
	static boolean visit[];
	static LinkedList<Integer> rst = new LinkedList<>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
		
	  n = Integer.parseInt(br.readLine());
		
		map = new int[11][11];
		visit =new boolean[11];
		
	  for(int i=0; i<n; i++) {
		  st = new StringTokenizer(br.readLine());
		  for(int j=0; j<n; j++) {
			 map[i][j] = Integer.parseInt(st.nextToken());
		  }
	  }//insert
	  
	  
	  for(int i=0; i<n; i++) {
		  dfs(i,i,0,0);
	  }
		  
	  bw.write(String.valueOf(m));
	  bw.flush();
		   
		
		
	}//main

	private static void dfs(int start, int y, int sum, int cnt) {
		// TODO Auto-generated method stub
		if(cnt==n && start==y) {
			if(m>sum)m=sum;
			return;
		}
		
		for(int i=0; i<n; i++) {
			if(map[y][i]==0)continue;
			
			if(!visit[y]&&map[y][i]>0) {
				visit[y]=true;
				sum+=map[y][i];
				
				if(sum <= m) {
					dfs(start, i, sum, cnt+1);
				}
				
				visit[y]=false;
				sum -=map[y][i];
			}
		}
		
	}
	 

}//class   