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
	
	
	static int dx[] = {1,1,-1,-1};
	static int dy[] = {1,-1,1,-1};
	
	static int map[][],colors[][];
	static boolean visit[]= new boolean[100];
	static int[] ans = new int[2];
	
	static int n;
	
	 public static void main(String[] args) throws IOException {
		 
		 n = Integer.parseInt(br.readLine());
		 
		 for(int T=1; T<=n; T++) {
			 ArrayList<Integer> arr = new ArrayList<>();
			 
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 for(int i=0;st.hasMoreTokens(); i++) {
			 arr.add(Integer.parseInt(st.nextToken()));
			 }
			 
			 Collections.sort(arr);
			 
			 int sum=0;
			 int min = Integer.MAX_VALUE;
			 for(int i=0; i<arr.size(); i++) {
				 if(arr.get(i) %2 ==0) {
					 sum +=arr.get(i);
					 min = Math.min(min, arr.get(i));
				 }
			 }
			 
			 bw.write(String.valueOf(sum +" "+ min+"\n"));
			 bw.flush();
			 
		 }
 	 
	 
	 }//main

 
}// class
 