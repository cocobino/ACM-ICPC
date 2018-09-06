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
	static int r,c;
	static char arr[][];
	static boolean visit[];
	static int cnt=1,ans=1;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,-1,1};
	static int T;
	static char save[];
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());	
        
         r = Integer.parseInt(st.nextToken());
         c = Integer.parseInt(st.nextToken());
        
         arr = new char[r][c];
         visit = new boolean[26];
         
         for (int i = 0; i < r; i++) {
             arr[i] = br.readLine().toCharArray();
             for (int j = 0; j < c; j++) {
                 arr[i][j] = (char) (arr[i][j] - 'A');
             }
         }


     
         
         dfs(arr, visit, 0, 0);
         bw.write(String.valueOf(ans));
         bw.flush();
         
	}

	private static void dfs(char[][] arr, boolean[] visit, int x, int y) {
		// TODO Auto-generated method stub
		int idx = arr[x][y];
		
		visit[idx] = true;
		
		for(int i=0; i<4 ;i++) {
			int nextX = x+dx[i];
			int nextY = y+dy[i];
			
			if (-1 < nextY && nextY < c && -1 < nextX && nextX < r) {
	            int next = arr[nextX][nextY];
	 
	            if (!visit[next]) {
	                ans = Math.max(++cnt, ans);
	                dfs(arr, visit, nextX, nextY);
	            }
			}
					
	}
		--cnt;
		visit[idx]=false;
	}
}

