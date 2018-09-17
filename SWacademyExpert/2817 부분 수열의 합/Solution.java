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
	
	static int n,m;
	static int map[];
	static boolean visit[];
	static int cnt;
	static HashSet<Integer> duple[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {

		 StringTokenizer st= new StringTokenizer(br.readLine());
		 n = Integer.parseInt(st.nextToken()); //n 개 자연수
		 m = Integer.parseInt(st.nextToken()); //k 
		 cnt=0;
		 map = new int[n];
		 visit = new boolean[n];
		 duple = new HashSet[n];
		 for(int i=0; i<n; i++)duple[i] = new HashSet<>();
		 
		 st= new StringTokenizer(br.readLine());
		 for(int i=0; i<n; i++) {
			 map[i] = Integer.parseInt(st.nextToken());
		 }//insert
		 
		 for(int i=0; i<n; i++)dfs(i,map[i]);
		 
		 bw.write(String.valueOf("#"+tc+" "+cnt+"\n"));
		 bw.flush();
		 }//test_case
	}//main


	private static void dfs(int cur, int sum) {
		// TODO Auto-generated method stub
		if(sum==m) {
			cnt++; 
			}

		
		
		visit[cur]= true;
		
		for(int i=cur+1; i<n; i++) {
			if(!visit[i])dfs(i,sum+map[i]);
		}
		visit[cur]=false;
	}

 


}
 
