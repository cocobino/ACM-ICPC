import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int arr[];
	static int n, s;

	public static void main(String[] args) throws Exception {

//		int test_case = Integer.parseInt(br.readLine());
//		
//		for(int T=0; T<test_case; T++) {
	 
			n = Integer.parseInt(br.readLine());
			
			arr = new int [10001];
			st = new StringTokenizer(br.readLine());
			for(int i=1; i<=n; i++) {
				arr[i] =Integer.parseInt(st.nextToken());
			}//insert
			
			int dp[] = new int[10001];
			dp[1]=1;
			int max=1;
			for(int i=2; i<=n; i++) {
				dp[i]=1;
				for(int j=i; j>=0; j--) {
					if(arr[i]>arr[j]) {
						dp[i] = Math.max(dp[i], dp[j]+1);
					}
				}
				
				max = Math.max(max, dp[i]);
			}
			bw.write(String.valueOf(max));
			bw.flush();
			
		//} // test_case

	}// main

}// class
 