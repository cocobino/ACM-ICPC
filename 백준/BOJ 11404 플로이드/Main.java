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
    	int m = Integer.parseInt(br.readLine());
    	
    	map = new int[n+1][n+1];
    	
    	for(int i=0; i<m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int from = Integer.parseInt(st.nextToken());
    		int to = Integer.parseInt(st.nextToken());
    		int cost = Integer.parseInt(st.nextToken());
    		
    		if(map[from][to] ==0) {
    			map[from][to]=cost;
    		}else {
    			map[from][to] = Math.min(cost, map[from][to]);
    		}
    	}//inser
    	
    	for(int mid = 1; mid <= n; mid++){ 
    		for(int start = 1; start <=n; start++){
    			if(map[start][mid] == 0)	// 연결이 안되면 처리 안함
    				continue;
    			for(int end = 1; end <= n; end++){ 
    				if(map[mid][end] == 0 || start == end) continue; 
    				// 중간 경로를 거쳐 가는 것이 그냥 가는것보다 빠르면 수정
    				if(map[start][end] == 0 || map[start][end] > map[start][mid] + map[mid][end]) {
    					map[start][end] = map[start][mid] + map[mid][end]; 
    					}
    				} 
    			} 
    		}
    			
    		
    	
    	for(int i=1; i<=n; i++) {
    		for(int j=1; j<=n; j++) {
    			bw.write(String.valueOf(map[i][j]+" "));
    		}
    		bw.write(String.valueOf("\n"));
    	}
    	bw.flush();
	}// main

 
}//class

