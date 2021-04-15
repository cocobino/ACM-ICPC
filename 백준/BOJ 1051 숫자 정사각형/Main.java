import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int max = 0;
	static int map[][];
	static int r, c;
	static int rst =0;
	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		max = Math.max(r, c);
		map = new int[r][c];
		
		for(int i=0; i<r; i++) {
			String a = br.readLine();
			for(int j=0; j<c; j++) {
				map[i][j] = a.charAt(j)-'0';
			}
		}
		//sol
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				dfs(i,j);
			}
		}
		
		System.out.println(rst == 0 ? 1 : rst);
 
	}
	private static void dfs(int curR, int curC) {
		for(int i=1; i<max; i++) {
			int nr = curR+i;
			int nc = curC+i;
			if(ispossible(nr, nc) && issame(curR, curC, nr, nc)) {
				rst = (int) Math.max(rst, Math.pow(i+1, 2));
			}
		}
		
	}
	private static boolean issame(int r, int c, int nr, int nc) {
		return map[r][c] == map[r][nc] && map[r][nc] == map[nr][nc] && map[nr][nc] == map[nr][c] && map[r][c] == map[nr][c];
	}
	private static boolean ispossible(int nr, int nc) {
		return (nr<r && nc<c);
	}
}