import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	int N = Integer.parseInt(br.readLine());
	int arr[]= new int [N+1];
	int dp[] = new int[N+1];
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	for(int i=1; i<=N; i++) {
		arr[i]= Integer.parseInt(st.nextToken());
	}
	dp[0]=0;
	for(int i=1; i<=N; i++) {
		dp[i]=0;
		for(int j=1; j<=i; j++) {
			dp[i]=Math.max(dp[i],dp[i-j]+arr[j]);
		}
	}
	
	bw.write(String.valueOf(dp[N]));
	bw.flush();
	
	}
}