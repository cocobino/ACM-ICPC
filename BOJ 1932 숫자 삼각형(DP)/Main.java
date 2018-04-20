import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException { 

		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		Scanner sc = new Scanner(System.in);
		
		int max= 0;
		int T = sc.nextInt();
		int[][] tr = new int[T+1][T+1];
		int[][] dp = new int[T+1][T+1];
		for(int i=0; i<T; i++) {
				for(int j=0; j<=i;j++) {
					tr[i][j] = sc.nextInt();
				}
		}
			dp[0][0] = tr[0][0];
	
		// 계산 누적치를 dp 에저장
		for(int i=0; i<T-1; i++) {
			for(int j=0; j<=i; j++) {
				
				if(dp[i+1][j]<dp[i][j] + tr[i+1][j]) {
					dp[i+1][j] = dp[i][j]+tr[i+1][j]; //왼쪽 값
				}
				if(dp[i+1][j+1]<dp[i][j]+tr[i+1][j+1]) {
					dp[i+1][j+1] = dp[i][j] + tr[i+1][j+1]; //오른쪽
				}
				
			}
		}
		for(int i=0; i<T; i++) {
			if(dp[T-1][i] > max) max = dp[T-1][i];
		}
		
		System.out.println(max);
		
		}

	}
	
	
