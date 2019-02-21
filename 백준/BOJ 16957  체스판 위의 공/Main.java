import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int r,c;
	static int map[][];
	static int ball[][];
	
	static final int inf= 300_001;
	
	static int dx[] = { 1, -1, 0, 0 ,  1, 1, -1, -1};
	static int dy[] = { 0, 0, 1, -1 , -1, 1,  1, -1};

	static int rst;

	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 st = new StringTokenizer(br.readLine());
		 r = Integer.parseInt(st.nextToken());
		 c = Integer.parseInt(st.nextToken());
		 
		 PriorityQueue<Node> pq = new PriorityQueue<>();
		 map = new int [r][c];
		 ball = new int[r][c];
		 
		 
		 for(int i=0; i<r; i++) {
			 st = new StringTokenizer(br.readLine());
			 for(int j=0; j<c; j++) {
				 map[i][j]=Integer.parseInt(st.nextToken());
				 pq.add(new Node(i,j,map[i][j]));
				 ball[i][j]=1;
			 }
		 }//insert
		 
		 //sol bfs
		 while(!pq.isEmpty()) {
			 Node cur = pq.poll();
			 Node edge = new Node(-1,-1,inf);
			 
			 for(int i=0; i<8; i++) {
				 int nx = cur.x +dx[i];
				 int ny = cur.y +dy[i];
				 
				 if(inrage(nx,ny)) {
		if(map[cur.x][cur.y] >map[nx][ny] ) {
			if(edge.wgt > map[nx][ny]) {
				edge = new Node(nx,ny,map[nx][ny]);
			}
		 }
	}
				 
			 }
			 if(edge.wgt != inf) {
				 ball[edge.x][edge.y] += ball[cur.x][cur.y];
				 ball[cur.x][cur.y]=0;
			 }
		 }//while loop: bfs
		 
		 for(int i=0; i<r; i++) {
			 for(int j=0; j<c; j++) {
				 bw.write(String.valueOf(ball[i][j] +" "));
			 }
			 bw.newLine();
		 }
		 
		bw.flush();
		 
	}// main

	private static boolean inrage(int nx, int ny) {
		// TODO Auto-generated method stub
		if(nx>=0 && ny>=0 && nx<r && ny<c)return true;
		else return false;
	}

}// class
 

class Node implements Comparable<Node>{
	int x,y,wgt;

	public Node(int x, int y, int wgt) {
		super();
		this.x = x;
		this.y = y;
		this.wgt = wgt;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.wgt > o.wgt)return -1;
		else if(this.wgt < o.wgt)return 1;
		else return 0;
	}
	
	
}