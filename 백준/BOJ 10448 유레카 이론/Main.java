

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	static int n;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static boolean visit[] = new boolean[4001];
	static int samgak[] = new int[51];
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 int n = Integer.parseInt(br.readLine());
	 
	 for(int i=1;i<=45;i++) {
		 int sum = (i*(i+1))/2;
		 samgak[i]=sum;
	 }
	 for(int i=1; i<=45; i++) {
		 for(int j=1; j<=45; j++) {
			 for(int k=1; k<=45; k++) {
				visit[samgak[i]+samgak[j]+samgak[k]]=true;
			 }
		 }
	 }
	 
	 for(int i=0; i<n; i++) {
		 int in = Integer.parseInt(br.readLine());
		 
		 if(visit[in])bw.write(String.valueOf(1+"\n"));
		 else bw.write(String.valueOf(0+"\n"));
	 }
	 bw.flush();
		
	}//main

 
	
}//class
 FA