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
		
	static int n,k,max=0;
	static int map[][];
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());

    	for(int T=1; T<=test_case; T++) {
    		 StringTokenizer st = new StringTokenizer(br.readLine());
    		  n = Integer.parseInt(st.nextToken());//음식수
    		  k = Integer.parseInt(st.nextToken());//제한칼로리
    		map = new int[n+1][2];
    		
    		 for(int i=0; i<n; i++) {
    			 st = new StringTokenizer(br.readLine());
    			 int score = Integer.parseInt(st.nextToken());
    			 int cal = Integer.parseInt(st.nextToken());
    			 map[i][0]=score;
    			 map[i][1]=cal;
    		 }//insert
    		 
    		 
    		 max=0;
    		 
    		 
    		 dfs(0,0,0);
    		 
    		 
    		 System.out.println("#"+T+" "+max);
    		 
    		
    	}//test-case
    		
    	}//main func

	private static void dfs(int cur, int s, int m) {
		// TODO Auto-generated method stub
		if(m>k)return;
		if(cur==n) {
			max = Math.max(max, s);
			return;
		}
		dfs(cur+1, s+map[cur][0],m+map[cur][1]);
		dfs(cur+1, s,m);
	}

	}//class

	 
