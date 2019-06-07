import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int tc = Integer.parseInt(br.readLine());
		long dp[][] = new long[65][10];
		
		
		
		for(int t=0; t<tc; t++) {
			
		 int n = Integer.parseInt(br.readLine());
		 
		 //1ÀÇÀÚ¸®
		 for(int i=0; i<10; i++) {
			 dp[1][i]=i+1;
		 }
		 for(int i=2; i<=n; i++) {
			 dp[i][0] = 1;
			 for(int j=1; j<10; j++) {
				 dp[i][j] =dp[i-1][j] + dp[i][j-1];
			 }
		 }
		 	
		 System.out.println(dp[n][9]);
		 
		}// for loop 
		
	}// main

	 
}// class
