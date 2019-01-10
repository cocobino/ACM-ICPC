
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
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static int n,map[][];
	static boolean visit[][];
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	static int x,y;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		n = Integer.parseInt(br.readLine());
		
		map =new int [n][n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
				map[i][j] =Integer.parseInt(st.nextToken());
				
				if(map[i][j] ==9) {
					x=i;y=j;
				}
			}
		}//insert
		 
		visit =new boolean[n][n];
		bfs();
		
		
	}// main

	private static void bfs() throws IOException {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<>();
		//init size =2;
		q.add(new Node(x,y,2,0,0));
		visit[x][y]=true;
		
		int rst=0;
		while(!q.isEmpty()) {
			//�ʱⰪ
			int initX=99,initY=99;
			int eat =0, big=0,cnt=0;
			
			int size = q.size();
			
			 for(int j=0; j<size; j++) {
				Node cur = q.poll();
				
				for(int i=0; i<4; i++) {
					int nx = cur.x +dx[i];
					int ny = cur.y +dy[i];
					
					if(nx>=0 && ny>=0 && nx<n && ny<n) {
					if(!visit[nx][ny]) {
						if(map[nx][ny]<=cur.big) {
							visit[nx][ny]=true;
							q.add(new Node(nx,ny,cur.big,cur.eat,cur.cnt+1));
							
							if(map[nx][ny] !=0 && map[nx][ny] != cur.big) {
								if(nx<initX) {
								initX = nx;
								initY=ny;
								eat = cur.eat;
								big = cur.big;
								cnt = cur.cnt+1;
								}else if(nx==initX) {
									if(ny<initY) {
										initY = ny;
										initX = nx;
										eat = cur.eat;
										big = cur.big;
										cnt = cur.cnt+1;
										
										}
									}
								}
							}
						}
					}
				}
			}
			 if(initX != 99) {
				 eat++;
				 
				 if(eat==big) {
					 big++;
					 eat=0;
				 }
				 
				 map[x][y]=0;
				 map[initX][initY]=9;
				 rst+=cnt;
				 x = initX; y = initY;
				 visit = new boolean[n][n];
				 q.clear();
				 visit[initX][initY]=true;
				 
				 q.add(new Node(initX,initY,big,eat,0));
			 }
		}//bfs while loop
		
		bw.write(String.valueOf(rst));
		bw.flush();
	}
 

}// class

  class Node  {
	  int x,y,big,eat,cnt;
	  public Node(int x, int y, int big, int eat, int cnt) {
		// TODO Auto-generated constructor stub
		  this.x=x;
		  this.y=y;
		  this.big=big;
		  this.eat=eat;
		  this.cnt=cnt;
		  
	}
	  
  }