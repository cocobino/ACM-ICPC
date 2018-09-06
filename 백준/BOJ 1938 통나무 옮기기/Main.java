import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
	static int n;
	
	static int map[][];
	static boolean visit[][][];
	static int rst=0;
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	
	static final int wall =1;
	static final int blank =0;
	static final int end = 2;
	
	static final int horizon = 1;
	static final int vertical =0;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		n = Integer.parseInt(br.readLine());
		map = new int[52][52];
		visit = new boolean[52][52][2];
		Node starttree = new Node(0,0,0),endtree = new Node(0,0,0);
		int startcnt=0,endcnt=0;
		
		
		for(int i=0; i<n; i++) {
			String a = br.readLine();
			for(int j=0; j<n; j++) {
				switch(a.charAt(j)) {
				case 'B':
					map[i][j] = blank;
					startcnt++;
					if(startcnt ==1) {
						starttree = new Node(i,j,0);
					}else if(startcnt == 2) {
						if(starttree.x ==i) {
							starttree = new Node(i,j,horizon);
						}else {
							starttree = new Node(i,j,vertical);
						}
					}
					break;
				case '1':
					map[i][j] = wall;
					break;
				case '0':
					map[i][j] = blank;
					break;
				case 'E':
					map[i][j] = end;
					endcnt++;
					if(endcnt ==1) {
						endtree = new Node(i,j,0);
					}else if(endcnt == 2) {
						if(endtree.x ==i) {
							endtree = new Node(i,j,horizon);
						}else {
							endtree = new Node(i,j,vertical);
						}
					}
					break;
					
				}
			}
		}//insert
		
		Queue<Node> q = new LinkedList<Node>();
		int step = -1;
		boolean flag = false;
		
		q.add(starttree);
		while(!q.isEmpty() && !flag) {
			step++;
			int size = q.size();
			
			for(int i=0; i<size; i++) {
				Node cur = q.poll();
				
				//종료조건
				if(map[cur.x][cur.y]== end ) {
					if(cur.x == endtree.x && cur.y == endtree.y &&  cur.dir == endtree.dir) {
						bw.write(String.valueOf(step));
						flag = true;
						break;
					}
				}
				
				for(int j=0; j<4; j++) {
					int nx= cur.x +dx[j];
					int ny = cur.y +dy[j];
					//수평으로 이동할수있는경우
					if(cur.dir == horizon) {
						if(nx<0 || nx>=n || ny-1<0 || ny+1 >=n)continue; //중심에서 좌우가 여유 1칸있어야함
						if(visit[nx][ny][cur.dir])continue;
						if(map[nx][ny] == wall || map[nx][ny-1] == wall || map[nx][ny+1] ==wall)continue;
						
						q.add(new Node(nx,ny,cur.dir));
						visit[nx][ny][cur.dir]=true;
						
					}
					//수직이동
					if(cur.dir == vertical) {
						if(nx-1<0 || nx+1>=n || ny<0 || ny>=n)continue;
						if(visit[nx][ny][cur.dir])continue;
						if(map[nx][ny] ==wall || map[nx+1][ny] ==wall || map[nx-1][ny]==wall)continue;
						
						q.add(new Node(nx,ny,cur.dir));
						visit[nx][ny][cur.dir] = true;
					}		
				}
				
				if(cur.x -1 <0 || cur.x +1 >=n || cur.y-1 <0 || cur.y +1>=n)continue;
				if(visit[cur.x][cur.y][cur.dir^1])continue;
				
				boolean canrotate = true;
				//회전이 가능한지 판단
				for(int j=cur.x -1 ; j<=cur.x+1 && canrotate; j++) {
					
					for(int k=cur.y-1 ; k<=cur.y+1; k++) {
						if(map[j][k] == wall) {
							canrotate=false;
							break;
						}
					}
				}
				if(canrotate) {
					cur.dir ^=1;
					q.add(cur);
					visit[cur.x][cur.y][cur.dir]=true;
				}
			}
		}
		if(!flag) bw.write(String.valueOf(0));
		
		bw.flush();
	}

}

class Node{
	int x,y,dir;
	public Node(int x, int y, int dir) {
		// TODO Auto-generated constructor stub
		this.x =x;
		this.y =y;
		this.dir =dir;
	}
}
