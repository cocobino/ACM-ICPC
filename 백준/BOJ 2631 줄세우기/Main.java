import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
static int max = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	 int n = Integer.parseInt(br.readLine());
	 int arr[] = new int[n];
	 int dp[] = new int[n];
	 
	 for(int i=0; i<n; i++) {
		 arr[i] = Integer.parseInt(br.readLine());
		 
	 }//insert
	 dp[0]=1;
	 int max=0;
	 for(int i=1; i<n; i++) {
		 dp[i] =1;
		 for(int j=0; j<i; j++) {
			 if(arr[j]<arr[i] && dp[j]+1 > dp[i]) {
					 dp[i] = dp[j]+1;
			 }
		 }
	 }
	 
	 for(int i=0; i<n; i++)max = Math.max(max, dp[i]);

	System.out.println(n-max);
	 
		
	}// main
 
 

}// class
 