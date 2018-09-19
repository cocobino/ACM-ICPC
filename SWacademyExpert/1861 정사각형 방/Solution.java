import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n,max,compare;
	static int map[][],dp[][];
	static boolean visit[][];
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
	 
	
		for(int tc=1; tc<=T; tc++) {
			n = Integer.parseInt(br.readLine());
			
			map = new int[n+1][n+1];
			dp = new int[n+1][n+1];
			
			for(int i=1; i<=n; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				for(int j=1; j<=n; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}//insert
			
			//solve dp
			
			for(int i=1; i<=n; i++) {
				for(int j=1; j<=n; j++) {
					if(dp[i][j] ==0)dfs(i,j);
				}
			}
			 
		 int cnt=0;
		 int num = Integer.MAX_VALUE;
		 
		 for(int i=1; i<=n; i++) {
			 for(int j=1; j<=n; j++) {
				 if(cnt<dp[i][j]) {
					 cnt = dp[i][j];
					 num = map[i][j];
					 
				 }else if(cnt == dp[i][j]) {
					 num = Math.min(num, map[i][j]);
				 }
			 }
		 }
		 bw.write(String.valueOf("#"+tc+" "+num+" "+cnt+"\n"));
		 bw.flush();
			
		}//test-case
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		
		dp[x][y] = 1;
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y + dy[i];
			
			if(map[nx][ny] ==0)continue;
			
			if(map[nx][ny] ==map[x][y] +1) {
				if(dp[nx][ny] ==0)dfs(nx,ny);
				dp[x][y] = Math.max(dp[x][y], dp[nx][ny]+1);
			}
		}
		
	}//main
 
	 

}//class
 
class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
}