import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
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
    static int map[][];
    static boolean visit[];
    
    static int n,sx,sy,ans;
    
    static int dx[] = { 1,1,-1,-1};//왼아 , 오아, 왼위, 오위
    static int dy[] = {-1,1, 1,-1};
    
	private static void solution(int tc) throws IOException {
	 //StringTokenizer st = new StringTokenizer(br.readLine());
	 n = Integer.parseInt(br.readLine()); //맵크기
	
	 
	 map = new int[25][25];
	 visit = new boolean[101];
	 
	 for(int i=0; i<n; i++) {
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 for(int j=0; j<n; j++) {
			 map[i][j] =Integer.parseInt(st.nextToken());
		 }
	 }//insert
	 ans =-1;
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<n; j++) {
			 sx=i;sy=j;dfs(i,j,1,-1,0);
		 }
	 }

	 bw.write(String.valueOf("#"+tc+" "+ans+"\n"));
	 bw.flush();
	 
 
	}//solution

										// 길이,    방향,   회전수
	private static void dfs(int x, int y, int l, int d, int c) {
		// TODO Auto-generated method stub
		if(c>=5)return;
		visit[map[x][y]]=true;
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y+ dy[i];
			
			if(nx==sx && ny==sy && l>=4 && c>=3 ) {
				ans = Math.max(ans , l);
				visit[map[x][y]]=false;
				return;
			}
			if(nx<0 || ny<0 || nx>=n || ny>=n || visit[map[nx][ny]]) {
				continue;
			}
			
			dfs(nx,ny,l+1,i,i==d?c:c+1);
		}
		visit[map[x][y]]=false;
	}
	 
	 
	}//class

 