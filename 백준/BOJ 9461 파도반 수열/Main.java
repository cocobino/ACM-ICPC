import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	static int n;
 	static boolean visit[];
	static long dp[];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int test_case  = Integer.parseInt(br.readLine());
		dp = new long[200];
		dp[1]=1;
		dp[2]=1;
		dp[3]=1;
		
		for(int i=3; i<=150; i++) {
			dp[i] = dp[i-3]+dp[i-2];
		}
		
		for(int T=0; T<test_case; T++) {
			n = Integer.parseInt(br.readLine());
			
			bw.write(String.valueOf(dp[n]+"\n"));
			bw.flush();
		}//test_case
		
		
	}//main

	 
	
 
}//class   