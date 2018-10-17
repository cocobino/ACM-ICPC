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
   static int map[][];
   
   
   static int dx[] = {-1,1,0,0};
   static int dy[] = {0,0,-1,1};
   static int min = Integer.MAX_VALUE;
   static ArrayList<brg> bridge = new ArrayList<>();
   
    public static void main(String[] args) throws IOException {
    	st = new StringTokenizer (br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
    
    	map = new int[n][n];
    	
    	for(int i=0; i<n; i++) {
    		st = new StringTokenizer(br.readLine());
    		for(int j=0; j<n; j++) {
    			map[i][j]= Integer.parseInt(st.nextToken());
    		}
    	}//insert
    	
    	
    	for(int i=0; i<n; i++) {
    		for(int j=0; j<n; j++) {
    			if(map[i][j]==0 && check(i,j))bridge.add(new brg(i,j));
    		}
    	}
    	dfs(0);
    	bw.write(String.valueOf(min));
    	bw.flush();
    	
   }//main 

	private static boolean check(int x, int y) {
		// TODO Auto-generated method stub
		int hcnt=0,vcnt=0;
		
		 for (int i = 0; i <2; i++) {
		        int nx = x + dx[i];
		        int ny = y + dy[i];
		 
		        if (nx<0 || nx>= n || ny<0 || ny>=n) continue;
		 
		        if (map[nx][ny] == 0) hcnt++;
		    }
		 
		    for (int i = 2; i <4; i++) {
		        int nx = x + dx[i];
		        int ny = y + dy[i];
		 
		        if (nx < 0 || nx >= n || ny < 0 || ny >=n) continue;
		 
		        if (map[nx][ny] == 0) vcnt++;
		    }
		 
		    if (hcnt >= 1 && vcnt >= 1) return false;
		 
		    return true;
	}

	private static void dfs(int idx) {
		// TODO Auto-generated method stub
		//backtracking end
		if(idx == bridge.size()) {
			return;
		}
		
		brg install = bridge.get(idx);
		map[install.x][install.y]=m;
		bfs();
		map[install.x][install.y]=0;
		
		dfs(idx+1);
		
	}

	private static void bfs() {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		boolean visit[][] = new boolean[n][n];
		q.add(new Node(0,0,0));
		visit[0][0]=true;
		
		while(!q.isEmpty()) {
			Node cur =q.poll();
			int x =cur.x;
			int y =cur.y;
			int time = cur.time;
			boolean flag=false;
			
			//end option
			if(x ==n-1 && y== n-1) {
				min = Math.min(min, time);
				return;
			}
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx<0 || ny<0 || nx>=n || ny>=n)continue;
				if(map[nx][ny]==0)continue;
				if(visit[nx][ny])continue;
				
				//1) 땅일경우
				if(map[nx][ny]==1) {
					visit[nx][ny]=true;
					q.add(new Node(nx,ny,time+1));
				}
				//2)다리일경우
				if(map[nx][ny] >1) {
					
					//통행 불가능한 시간이면 기다려야함
					if(time % map[nx][ny] != map[nx][ny]-1) {
						flag=true;
					}
					//통행 가능하면 다리건너의 땅이 범위안이고, 땅이여야함
					else {
						int nnx = nx+dx[i];
						int nny = ny +dy[i];
						
						if(nnx<0 || nnx>=n || nny<0 || nny>=n)continue;
						if(map[nnx][nny] !=1)continue;
						
						visit[nx][ny]=true;
						q.add(new Node(nx,ny,time+1));
					}
				}
			}
			if(flag)q.add(new Node(x,y,time+1));
				
		}
		 
	}
  

}// class
   
	class Node{
		int x,y,time;
	 
		public Node(int x,int y,int time) {
			// TODO Auto-generated constructor stub
			this.x=x;
			this.y=y;
			this.time=time;
		}
	}
	
	class brg{
		int x,y,idx;
		public brg(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x=x;
			this.y=y;
		}
	}