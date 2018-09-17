import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static LinkedList map[];
	static int n,m;
	static boolean visit[];
	static int max=0;
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			n = Integer.parseInt(st.nextToken()); //정점개수
			m = Integer.parseInt(st.nextToken()); //간선의 개수
			
			map = new LinkedList[n];
			//visit= new boolean[n];
			
			for(int i=0; i<n; i++)map[i] = new LinkedList<Integer>();
			
			for(int i=0; i<m; i++) {
				st= new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken())-1;
				int b = Integer.parseInt(st.nextToken())-1;
				
				map[a].add(b);
				map[b].add(a);
			}//insert
			
			
			max=0;
			for(int i=0; i<n; i++){
				//노드 1칸씩 탐방
				visit= new boolean[n];
				dfs(i,1);
			}//i
			
		  bw.write(String.valueOf("#"+tc+" "+max+"\n"));
		  bw.flush();
		  
		  
		  
		 }//test_case
	}//main

	private static void dfs(int cur, int depth) {
		// TODO Auto-generated method stub
		if(max<depth) {
			max = depth;
		}
 
		visit[cur] = true;
		
		for(int i=0; i<map[cur].size(); i++) {
			if(!visit[(int)map[cur].get(i)]) {
				dfs((int)map[cur].get(i), depth+1);
			}
		}
		
		visit[cur]=false;
	}
	 
}
 
