import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken()); //시간
		int m = Integer.parseInt(st.nextToken()); //b스킬시간
		
		dp = new int[10001];
		
		sol(n,m);
		
		System.out.println(dp[n]);
		
	}// main
	private static int sol(int n, int m) {
		if(n==0)return 1;
		
		else if(n<0)return 0;
		
		if(dp[n] !=0) {
			return dp[n];
		}
		else {
			return dp[n] = (sol(n-1, m) + sol(n-m, m)) %1000000007;
		}
	}
	
  }// class
  