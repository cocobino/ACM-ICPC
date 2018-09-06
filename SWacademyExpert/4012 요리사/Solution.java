import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
 
public class Solution {
		static int n,answer,rst;
		static boolean visit[] = new boolean[16];
		static int map[][]= new int[16][16];
		
		 
		
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=0; T<test_case; T++) {
    	rst=Integer.MAX_VALUE;
    	n = Integer.parseInt(br.readLine());
    	
    	
    	for(int i=0; i<n; i++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int j=0; j<n; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}//insert
    	
      
    	dfs(0,1);
    		
    	bw.write(String.valueOf("#"+(T+1)+" "+rst+"\n"));
    	bw.flush();
    	}//test_case
    	
    	
	}// main

	private static void dfs(int cur, int cnt) {
		// TODO Auto-generated method stub
		visit[cur]=true;
		if(cnt == n/2) {
		rst = Math.min(rst, getResult());	
		}
		else {
			for(int i=cur+1; i<n; i++) {
				dfs(i,cnt+1);
			}
		}
		visit[cur]=false;
	}

	private static int getResult() {
		// TODO Auto-generated method stub
		LinkedList<Integer> a = new LinkedList<>();
		LinkedList<Integer> b = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			if(visit[i])a.push(i);
			else b.push(i);
		}
		return Math.abs(cal(a)-cal(b));
	}

	private static int cal(LinkedList<Integer> a) {
		// TODO Auto-generated method stub
		int ans =0;
		for(int i=0; i<n/2; i++) {
			for(int j=0; j<n/2; j++) {
				if(i==j)continue;
				ans += map[a.get(i)][a.get(j)];
			}
		}
		return ans;
	}
 
 
}