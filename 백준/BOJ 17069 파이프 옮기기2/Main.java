import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int n;

	// го, ©Л, гоаб
	static int dx[] = { 0, 1, 1 };
	static int dy[] = { 1, 0, 1 };
	
	static final int right =0;
	static final int down =1;
	static final int rightdown=2;
	
	static int map[][];
	static long dp[][][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		n = Integer.parseInt(br.readLine());
	 map = new int[n][n];
	 dp = new long[n][n][3];
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<n; j++) {
			 for(int k=0; k<3; k++) {
				 dp[i][j][k]=-1;
			 }
		 }
	 }
	 for(int i=0; i<n; i++) {
		 st = new StringTokenizer(br.readLine());
		 for(int j=0; j<n; j++) {
			 map[i][j] = Integer.parseInt(st.nextToken());
		 }
	 }//insert
	 
	 System.out.println(dfs(0,1,0));

	}// main


	private static long dfs(int x, int y, int dir) {
		// TODO Auto-generated method stub
		if(dp[x][y][dir] !=-1)return dp[x][y][dir];
		if(x == n-1 && y == n-1)return 1;
		
		dp[x][y][dir]=0;
		
		if(dir==right) {
			int nx = x+ dx[dir];
			int ny = y+ dy[dir];
			
			if(inrage(nx,ny)) {
				if(map[nx][ny]==0) {
					dp[x][y][dir]+=dfs(nx,ny,dir);
				}
			}
			
			nx = x +dx[2];
			ny = y +dy[2];
			if(inrage(nx,ny))	{
				if(map[nx][ny]==0 && map[x][y+1]==0 && map[x+1][y]==0) {
					dp[x][y][dir] +=dfs(nx,ny,rightdown);
				}
			}
		}
		
		else if(dir==down) {
			int nx = x +dx[down];
			int ny = y+ dy[down];
			
			if(inrage(nx,ny)) {
				if(map[nx][ny]==0) {
					dp[x][y][dir]=dp[x][y][dir]+dfs(nx,ny,dir);
				}
			}
			nx = x +dx[2];
			ny = y +dy[2];
			if(inrage(nx,ny))	{
				if(map[nx][ny]==0 && map[x][y+1]==0 && map[x+1][y]==0) {
					dp[x][y][dir] +=dfs(nx,ny,rightdown);
				}
			}
			 
		}
		else if(dir == rightdown) {
			int nx = x +dx[rightdown];
			int ny = y +dy[rightdown];
			if(inrage(nx,ny)) {
				if(map[nx][ny]==0 && map[x][y+1]==0 && map[x+1][y]==0) {
					dp[x][y][dir] = dp[x][y][dir] +dfs(nx,ny,dir);
				}
			}
			nx = x +dx[right];
			ny = y +dy[right];
			
			if(inrage(nx,ny)) {
				if(map[nx][ny]==0) {
					dp[x][y][dir] +=dfs(nx,ny,right);
				}
			}
			
			nx = x +dx[down];
			ny = y +dy[down];
			
			if(inrage(nx,ny)) {
				if(map[nx][ny]==0) {
					dp[x][y][dir] +=dfs(nx,ny,down);
				}
			}	
		}
		return dp[x][y][dir];
	}


	private static boolean inrage(int nx, int ny) {
		// TODO Auto-generated method stub
		if(nx>=0 && ny>=0 && nx<n && ny<n)return true;
		return false;
	}

}// class
 
class Node{
	int x,y,dir;

	public Node(int x, int y, int dir) {
		super();
		this.x = x;
		this.y = y;
		this.dir = dir;
	}
	
}