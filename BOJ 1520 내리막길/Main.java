import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
 
	static int R,C;
	static int map[][],dp[][];
	 
	static int dx[] = {0,0,-1,1};
	static int dy[] = {-1,1,0,0};
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		  
		StringTokenizer st= new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
	 
		map = new int[R][C];
		dp = new int[R][C];
		
		for(int i=0; i<R; i++) {
			st= new StringTokenizer(br.readLine());
			for(int j=0; j<C; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dp[i][j]=-1;
			}
		}
		int rst = dfs(R-1,C-1);
		bw.write(String.valueOf(rst));
		bw.flush();
	}

	private static int dfs(int x, int y) {
		// TODO Auto-generated method stub
		if( x==0 && y==0)return 1;
		
		if(dp[x][y]==-1) {
			dp[x][y]=0;
			for(int i=0; i<4; i++) {
				int nx = x+dx[i];
				int ny = y+dy[i];
				
				if(nx>=0 && ny >=0 && nx<R && ny<C) {
					if(map[x][y] <map[nx][ny]) {
						dp[x][y]+=dfs(nx,ny);
					}
				}
			}
		}
		return dp[x][y];
	}

	  
 }
  
