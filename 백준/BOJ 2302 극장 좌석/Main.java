import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int dp[] = new int[n+1];
		
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2; i<=n; i++) {
			dp[i] = dp[i-1] + dp[i-2];
		}
		
		int m = Integer.parseInt(br.readLine());
		
		
		int cur= 0;
		int sum=1;
		
		for(int i=0; i<m; i++) {
			int tmp = Integer.parseInt(br.readLine());
			
			sum *= dp[tmp -cur-1];
			cur = tmp;
		}//insert
		
		sum *=dp[n-cur];
			
		System.out.println(sum);
		
		
				
	}// main

	 
}// class
