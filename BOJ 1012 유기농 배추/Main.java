import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	static int N,K,M;
	static int arr[][];
	static boolean visit[][];
	static int pos,cnt;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,-1,1};
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int test_case = Integer.parseInt(br.readLine());
        for(int T=0; T<test_case; T++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
         M = Integer.parseInt(st.nextToken()); //가로
         N = Integer.parseInt(st.nextToken()); //세로
         K = Integer.parseInt(st.nextToken()); //배추개수
        
        arr = new int[M+1][N+1];
        visit = new boolean[M+1][N+1];
        
        for(int i=0; i<K; i++) {
        	st = new StringTokenizer(br.readLine());
        	int x = Integer.parseInt(st.nextToken());
        	int y = Integer.parseInt(st.nextToken());
        	
        	arr[x][y]=1;
        }
        int cnt=0;
        for(int i=0; i<M; i++) {
        	for(int j=0; j<N; j++) {
        		if(arr[i][j]==1 && !visit[i][j]) {
        			dfs(i,j);
        			cnt++;
        			
        		}
        	}
        }
        bw.write(String.valueOf(cnt+"\n"));
        bw.flush();
        
        }
        
        
	}			
	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		if(visit[x][y])return;
		visit[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nextX = x+dx[i];
			int nextY = y+dy[i];
			
			if(nextX <0 || nextY <0 || nextX>=M || nextY >=N)continue;
			if(visit[nextX][nextY] || arr[nextX][nextY]!=1)continue;
			
			dfs(nextX, nextY);
		}
	}

   }