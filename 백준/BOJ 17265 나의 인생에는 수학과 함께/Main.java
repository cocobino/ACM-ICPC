import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int n;
	static char map[][];

	static int dx[] = { 1, 0 };
	static int dy[] = { 0, 1 };

	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		n = Integer.parseInt(br.readLine());

		map = new char[n][n];

		for (int i = 0; i < n; i++) {
			String line[] = br.readLine().split(" ");
			for (int j = 0; j < line.length; j++) {
				map[i][j] = line[j].charAt(0);
			}
		} // insert

	
			dfs(0, 0,"");
	
		
		System.out.println(max+" "+ min);
	}// main

	private static void dfs(int x, int y , String cur) {
		if (x == n - 1 && y == n - 1) {
			cur += map[x][y];
			
			int cal = map[0][0]-'0';
			
			for(int i=1; i<cur.length()-1; i+=2) {
				switch(cur.charAt(i)) {
				case '+':
					cal+=cur.charAt(i+1)-'0';
					break;
				case '-':
					cal-=cur.charAt(i+1)-'0';
					break;
				case '*':
					cal*=cur.charAt(i+1)-'0';
					break;
				}
			}
			
			max = Math.max(cal, max);
			min = Math.min(cal, min);
			
			return;
		} // end option

		cur += map[x][y];

		for (int i = 0; i < 2; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];

			if (inrage(nx, ny)) {
				dfs(nx, ny, cur);
			}

		}
	}// func : dfs

	private static boolean inrage(int nx, int ny) {
		if (nx >= 0 && ny >= 0 && nx < n && ny < n)
			return true;
		return false;
	}

}// class
