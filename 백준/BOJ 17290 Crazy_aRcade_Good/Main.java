import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static char map[][] = new char[10][10];
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st = new StringTokenizer(br.readLine());
		int r = Integer.parseInt(st.nextToken())-1;
		int c = Integer.parseInt(st.nextToken())-1;
		
		ArrayList<Node> list = new ArrayList<>();
		int d[][] = new int[10][10];
		boolean vis[][] = new boolean[10][10];
		
		for(int i=0; i<10; i++) {
			String a = br.readLine();
			for(int j=0; j<a.length(); j++) {
				map[i][j] = a.charAt(j);
				d[i][j] = Integer.MAX_VALUE;
				if(map[i][j] == 'o')list.add(new Node(i,j));
			}
		}//insert
		
		for(int i=0; i<list.size(); i++	) {
			Node bomb = list.get(i);
			
			for(int x=0; x<10; x++) {
				map[x][bomb.y] ='o';
			}
			
			for(int y=0; y<10; y++) {
				map[bomb.x][y]='o';
			}
//			print(map);
		}
		
		Queue<Node> q = new LinkedList<>();
		d[r][c]=0;
		vis[r][c]=true;
		q.add(new Node(r,c));
		while(!q.isEmpty()) {
			int qsize =q.size();
			for(int size=0 ;size<qsize; size++) {
				Node cur = q.poll();
				
				for(int i=0; i<4; i++) {
					int nx = cur.x +dx[i];
					int ny = cur.y + dy[i];
					
					if(inrage(nx,ny) && !vis[nx][ny] && d[nx][ny] > d[cur.x][cur.y]+1 ) {
						d[nx][ny] = d[cur.x][cur.y] +1;
						vis[nx][ny]= true;
						q.add(new Node(nx,ny));
					}
				}
			}//for loop
			
		}// while loop
		
		int rst =Integer.MAX_VALUE;
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(map[i][j] == 'x') {
					rst = Math.min(rst, d[i][j]);
				}
			}
		}
		
		System.out.println(rst);
		 
	}// main

	private static void print2(int time, boolean vis[][]) {
		for(int i=0; i<10; i++) {
			System.out.println(Arrays.toString(vis[i]));
		}
		
	}

	private static void print(char[][] map2) {
		System.out.println("000000000000000000000000");
		for(int i=0; i<map2.length; i++) {
			System.out.println(Arrays.toString(map2[i]));
		}
		
	}

	private static boolean inrage(int nx, int ny) {
		if(nx >=0 && ny>=0 && nx<10 && ny<10)return true;
		return false;
	}
 
}// class
  
class Node{
	int x,y;

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}