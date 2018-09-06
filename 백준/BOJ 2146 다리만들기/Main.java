import java.io.*;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Point {
	int x, y;
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int N, COUNT = 0, NUMBER = 0;
	static int[][] a, visit, bridge;
	static int[] dx = { 0, -1, 0, 1 }, dy = { 1, 0, -1, 0 };
	static Queue<Point> list = new LinkedList<Point>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		N = Integer.parseInt(br.readLine());
		a = new int[N][N];
		visit = new int[N][N];
		bridge = new int[N][N];
		
		
		for (int i = 0; i < N; i++) {
			st = new StringTokenizer(br.readLine());
			for (int j = 0; j < N; j++) {
				a[i][j] = Integer.parseInt(st.nextToken());
				if (a[i][j] == 1) list.add(new Point(i, j));
			}
		}
		
		// 섬 번호 매기기
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (a[i][j] == 0 || visit[i][j] == 1) continue ;
				NUMBER++;
				visit[i][j] = 1;
				numbering(i, j);
			}
		}
		bfs();
		bw.write(getMinLength() + "");
		bw.flush();
	}
	
	public static void numbering(int x, int y) {
		if (a[x][y] == 0) return ;
		a[x][y] = NUMBER;
		
		for (int i = 0; i < 4; i++) {
			int sx = x + dx[i],
				sy = y + dy[i];
			if (sx >= 0 && sx < N && sy >= 0 && sy < N && a[sx][sy] == 1 && visit[sx][sy] == 0) {
				visit[sx][sy] = 1;
				numbering(sx, sy);
			}
		}
	}
	
	public static void bfs() {
		while (list.size() != 0) {
			Point point = list.remove();
			for (int i = 0; i < 4; i++) {
				int sx = point.x + dx[i],
					sy = point.y + dy[i];
				if (sx >= 0 && sx < N && sy >= 0 && sy < N  && a[sx][sy] == 0 && bridge[sx][sy] == 0) {
					bridge[sx][sy] = bridge[point.x][point.y] + 1;
					a[sx][sy] = a[point.x][point.y];
					list.add(new Point(sx, sy));
				}
			}
		}
	}
	
	public static int getMinLength() {
		int min = Integer.MAX_VALUE;
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				for (int k = 0; k < 4; k++) {
					int sx = i + dx[k],
							sy = j + dy[k];			
					if (sx >= 0 && sx < N && sy >= 0 && sy < N && a[i][j] != a[sx][sy]) 
					{ min = Math.min(min, bridge[sx][sy] + bridge[i][j]); }
				}
			}
		}
		return min;
	}
}