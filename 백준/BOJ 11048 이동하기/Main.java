import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
 
 

public class Main {
	
	
	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	 StringTokenizer st = new StringTokenizer(br.readLine());
    	 
    	 int r = Integer.parseInt(st.nextToken());
    	 int c = Integer.parseInt(st.nextToken());
    	 
    	 int arr[][] = new int[r+1][c+1];
    	 int ans=0;
    	 for(int i=1; i<=r; i++) {
    		 st = new StringTokenizer(br.readLine());
    		 for(int j=1; j<=c; j++) {
    			 arr[i][j] = Integer.parseInt(st.nextToken());
    			
    		 }
    	 }
    	int dp[][] = new int[r+1][c+1];
    	 for(int i=1; i<=r; i++) {
    		 for(int j=1; j<=c; j++) {
    			 dp[i][j] = Math.max(dp[i-1][j], dp[i][j-1])+arr[i][j];
    		 }
    	 }
    	 bw.write(String.valueOf(dp[r][c]));
    	 bw.flush();
    	 
 	}
 }


    		 ans += arr[i];
    	 }
    	 bw.write(String.valueOf(ans%10));
    	 
    	 bw.flush();
    	 
 	}
 }

