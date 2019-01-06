import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
 
   static int r,c,k,sum,cnt;
  // static int x1,y1,x2,y2;
   static long dp[][] = new long[1001][1001];
   
   public static void main(String[] args) throws IOException {
	   st =new StringTokenizer(br.readLine());
	   r = Integer.parseInt(st.nextToken());
	   c = Integer.parseInt(st.nextToken());
	   k = Integer.parseInt(st.nextToken());
	   
	   
	  for(int i=1; i<=r; i++) {
		  st =new StringTokenizer(br.readLine());
		  for(int j=1; j<=c; j++) {
			int tmp = Integer.parseInt(st.nextToken());
			  dp[i][j] = dp[i-1][j] + dp[i][j-1]-dp[i-1][j-1]+tmp;
		  }
	  }
	   
	   for(int t=0; t<k; t++) {
		   st = new StringTokenizer(br.readLine());
			int r1 = Integer.parseInt(st.nextToken());
			int c1 = Integer.parseInt(st.nextToken());
			int r2 = Integer.parseInt(st.nextToken());
			int c2 = Integer.parseInt(st.nextToken());
			
			long sum = dp[r2][c2] - dp[r1 - 1][c2] - dp[r2][c1 - 1] + dp[r1 - 1][c1 - 1];
			int n = (r2 - r1 + 1) * (c2 - c1 + 1);
		  bw.write(String.valueOf(sum/n));
		   bw.newLine();
		   bw.flush();
		   
	   }
	   
	   
     
	}// main

	 
	
 
}//class

