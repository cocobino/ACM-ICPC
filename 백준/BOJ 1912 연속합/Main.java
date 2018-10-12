import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
    
   static int arr[];
   
    public static void main(String[] args) throws IOException {
    	int n = Integer.parseInt(br.readLine());
    	arr = new int[n+1];
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n; i++) {
    		arr[i] = Integer.parseInt(st.nextToken());
    	}//insert
    	
    	int dp[] = new int[n+1];
    	dp[0]=arr[0];
    	
    	long rst=dp[0];
    	for(int i=1; i<n; i++) {
    		dp[i] = Math.max(dp[i-1]+arr[i], arr[i]);
    		rst = Math.max(rst, dp[i]);
    	}
    	rst = Math.max(rst, dp[0]);
    	
    	bw.write(String.valueOf(rst));
    	bw.flush();

  
   }//main
   
}// class
  