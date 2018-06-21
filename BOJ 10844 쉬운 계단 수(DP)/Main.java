import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException { 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test_case = Integer.parseInt(br.readLine());
		int[][] dp = new int[test_case+1][10];
		int d = 1000000000, result= 0;
		
		// dp[n][j] = dp[n-1][j-1]+ dp[n-1][j+1];
		
		
		// 1의자리는 1~9 까지 1값
		for(int i=1; i<=9; i++) {
			dp[1][i] = 1;
		}
		//dp 표 작성
		for(int i=2; i<=test_case; i++) {
			for(int j=0; j<=9; j++) {
				if(j==0) dp[i][j] = dp[i-1][j+1];
				else if(j==9) dp[i][j] = dp[i-1][j-1];
				else dp[i][j] = dp[i-1][j-1] + dp[i-1][j+1];
				
				dp[i][j] %= d;
			}
			}
		
		// 정답출력
		for(int i=0; i<=9; i++) {
			result += dp[test_case][i]%d;
		}
		System.out.println(result% 1000000000);
				
		
		
		
		}


	}
	
	
