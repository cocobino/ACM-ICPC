import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
		/*
		 * 1-> 1 돌아왔을때 T 값이 음수 
		 */
		public static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int line = Integer.parseInt(br.readLine());
		int [][] table = new int[line+1][3];
		int dp[][] = new int [line+1][3];
		
		for(int i=1; i<=line; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			for(int j=0; j<3; j++) {
				table[i][j]=Integer.parseInt(st.nextToken());
			}
		}
			dp[1][0] = table[1][0];
			dp[1][1] = table[1][1];
			dp[1][2] = table[1][2];
		
		for(int i=1; i<=line; i++) {
			dp[i][0]=Math.max(dp[i-1][0], dp[i-1][1])+table[i][0];
			dp[i][1]=Math.max(max(dp[i-1][0], dp[i-1][1]), dp[i-1][2])+table[i][1];
			dp[i][2]=Math.max(dp[i-1][1], dp[i-1][2])+table[i][2];
		}
		bw.write(String.valueOf(Math.max(max(dp[line][0], dp[line][1]), dp[line][2])+" "));	
			
		for(int i=1; i<=line; i++) {
			dp[i][0]=Math.min(dp[i-1][0], dp[i-1][1])+table[i][0];
			dp[i][1]=Math.min(min(dp[i-1][0], dp[i-1][1]), dp[i-1][2])+table[i][1];
			dp[i][2]=Math.min(dp[i-1][1], dp[i-1][2])+table[i][2];
		}
		bw.write(String.valueOf(Math.min(min(dp[line][0], dp[line][1]), dp[line][2])+"\n"));
		
		
		
		bw.flush();
		
		
	}
	private static int max(int i, int j) {
		// TODO Auto-generated method stub
		return i>j ? i : j;
	}
	private static int min(int i, int j) {
		// TODO Auto-generated method stub
		return i>j ? j : i;
	}
}