import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	static int dx[] = {1,1,-1,-1};
	static int dy[] = {1,-1,1,-1};
	
	static int map[][],colors[][];
	static boolean visit[]= new boolean[100];
	static int[] ans = new int[2];
	
	static int n;
	
	 public static void main(String[] args) throws IOException {
 	 n =  Integer.parseInt(br.readLine());
 	 
 	 map = new int[n][n];
 	 colors = new int[n][n];
 	 
 	 for(int i=0; i<n; i++) {
 		 StringTokenizer st = new StringTokenizer(br.readLine());
 		 for(int j=0; j<n; j++) {
 			 map[i][j] = Integer.parseInt(st.nextToken());
 			 if(i%2 ==0) {
 				 if(j%2 ==0) {
 					 colors[i][j]=1;
 				 }
 				 else {
 					 if(j%2 !=0) {
 						 colors[i][j]=1;
 					 }
 				 }
 			 }
 		 }
 		 
 		 dfs(-1,0,1);
 		 dfs(-1,0,0);
 		 bw.write(String.valueOf(ans[0]+ans[1]));
 		 bw.flush();
 	 }//insert
 	 
 	 
	 
	 }//main

	private static void dfs(int cur, int cnt, int color) {
		// TODO Auto-generated method stub
		if(ans[color]<cnt)ans[color]=cnt;
	
		
		for(int i=cur+1; i<n*n; i++) {
			int x = i/n;
			int y = i%n;
			//같은색이아니라면 return
			if(colors[x][y] != color)continue;
			
			if(map[x][y] ==1) {
				if(chk(x,y)) {
					visit[i]=true;
				dfs(i,cnt+1,color);	
				}
			}
		}
		
		if(cur==-1)return;
		visit[cur]=false;
	}//dfs

	private static boolean chk(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			int v = nx*n +ny;
			
			for(int j=1; j<n; j++) {
				if(nx>=0 && ny>=0 && nx<n && ny<n	) {
					if(visit[v])return false;
				}
			}
			nx +=dx[i];
			ny +=dy[i];
			v = nx*n+ny;
		}
		return true;
	}
 
}// class
 