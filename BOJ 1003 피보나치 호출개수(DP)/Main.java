import java.util.Scanner; 
public class Main {
	
	public static void main(String[] args) { 
		Scanner sc = new Scanner(System.in); 
		int T = sc.nextInt(); 
		int[][] dp = new int[41][2];
		dp[0][0] = 1; dp[1][1] = 1; 
		
		for (int i = 0; i < T; i++) {
			fibonacciPrint(dp, sc.nextInt());
			} sc.close();
			} 
	
	public static void fibonacciPrint(int[][] dp, int n) {
		if (n >= 2 && dp[n][0] == 0 && dp[n][1] == 0) {
			
			for (int i = 2; i <= n; i++) { 
				dp[i][0] = dp[i - 1][0] + dp[i - 2][0];
				dp[i][1] = dp[i - 1][1] + dp[i - 2][1];
				
			} 
			}
		System.out.println(dp[n][0]+" "+ dp[n][1]);
		
	} 
	}