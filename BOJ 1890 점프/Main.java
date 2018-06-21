import java.io.BufferedReader;
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
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
		public static int N;
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		 N = Integer.parseInt(br.readLine());
		
		int arr[][] = new int[N+1][N+1];
		long dp[][] = new long[N+1][N+1];
		
		for(int i=0; i<N; i++) {
			StringTokenizer sy = new StringTokenizer(br.readLine());
			for(int j=0; j<N; j++) {
				arr[i][j] = Integer.parseInt(sy.nextToken());
			}
		}
		
		dp[0][0] =1;
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				if(i==N-1 && j==N-1)continue; // 마지막이면 벗어남
				int next = arr[i][j];
				if(i+next<N) {
					dp[i+next][j] +=dp[i][j];
				}
				if(j+next<N) {
					dp[i][j+next] +=dp[i][j];
				}
			}
		}
		bw.write(String.valueOf(dp[N-1][N-1]));
		bw.flush();
		
	}
}