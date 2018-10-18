import java.awt.Point;
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
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static int n,m;
   static boolean duple[][], choice[];
   static int cnt=0;
   
    public static void main(String[] args) throws IOException {
    	st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    	
    	duple =new boolean[n+1][n+1];
    	choice= new boolean[n+1];
    	
    	for(int i=0; i<m; i++) {
    		st = new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	
        	duple[a][b]= true;
        	duple[b][a]= true;
    	}//insert
    	
    	dfs(1,0,0,0);
    	
    	
    	bw.write(String.valueOf(cnt));
    	bw.flush();
    	
    	
		}//main 

	private static void dfs(int prev, int a, int b, int c) {
		// TODO Auto-generated method stub
		if( a !=0 && b!=0 && c!=0) {
			if(duple[a][b] ==true)return;
			if(duple[a][c]==true)return;
			if(duple[b][c]==true)return;
			
			cnt++;
			return;
		}
		
		for(int i=prev; i<=n; i++) {
    	if(choice[i] == false) {	
    		choice[i] =true;
    		if(a==0) {
    			dfs(i+1,i,0,0);
    			choice[i]=false;
    			continue;
    		}
    		if(b==0) {
    			dfs(i+1,a,i,0);
    			choice[i]=false;
    			continue;
    		}
    		if(c==0) {
    			dfs(i+1,a,b,i);
    			choice[i]=false;
    			continue;
    		}
    	}
    	}
	}
    	
     
}// class
 