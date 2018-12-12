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
   
   static int n,k;
   static LinkedList<Integer> arr;
   static boolean visit[];
    public static void main(String[] args) throws IOException {
    	st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	k = Integer.parseInt(st.nextToken());
    	
    	arr =new LinkedList<>();
    	visit = new boolean[n+1];
    	
    	dfs();
    	
	}// main
    
    
	private static void dfs() throws IOException {
		// TODO Auto-generated method stub
		if(arr.size()==k) {
			for(int i=0; i<arr.size(); i++) {
				bw.write(String.valueOf(arr.get(i)+" "));
			}
			bw.write("\n");
			bw.flush();
			return;
		}//end option
		
		for(int i=1; i<=n; i++) {
			if(!visit[i]) {
				visit[i]=true;
				arr.addLast(i);
				dfs();
				visit[i]=false;
				arr.removeLast();
			}
		}
		
	}
     

 
}//class

