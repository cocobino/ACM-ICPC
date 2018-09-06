import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	
	public static void main(String[] args) throws NumberFormatException, IOException { 

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));	
		int X = Integer.parseInt(br.readLine());
		int[] dp = new int[X+1];
		
		dp[0]=dp[1]=0;
		
		for(int i=2; i<=X; i++) {
			dp[i] = dp[i-1]+1; // 입력값의 -1은 미리계산해둔 이전최소값이 된다.
			if(i %2 ==0)dp[i] = Math.min(dp[i], dp[i/2]+1); //X-1 최소 연산 값과 현재값 X/3 에서 최소연산값을 비교
			if(i %3 ==0)dp[i] = Math.min(dp[i], dp[i/3]+1); //X-1 최소 연산 값과 현재값 X/2 에서 최소연산값을 비교
			
		}// 반복~
		System.out.println(dp[X]);
		
		
		
		
		}


	}
	
	
