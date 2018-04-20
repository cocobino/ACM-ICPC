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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		int test_case = Integer.parseInt(br.readLine());
		int[] stair = new int[test_case+1];
		int[] dp = new int[test_case+1];
		int cnt=0;
		for(int i=1; i<=test_case; i++) {
			stair[i] = Integer.parseInt(br.readLine());
		}
		
		
		dp[1] = stair[1];
		if(test_case>=2) dp[2] = dp[1]+stair[2];
		
		for(int i=3; i<=test_case; i++) {
			
			dp[i] = max(dp[i-2]+stair[i], dp[i-3]+stair[i-1]+stair[i]);
			
			}
			System.out.println(dp[test_case]);
		}
		

	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		if(i>j)
		return i;
		else return j;
	}

	}
	
	
