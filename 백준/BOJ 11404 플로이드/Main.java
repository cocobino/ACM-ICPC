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
   
   static int map[][], dist[][];

    public static void main(String[] args) throws IOException {
    	int n = Integer.parseInt(br.readLine());
    	int bus = Integer.parseInt(br.readLine());
    	
    	
    	dist = new int[101][101];
    	
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    			if(i!=j)dist[i][j]=Integer.MAX_VALUE;
    		}
    	}
    	
    	for(int i=1; i<=bus; i++) {
    		st = new StringTokenizer(br.readLine());
    	int a = Integer.parseInt(st.nextToken());
    	int b = Integer.parseInt(st.nextToken());
    	int c = Integer.parseInt(st.nextToken());
    	if(c <dist[a][b])dist[a][b]=c;
    		
    	}//insert
    	//floyd
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    			for(int k=1; k<=n; k++) {
    				dist[j][k] = Math.min(dist[j][k], dist[j][i]+dist[i][k]);
    			}
    		}
    	}
    	
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    			if(dist[i][j]<Integer.MAX_VALUE)bw.write(String.valueOf(dist[i][j]));
    			else bw.write(String.valueOf("0"));
    			
    			if(j<n)bw.write(String.valueOf(" "));	
    		}
    		bw.write(String.valueOf("\n"));
    	}
    	bw.flush();
    	
	}// main

 
}//class

