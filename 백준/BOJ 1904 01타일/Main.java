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
		dp[1] = 1;
		dp[2] = 2;
		
		if(n>2) {
			for(int i=3; i<=n; i++) {
			dp[i] = (dp[i-1]+dp[i-2]);
			
			dp[i]%=15746;
			}
			
			System.out.println(dp[n]);
		}else {
			System.out.println(dp[n]);
		}
		
		
	}// main
}// class
