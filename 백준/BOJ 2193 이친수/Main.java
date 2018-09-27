import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	 public static void main(String[] args) throws IOException {
		 int n = Integer.parseInt(br.readLine());
		 long dp[][] = new long[95][2];
		 
		 dp[1][0]=1;
		 dp[1][1]=1;
		 
		 for(int i=2; i<=n; i++) {
			 dp[i][0] = dp[i-1][0] + dp[i-1][1];
			 dp[i][1] = dp[i-1][0];
		 }
		 
		 bw.write(String.valueOf(dp[n][1]));
		 bw.flush();
	 			}
			}
