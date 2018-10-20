import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
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
 
   static int arr[];
   static int rst[];
   static boolean visit[];
   static int n;
   
    public static void main(String[] args) throws IOException {
     n = Integer.parseInt(br.readLine());
     
     arr = new int[n+1];
     rst = new int[n+1];
     visit = new boolean[n+1];
     
     for(int i=1; i<=n; i++) {
    	 visit[i]=true;
    	 dfs(i,1);
    	 visit[i]=false;
     }
    	
    	 
    	
		}//main 

	private static void dfs(int num, int d) throws IOException {
		// TODO Auto-generated method stub
		rst[d] = num;
		if(d==n) {
			for(int i=1; i<=n; i++) {
				bw.write(String.valueOf(rst[i]+" "));
			}
			bw.write(String.valueOf("\n"));
			bw.flush();
			return;
		}
		
		for(int i=1; i<=n; i++	) {
			if(visit[i])continue;
			visit[i]=true;
			dfs(i,d+1);
			visit[i]=false;
		}
		
		
		
	}
 
} //class