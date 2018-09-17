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
	
	static int n;
	static int map[];
	static boolean visit[];

	static HashSet<Integer> duple;
 
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
		 n = Integer.parseInt(br.readLine());
		 StringTokenizer st= new StringTokenizer(br.readLine());
		 map = new int[n];
		 visit = new boolean[n];
		 duple = new HashSet<>();
		 
		 for(int i=0;i<n;i++)map[i]=Integer.parseInt(st.nextToken());
			
		 
			 dfs(0);
		 
		 
		 bw.write(String.valueOf("#"+tc+" "+(duple.size()+1)+"\n"));
		 bw.flush();
		 
		 
		 
		 }//test_case
	}//main


	private static void dfs(int cur) {
		// TODO Auto-generated method stub
		visit[cur]=true;
		
		int total=0;
		for(int i=0; i<n; i++) {
			if(visit[i])total+=map[i];
		}
		duple.add(total);
		
		for(int i=0; i<n; i++) {
			if(!visit[i])dfs(i);
		}
		
		visit[cur]=false;
	}


}
 
