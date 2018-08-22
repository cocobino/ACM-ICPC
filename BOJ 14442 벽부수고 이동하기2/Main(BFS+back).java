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
 
	static int r,c,k;
	
	static int map[][];
	static boolean visit[][];
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	static int movecnt, min=20000;
	static Node start,end;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		StringTokenizer st= new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		map = new int[r][c];
		visit = new boolean[r][c];
		
		start = new Node(0,0);
		end = new Node(r-1,c-1);
		for(int i=0; i<r; i++){
			String a  = br.readLine();
			for(int j=0; j<c; j++) {
				switch(a.charAt(j)) {
				case '0':
					map[i][j] = 0;
					break;
				case '1':
					map[i][j] = 1;
					break;
				}
			}
		}//insert
		
		//backtraking
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(map[i][j] ==1)dfs(i,j,0);
			}
		}
		
		bw.write(String.valueOf(min+1));
		bw.flush();
	}


	private static void dfs(int x, int y, int broke) {
		// TODO Auto-generated method stub
		if(broke==k) {
			bfs();
			return; //부신개수가 k의 개수와 같아지면 return
		}
		map[x][y]=0; //벽부시기
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(map[i][j]==1) {
					dfs(i,j,broke+1);
					
				}
				
			}
		}
		
		map[x][y]=1;
	}


	private static void bfs() {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<Node>();
		visit= new boolean[r][c];
		int dist[][] = new int[r][c];
		for(int i=0; i<r; i++)Arrays.fill(dist[i], -1);
		dist[0][0]=0;
		
		q.add(start);
		
		visit[0][0]=true;
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			if(cur.x == r-1 && cur.y == c-1) {
				if(dist[r-1][c-1]<min)min =dist[r-1][c-1];
				break;
			}
			for(int i=0; i<4; i++) {
				int nx = cur.x +dx[i];
				int ny = cur.y +dy[i];
				
				if(nx>=0 && ny>=0 && nx<r && ny<c) {
					if(map[nx][ny] ==0 && !visit[nx][ny]) {
						if(dist[nx][ny] == -1 || dist[nx][ny]>dist[cur.x][cur.y]+1) {
						dist[nx][ny] = dist[cur.x][cur.y]+1;
						visit[nx][ny] =true;
						q.add(new Node(nx,ny));
						}
					}
				}
			}
			
		}//end while
		
	}

}

class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x =x;
		this.y =y;
	}
}
