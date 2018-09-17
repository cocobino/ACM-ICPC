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

	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
		 n = Integer.parseInt(br.readLine());
		 StringTokenizer st= new StringTokenizer(br.readLine());
		 map = new int[n];
		 visit = new boolean[10001];
		 int limit=0;
		 for(int i=0; i<n; i++) {
			 map[i] = Integer.parseInt(st.nextToken());
			 limit +=map[i];
		 }//insert
		 
		 visit[0] =true;
		 for(int i=0; i<n; i++) {
			 for(int j=limit; j>=0; j--) {
				 if(visit[j]) {
					 visit[j+map[i]]=true;
				 }
			 }
		 }
		 int cnt=0;
		 for(int i=0; i<10001; i++) {
			 if(visit[i])cnt++;
		 }
		 
		 bw.write(String.valueOf("#"+tc+" "+cnt+"\n"));
		 bw.flush();
		 }//test_case
	}//main

 


}
 
