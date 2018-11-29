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
    	
    	st = new StringTokenizer(br.readLine());
    	int n = Integer.parseInt(st.nextToken()); //n가지의 종류
    	int k = Integer.parseInt(st.nextToken()); //k원 목표
    	int[] coin = new int[n];
    	
    	for(int i=0; i<n; i++) {
    	coin[i] = Integer.parseInt(br.readLine());
    	}//insert
    	 
    	int dp[] = new int[k+1];
    	dp[0]=1;
    	
    	for(int i=0; i<n; i++) {
    		for(int j=1; j<=k; j++) {
    			
    			if(j-coin[i]>=0	) {
    				dp[j] = dp[j] + dp[j-coin[i]];
    			}
    			
    		}
    	}//sol
    	
    	bw.write(String.valueOf(dp[k]));
    	bw.flush();
    	
    	
    	
	}// main


	 
	
    
}//class

