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
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Scanner sc = new Scanner(System.in);
	 
	static int V;
	static int E;

	static int[][] map;
	static int[] parent;

	 public static void main(String[] args) throws IOException {
	 
		 /*
		  * 간선을 거리가 짧은 순서대로 그래프에 포함
		  * cycle이 발생하지 않게 하기 (cycle이 형성되면 그래프에 담지 x)
		  */
		 StringTokenizer st= new StringTokenizer(br.readLine());
		 V = Integer.parseInt(st.nextToken());
		 E = Integer.parseInt(st.nextToken());
		 
		 parent = new int[V+1];
		 for(int i=1; i<=V; i++)parent[i]=i;
		 map= new int[E][3];
		 
		 for(int i=0; i<E;i ++) {
			 st= new StringTokenizer(br.readLine());
			 int from = Integer.parseInt(st.nextToken());
			 int to = Integer.parseInt(st.nextToken());
			 int cost = Integer.parseInt(st.nextToken());
			 
			 map[i][0]= from;
			 map[i][1]= to;
			 map[i][2]= cost;
		 }

		 Arrays.sort(map, new Comparator<int []>() {

			@Override
			public int compare(int[] o1, int[] o2) {
				// TODO Auto-generated method stub
				return o1[2] >= o2[2] ? 1 : -1;
			}
			 
		});
		 
		 int sum =0;
		 int cnt=0;
		 for(int i=0; i<E; i++) {
			 int from = map[i][0];
			 int to = map[i][1];
			 int cost = map[i][2];
			 
			 if(find(from) != find(to)) {
				 union(from, to);
				 sum += cost;
				 if(cnt++ == V-1)break;
			 }
		 }
		 
		 bw.write(String.valueOf(sum));
		 bw.flush();
	 }//main

	private static void union(int x, int y) {
		// TODO Auto-generated method stub
		x = find(x);
		y = find(y);
		
		parent[y] = x;
	}

	private static int find(int x) {
		// TODO Auto-generated method stub
		if(parent[x]==x)return x;
		
		int root = find(parent[x]);
		parent[x]=root;
		
		return root;
	}
 
 
}// class
 class Node{
	 
 }