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
   
   static int dx[] = {0, 0, 1,-1, 1, 1,-1,-1};
   static int dy[] = {1,-1, 0, 0, 1,-1, 1,-1};
   
  static final int black = 1;
  static final int white = 2;
  static final int blank = 0;
  
  static int map[][];
  static boolean flag;
  static Queue<Node> q = new LinkedList<>();
  
    public static void main(String[] args) throws IOException {
    	map = new int[20][20];
    	
    	for(int i=1; i<=19; i++) {
    		st =new StringTokenizer(br.readLine());
    		for(int j=1; j<=19; j++) {
    			map[i][j] = Integer.parseInt(st.nextToken());
    		}
    	}//insert
    	
    	/*
    	 * sol search*/
    	for(int i=1; i<=19; i++) {
    		for(int j=1; j<=19; j++) {
    			if(map[i][j]!=0 )selectColor(i,j);
    		}
    	}
    	
    	
	}// main

	private static void selectColor(int x, int y) throws IOException {
		// TODO Auto-generated method stub

		for(int i=0; i<8; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			//inrange
			if(nx>=1 && ny>=1 && nx<20 && ny<20) {
				//same color
				if(map[x][y]==map[nx][ny]) {
					q.add(new Node(x,y));
					dfs(nx,ny,i,1);
					q.clear();
				}
			}
		}
		
	}// func : selectColor

	private static void dfs(int x, int y, int dir, int depth) throws IOException {
		// TODO Auto-generated method stub
		if(depth == 5) {
			flag= true;
			q.add(new Node(x,y));
			bw.write(String.valueOf(map[x][y]+"\n"));
			point();
			return;
		} // end option -> same color == 5
		
		
		int nx = x +dx[dir];
		int ny = y +dy[dir];
		
		//inrange
		if(nx>=1 && ny>=1 && nx<20 && ny<20) {
			// same color
			if(map[x][y]==map[nx][ny]) {
				q.add(new Node(x,y));
				dfs(nx,ny,dir,depth+1);
			}
		}		
	}//func : dfs

	private static void point() {
		// TODO Auto-generated method stub
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
   //static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static int dx[] = {0, 0, 1,-1, 1, 1,-1,-1};
   static int dy[] = {1,-1, 0, 0, 1,-1, 1,-1};
   
  static final int black = 1;
  static final int white = 2;
  static final int blank = 0;
  
  static int map[][];
  static boolean flag;
  
  
    public static void main(String[] args) throws IOException {
    	
    	int test = Integer.parseInt(br.readLine());
    	
    	for(int T=0; T<test; T++) {
    		int arr[] = new int[5];
    		int rst=0;
    		
    		
    		st = new StringTokenizer(br.readLine());
    		for(int i=0; i<5; i++) {
    			arr[i] = Integer.parseInt(st.nextToken());
    			rst = Math.max(rst, arr[i]);
    		}//sol
    		
    		bw.write(String.valueOf("Case #"+(T+1)+": "+rst));
    		bw.newLine();
    		bw.flush();
    		
    	}
    	bw.close();
		br.close();
    	
	}// main

 
    
}//class


	}
    
}//class

class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
}