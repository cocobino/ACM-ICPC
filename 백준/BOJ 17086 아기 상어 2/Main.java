import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static int[] dx = { -1, 1, 0, 0, 1, 1, -1, -1};
	static int[] dy = { 0, 0, 1, -1, 1, -1, 1, -1 };
	
	static int r,c;
	static int map[][];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		 
		
		st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		map = new int[r][c];
		int dist[][]= new int[r][c];
		
		Queue<Node> q = new LinkedList<>();
		for(int i=0; i<r; i++) {
			st =new StringTokenizer(br.readLine());
			for(int j=0; j<c; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				dist[i][j] = Integer.MAX_VALUE;
				if(map[i][j]==1) {
					q.add(new Node(i,j));
					dist[i][j]=0;
				}
			}
		}//insert
		
		//sol
		int max = 0;
		while(!q.isEmpty()) {
			Node cur =q.poll();
			
			for(int i=0; i<8; i++) {
			int nx = cur.x +dx[i];
			int ny = cur.y + dy[i];
			
			if(nx>=0 && ny>=0 && nx<r && ny<c) {
				if(dist[nx][ny] > dist[cur.x][cur.y]+1) {
					dist[nx][ny] = dist[cur.x][cur.y]+1;
					q.add(new Node(nx,ny));
					max = Math.max(dist[nx][ny], max);
				}
			}
			
			}//for loop
			
		}//while loop
		
		System.out.println(max);
		
	

		
	}//main
 
	
}//class

class Node{
	int x,y;

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}