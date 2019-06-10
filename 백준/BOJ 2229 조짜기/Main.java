import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n+1];
		int dp[] = new int[n+1];
		
		st= new StringTokenizer(br.readLine());
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
			
			int min = 10001;
			int max = 0;
			
			for(int j=i; j>0; j--) {
				max = Math.max(max, arr[j]);
				min = Math.min(min, arr[j]);
				
				dp[i] = Math.max(dp[i], max-min + dp[j-1]);
			}
		}//insert
		
	 System.out.println(dp[n]);
		
	}// main
 
	 

}// class
 