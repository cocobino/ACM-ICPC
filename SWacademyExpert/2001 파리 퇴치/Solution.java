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
		
	static int n,m;
	static int map[][];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=1; T<=test_case; T++) {
    		StringTokenizer st= new StringTokenizer(br.readLine());
    		n = Integer.parseInt(st.nextToken()); //NxN
    		m = Integer.parseInt(st.nextToken()); //파리채크기
    		
    		map = new int[n][n];
    		
    		for(int i=0; i<n; i++) {
    			st= new StringTokenizer(br.readLine());
    			for(int j=0; j<n; j++) {
    				map[i][j] = Integer.parseInt(st.nextToken());
    			}
    		}//insert
    		int max = Integer.MIN_VALUE;
    		int sum;
    		for(int i=0; i<n; i++) {
    			for(int j=0; j<n; j++) {
    				//전체맵중에서
    				sum=0;
    				for(int k=i; k<i+m; k++) {
    					for(int l=j; l<j+m; l++) {
    						if(k>=n || l>=n)continue;
    						sum += map[k][l];
    					}
    				}
    				
    				max = Math.max(max, sum);
    				
    			}
    		}
    		
    		bw.write(String.valueOf("#"+T+" "+max+"\n"));
    		bw.flush();
    	}//test-case

	}//main

	 
}