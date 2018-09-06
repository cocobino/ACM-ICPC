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

    	 int n = Integer.parseInt(br.readLine());
    	 
    	 int arr[] =new int[n];
    	 for(int i=0; i<n; i++) {
    		 arr[i] = Integer.parseInt(br.readLine());
    	 }
    	 int ans =0;
    	 for(int i=0; i<n; i++) {
    		 ans +=arr[i]-1;
    	 }
    	 bw.write(String.valueOf(ans+1));
    	 bw.flush();
    	 
 	}
 }

