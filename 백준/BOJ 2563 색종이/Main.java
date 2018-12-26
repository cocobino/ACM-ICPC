import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	static int n,k;
	static boolean visit[][],chk[][];
	static int rst=0;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		n =Integer.parseInt(br.readLine());
		
		visit =new boolean[101][101];
		chk = new boolean[101][101];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			for(int j=x; j<x+10; j++) {
				for(int k=y; k<y+10; k++) {
					if(!visit[j][k])visit[j][k]=true;
				}
			}
			
		}//insert
		
		for(int i=0; i<101; i++) {
			for(int j=0; j<101; j++) {
				if(!chk[i][j] && visit[i][j]) {
					dfs(i,j);
				}
			}
		}
	 bw.write(String.valueOf(rst));
	 bw.flush();
	 
	}//main


	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		if(chk[x][y])return;
		
		chk[x][y]=true;
		rst++;
		for(int i=0; i<4; i++) {
			int nx = x+dx[i];
			int ny = y+dy[i];
			
			if(nx>=0 && ny>=0 && nx<101 && ny<101) {
				if(!chk[nx][ny] && visit[nx][ny]) {
					dfs(nx,ny);
				}
			}
		}
		
	}

 
 
	
}//class
 