import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
  
   
    public static void main(String[] args) throws IOException {
    	int n  = Integer.parseInt(br.readLine());
    	
    	 int arr[] = new int[n];
    	 st = new StringTokenizer(br.readLine());
    	 
    	 for(int i=0; i<n; i++) {
    		 arr[i]  = Integer.parseInt(st.nextToken());
    	 }//insert
    	 
    	int dp[] = new int[n];
    	Arrays.fill(dp, 1);
    	
    	for(int i=1; i<n; i++	) {
    		for(int j=0; j<i; j++	) {
    			if(arr[i] > arr[j] && dp[i] <dp[j]+1) {
    				dp[i] = dp[j]+1;
    			}
    		}
    	}
    	 
    	int ans =0;
    	for(int i=0; i<n; i++) {
    		ans = Math.max(ans, dp[i]);
    	}
    	bw.write(String.valueOf(ans));
    	
    	bw.flush();
    	
	}// main
}//class