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
   
   static ArrayList<Integer> tree[];
   static long[] table;
   static boolean visit[];
   
   public static void main(String[] args) throws IOException {
	 int n = Integer.parseInt(br.readLine());
	 
	 table = new long[n+1]; //양,늑대 수저장
	 tree = new ArrayList[n+1];
	 for(int i=0; i<n+1; i++)tree[i] = new ArrayList<>();
	 
	 for(int i=2; i<=n ;i++) {
		 st = new StringTokenizer(br.readLine());
		 String t = st.nextToken();
		 long a = Long.parseLong(st.nextToken());
		 int p = Integer.parseInt(st.nextToken());
		 
		 tree[i].add(p);
		 tree[p].add(i);
		 
		 table[i] = ("S".equals(t)) ? a : -a;
	 }//insert
	 
	 visit =new boolean[n+1];
	 long rst = dfs(1);
	 bw.write(String.valueOf(rst));
	 bw.flush();
	 
	}// main

private static long dfs(int cur) {
	// TODO Auto-generated method stub
	visit[cur]=true;
	
	long sum = table[cur];
	for(int next : tree[cur]) {
		if(!visit[next]) {
			sum +=dfs(next);
		}
	}
	return (sum>0) ? sum : 0;
}// func : dfs
 

}//class 
 