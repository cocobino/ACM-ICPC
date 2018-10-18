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
     
   static int n;
   static int map[][],dist[][];
   static boolean visit[][];
   
   static int dx[] ={0,0,-1,1};
   static int dy[] = {1,-1,0,0};
   
   static final int wall = 0;
   static final int blank = 1;
   
   static int rst=Integer.MAX_VALUE;
   
    public static void main(String[] args) throws IOException {
    n = Integer.parseInt(br.readLine());
    
    map = new int [n][n];
    visit= new boolean[n][n];
    dist = new int[n][n];
    
    for(int i=0; i<n; i++) {
    	String a = br.readLine();
    	for(int j=0; j<n; j++) {
    		switch(a.charAt(j)) {
    		case '1':
    			map[i][j] = blank;
    			break;
    		case '2':
    			map[i][j] = wall;
    		}
    		
    	}
    }//insert
    
    for(int i=0; i<n; i++)Arrays.fill(dist[i], Integer.MAX_VALUE);
    
    PriorityQueue<Node> q = new PriorityQueue<>();
    visit[0][0]=true;
    dist[0][0]=0;
    q.add(new Node(0,0,0));
   
    while(!q.isEmpty()) {
    	Node cur = q.poll();
    	
    	int x = cur.x;
    	int y = cur.y;
    	
    	if(cur.x == n-1 && cur.y == n-1) {
    		break;
    	}
    	if(dist[x][y] < cur.destroy)continue;
    	
    	
    	for(int i=0; i<4; i++) {
    		int nx = x +dx[i];
    		int ny = y +dy[i];
    		
    		if(nx<0 || ny<0 || nx>=n || ny>=n) continue;
    		if(visit[nx][ny])continue; 
    		
    		if(map[nx][ny] == blank) { 
    			if(dist[nx][ny] > dist[x][y]) {
    				dist[nx][ny]=dist[x][y];
    			}
    		}
    		else {
    			if(dist[nx][ny] > dist[x][y]+1) {
    				dist[nx][ny] = dist[x][y]+1;
    			}
    		}
    		
    		q.add(new Node(nx,ny,dist[nx][ny]));
    		visit[nx][ny]=true;
    		
    	}//for ¹®
    	
    }//while
    
    
    bw.write(String.valueOf(dist[n-1][n-1]));
    bw.flush();
    
    
 
 
	}//main 

 
}// class
    
	class Node implements Comparable<Node>{
		int x,y,destroy;
		 
		public Node(int x, int y, int destroy ) {
			// TODO Auto-generated constructor stub
			this.x=x;
			this.y=y;
			this.destroy=destroy;
			 
		}

		@Override
		public int compareTo(Node o) {
			// TODO Auto-generated method stub
			return this.destroy < o.destroy ? -1 : 1;
		}
	}