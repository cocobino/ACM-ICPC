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
		
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=1; T<=test_case; T++) {
    		int n = Integer.parseInt(br.readLine());
    		int sum=0;
    		for(int i=0; i<=n; i++) {
    		if(i%2==0)sum-=i;
    		else sum +=i;
    		}
    		bw.write(String.valueOf("#"+T+" "+sum+"\n"));
    		bw.flush();
    	}//test-case

	}//main

	 
}