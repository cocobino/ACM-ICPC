import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
 
public class Solution {
		
	static int n;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=1; T<=test_case; T++) {
    	 n = Integer.parseInt(br.readLine())+1;
    	 int arr[][] = new int[n][];
    	 for(int i=0; i<n; i++) {
    		 arr[i] = new int[i+1];
    	 }
    	 
    	 
    	 bw.write(String.valueOf("#"+T));
    	  for(int i=0; i<n; i++) {
    		  for(int j=0; j<i; j++) {
    			  arr[i][j]=1;
    			  
    			  if(i>1 && j>=1 && j < i-1)arr[i][j] = arr[i-1][j-1]+arr[i-1][j];
    			  bw.write(String.valueOf(arr[i][j]+" "));
    			  bw.flush();
    		  }
    		  bw.write(String.valueOf("\n"));
    		  
    	  }
    		bw.flush();
    	}//test-case

	}//main

	 
}