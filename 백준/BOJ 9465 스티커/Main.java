import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static int r,c;
	static int map[][],adj[][];
	static boolean visit[][];
	
	static int dx[] = {0, 0, 1, -1,1, 1,-1,-1};
	static int dy[] = {1,-1, 0,  0,1,-1, 1,-1};
	
	
   public static void main(String[] args) throws NumberFormatException, IOException {
	   
	  int test_case = Integer.parseInt(br.readLine());
	  for(int i=0; i<test_case; i++) {
		  int n = Integer.parseInt(br.readLine());
		  
		  map = new int[2][n+1];
		  for(int j=0; j<2; j++) {
			  st = new StringTokenizer(br.readLine());
			  for(int k=1; k<=n; k++) {
				  map[j][k] = Integer.parseInt(st.nextToken());
			  }
		  }//insert
		  
		  int dp[][] = new int[2][n+1];
		  
		  dp[0][1]=map[0][1];
		  dp[1][1]=map[1][1];
		  
		  for(int j=2; j<=n; j++) {
			  dp[0][j] = Math.max(dp[1][j-1], dp[1][j-2])+map[0][j];
			  dp[1][j] = Math.max(dp[0][j-1], dp[0][j-2])+map[1][j];
		  }
		  
		  bw.write(String.valueOf(Math.max(dp[0][n], dp[1][n])));
		  bw.newLine();
		  bw.flush();
		  
	  }
	   
   }//main
 
}//class
 