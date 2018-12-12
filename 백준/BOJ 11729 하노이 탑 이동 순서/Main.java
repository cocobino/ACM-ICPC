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
   
   static int n;

    public static void main(String[] args) throws IOException {
    	n = Integer.parseInt(br.readLine());
    	
    	bw.write(String.valueOf((int)Math.pow(2, n)-1 + "\n"));
    	dfs(n,1,3);
    	
    	bw.flush();
    	
	}// main

	private static void dfs(int n, int from, int to) throws IOException {
		// TODO Auto-generated method stub
		if(n==0)return;
		
		dfs(n-1, from, 6-from-to);
		bw.write(String.valueOf(from +" "+to+"\n"));
		dfs(n-1, 6-from-to, to);
		
		
	}
    
}//class

