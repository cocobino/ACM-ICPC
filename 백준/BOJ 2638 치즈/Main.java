import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

import java.util.StringTokenizer;

public class Main {
		
	static int r,c;
	static int map[][];
	static boolean visit[][];
	static boolean melt[][];
	
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		map = new int[r][c];
		
		for(int i=0; i<r; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<c; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int i;
		for(i=0; !possible(); i++)dfs(0,0);
		bw.write(String.valueOf(i));
		bw.flush();
	}

	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		map[x][y] = -1;
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y+dy[i];
			
			if(nx >=0 && ny>=0 && nx<r && ny<c) {
				if(map[nx][ny]==0)dfs(nx,ny);
				else if(map[nx][ny]>0)map[nx][ny]++;
			}
		}
	}

	private static boolean possible() {
		// TODO Auto-generated method stub
		int cnt=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(map[i][j] == 1 || map[i][j] ==2) {
					map[i][j] =1;
					cnt ++;
				}
				else map[i][j] =0;
			}
		}
		return cnt==0;	
	}
	

}