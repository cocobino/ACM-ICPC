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
   
   
    public static void main(String[] args) throws IOException {
    	
    	int n = Integer.parseInt(br.readLine());
    	int dp[][] = new int[n+1][3];
    	
    	dp[1][0]=1;dp[1][1]=1;dp[1][2]=1;
    	for(int i=2; i<=n; i++) {
    		dp[i][0] = (dp[i-1][0] + dp[i-1][1] + dp[i-1][2])%9901;
    		dp[i][1] = (dp[i-1][0] + dp[i-1][2])%9901;
    		dp[i][2] = (dp[i-1][0] + dp[i-1][1])%9901;
    	}
    	
    	int rst = 0;
    			for(int i=0; i<3; i++) {
    			rst+=dp[n][i];
    			}
    			
    			bw.write(String.valueOf(rst%9901));
    			bw.flush();
    	
	}// main
    
}//class

