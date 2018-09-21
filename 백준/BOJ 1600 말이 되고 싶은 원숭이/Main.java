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
 
class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int map[][];
	static int k,w,h;
	static boolean visit[][][];
	
	static final int wall =1;
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	static int hdx[] = {1,2, 2, 1, -1,-2,-2,-1};
	static int hdy[] = {2,1,-1,-2, -2,-1, 1, 2};

	static boolean flag;
	public static void main(String[] args) throws NumberFormatException, IOException {
		k = Integer.parseInt(br.readLine());
		StringTokenizer st =new StringTokenizer(br.readLine());
		h = Integer.parseInt(st.nextToken());
		w = Integer.parseInt(st.nextToken());
		
		map = new int[201][201];
		visit = new boolean[201][201][31];

		for(int i=0; i<w; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<h; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//insert
		
		flag =false;

		
		bw.write(String.valueOf(bfs(k)));
		bw.flush();
	}//main


 


	private static int bfs(int k) {
		// TODO Auto-generated method stub
		Queue<Node> q= new LinkedList<Node>();
		q.add(new Node(0,0,k,0));
		
		while(!q.isEmpty()) {
			Node cur =q.poll();
			int x = cur.x;
			int y = cur.y;
			
			if(cur.x <0 || cur.y <0 || cur.x>=w || cur.y>=h)continue;
			if(map[cur.x][cur.y]==1)continue;
			
			if(cur.x == w-1 && cur.y == h-1) {
				return cur.cnt;
			}
			
			if(visit[x][y][cur.k])continue;
			visit[x][y][cur.k]=true;
			
			for(int i=0; i<4; i++) {
				int nx = cur.x +dx[i];
				int ny = cur.y+dy[i];
				q.add(new Node(nx,ny,cur.k, cur.cnt+1));
			}
			
			if(cur.k ==0)continue;
			for(int i=0; i<8; i++) {
				int nx =cur.x +hdx[i];
				int ny = cur.y +hdy[i];
				q.add(new Node(nx,ny,cur.k-1,cur.cnt+1));
			}
		}//while
		return -1;
	}


   
}//class

class Node{
	int x,y,k,cnt;
	public Node(int x, int y, int k, int cnt) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		this.k=k;
		this.cnt=cnt;
	}
}
  