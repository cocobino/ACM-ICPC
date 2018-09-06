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
    		int arr[] = new int[10];
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int i=0; i<10; i++) {
    			arr[i] =Integer.parseInt(st.nextToken());
    		}
    		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
    		for(int i=0; i<10; i++) {
    			max = Math.max(max, arr[i]);
    			min = Math.min(min, arr[i]);
    		}
    		for(int i=0; i<10; i++)if(arr[i]==max) {arr[i]=0;break;}
    		for(int i=0; i<10; i++)if(arr[i]==min) {arr[i]=0;break;}
    		double rst=0;
    		
    		for(int i=0; i<10; i++) {
    		rst +=arr[i];	
    		}
    		rst/=8;
    		
    		bw.write(String.valueOf("#"+T+" "+Math.round(rst)+"\n"));
    		bw.flush();
    		
    	}//test-case

	}//main

	 
}