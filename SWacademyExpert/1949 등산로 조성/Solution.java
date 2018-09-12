import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
 
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int T,t;
    
    public static void main(String args[]) throws IOException {
    	T = Integer.parseInt(br.readLine());
    	
    	for(int tc=1; tc<=T; tc++)solution(tc); 
    }//main

    //declare
     static int n,k,rst=0;
     static int map[][];
     static boolean visit[][];
     
     static final int y =1;
     static final int no =0;
     
     static int dx[] = {0,0,-1,1};
     static int dy[] = {1,-1,0,0};
     static LinkedList<Node> start = new LinkedList<Node>();
	private static void solution(int tc) throws IOException {
	   StringTokenizer st = new StringTokenizer(br.readLine());
	   n = Integer.parseInt(st.nextToken());
	   k = Integer.parseInt(st.nextToken());
	   
	   map = new int[n][n];
	   visit = new boolean[n][n];
	   
	int max=0;
	rst=0;
	   for(int i=0; i<n; i++) {
		   st = new StringTokenizer(br.readLine());
		   for(int j=0; j<n; j++) {
			   map[i][j] = Integer.parseInt(st.nextToken());
			   if(map[i][j]>max)max = map[i][j];
		   }
	   }//insert
	   
	   
	   for(int i=0; i<n; i++) {
		   for(int j=0; j<n; j++) {
			   if(map[i][j] ==max) {
				   dfs(i,j,1,map[i][j],true);
			   }
		   }
	   }
		  
		bw.write(String.valueOf("#"+tc+" "+rst+"\n"));
		bw.flush();
	   
	} // solution
	private static void dfs(int x, int y, int lenth, int pre, boolean flag) {
		// TODO Auto-generated method stub
		visit[x][y] =true;
		if(rst<lenth)rst=lenth;
		
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(!inrange(nx,ny) || visit[nx][ny])continue;
			
			//공사x
			if(flag) {
				//내리막
				if(map[x][y]>map[nx][ny]) {
					dfs(nx,ny,lenth+1,map[nx][ny],true);
				}
				//평면,오르막
				else {
					if(map[x][y] > map[nx][ny]-k) {
						dfs(nx,ny,lenth+1,map[x][y]-1,false);
					}
				}
			}
			//공사o
			else {
				if(pre>map[nx][ny]) {
					dfs(nx,ny,lenth+1,map[nx][ny],false);
				}
			}
			
		}
		visit[x][y]=false;
	}
	private static boolean inrange(int nx, int ny) {
		// TODO Auto-generated method stub
		if(nx>=0 && ny>=0 && nx<n && ny<n)return true;
		else return false;
	}
	
	 
	}//class
 class Node{
	 int x,y,des;
	 public Node(int x,int y, int des) {
		// TODO Auto-generated constructor stub
		 this.x=x;
		 this.y=y;
		 this.des=des;
	}
 }