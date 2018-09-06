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
	static int N;
	static int arr[][];
	static boolean visit[][];
	//static int ans,cnt;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,-1,1};
	static int T;
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        //StringTokenizer st = new StringTokenizer(br.readLine());
        
       N = Integer.parseInt(br.readLine());
        
         arr = new int [N+1][N+1];
      
        for(int i=0; i<N; i++) {
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	for(int j=0; j<N; j++) {
        		arr[i][j] = Integer.parseInt(st.nextToken());
        	}
        }
        int max =0;
        int cnt;
            
        for( T=1; T<=100; T++) {
        	//초기화
           visit = new boolean [N+1][N+1];
        	// cnt값 초기화
        	cnt=0;
        	
        for(int i=0; i<N; i++) {
        	for(int j=0; j<N; j++) {
        		if(!visit[i][j] && arr[i][j] >=T) {
        			dfs(i,j);
        			cnt++;
        
        		}
        	}
        }
		if(max<cnt)max=cnt;
       }
        bw.write(String.valueOf(max));
        bw.flush();
        
    }


	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		if(visit[x][y])return;
		visit[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nextX = x+dx[i];
			int nextY = y+dy[i];
			
			if(nextX<0 || nextY<0 || nextX>=N || nextY >= N )continue;
			if(visit[nextX][nextY] || arr[nextX][nextY]<T)continue;
			
			dfs(nextX, nextY);
			
		}
		
	}
    
	
	
}