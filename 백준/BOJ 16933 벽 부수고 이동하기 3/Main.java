
import java.util.*;
import java.io.*;

public class Main {

	static int r, c, k;
	static int map[][];
	static boolean vis[][][][];
	
	static int[] dx = { 0, 0, 1, -1, 0 };
	static int[] dy = { 1, -1, 0, 0, 0 };

	static final int night = 1;
	static final int after = 0;
	static int rst = 0;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());

		map = new int[r][c];
		vis = new boolean[r][c][11][2];

		for (int i = 0; i < r; i++) {
			String a = br.readLine();
			for (int j = 0; j < a.length(); j++) {
				map[i][j] = a.charAt(j) - '0';
			}
		} // insert

		// sol
		Queue<Node> q = new LinkedList<>();
		q.add(new Node(0, 0, 0,0));
		 
		boolean flag = false;
		int time = 0;
		
		int day=night;
		while (!q.isEmpty() && !flag) {
			time++;
			if(day==night)day=after;
			else if(day==after)day=night;
			
			int qsize = q.size();
			for (int size = 0; size < qsize && !flag; size++) {
				Node cur = q.poll();

				if (cur.x == r - 1 && cur.y == c - 1) {
					flag = true;
					break;
				}
//				System.out.println(cur.x + ", "+cur.y+" ");
				for (int i = 0; i < 5; i++) {
					int nx = cur.x + dx[i];
					int ny = cur.y + dy[i];

					// 범위안
					if (inrage(nx, ny)) {
						// 다음칸이 빈칸인 경우 		//다음칸, 벽부신 횟수, 방향 기록
						if (map[nx][ny] == 0 && !vis[nx][ny][cur.brk][day]) {
							vis[nx][ny][cur.brk][day]=true;
							q.add(new Node(nx,ny,cur.brk,i));
						}
						//다음칸이 벽인경우
						else if(map[nx][ny]==1) {
							//낮이면 벽을 부시기
							if(day==after && cur.brk+1 <=k && !vis[nx][ny][cur.brk+1][day]) {
								vis[nx][ny][cur.brk+1][day]= true;
								q.add(new Node(nx,ny,cur.brk+1,i));
							}
							//밤이면 하루기다리기
							else if(day==night && !vis[cur.x][cur.y][cur.brk][day]) {
								vis[cur.x][cur.y][cur.brk][day]=true;
								q.add(new Node(cur.x,cur.y,cur.brk, i));
							}
							
						}
						
					}
				}

			} // for loop : size

		} // while loop
		
		if(!flag) {
			System.out.println(-1);
					return;
		}
		System.out.println(time);
		
	}// main

	private static boolean inrage(int nx, int ny) {
		// TODO Auto-generated method stub
		if (nx >= 0 && ny >= 0 && nx < r && ny < c)
			return true;
		return false;
	}

}// class

class Node {
	int x, y;
	int brk;
	int dir;

	public Node(int x, int y, int brk, int dir) {
		super();
		this.x = x;
		this.y = y;
		this.brk = brk;
		this.dir=dir;
	}

}
