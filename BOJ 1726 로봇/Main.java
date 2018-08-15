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
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
 
	 static int R,C;
	 static int map[][];
	 static boolean visit[][][];
	 
	 static int movecnt=0, min=Integer.MAX_VALUE;
	 
	 static int dx[] =  {0, -1, 0, 1}; //µ¿³²¼­ºÏ
	 static int dy[] =  {-1, 0, 1, 0};

	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		  
	 
		StringTokenizer st= new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		map = new int[R][C];
		visit = new boolean[R][C][4];
		Node[] cur = new Node[2];
		for(int i=0; i<R; i++) {
			st= new StringTokenizer(br.readLine());
			for(int j=0; j<C; j++) {
			map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<2; i++) {
			st= new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			int dir = Integer.parseInt(st.nextToken());
				//µ¿³²¼­ºÏ
			cur[i] = new Node(x,y,dir == 1 ? 0 :dir ==2 ? 2 : dir ==3 ? 1 : 3 );
		}
			Queue<Node> q = new LinkedList<Node>();
			int rst =-1;
			q.add(cur[0]);
			visit[cur[0].x][cur[0].y][cur[0].dir] = true;
			
			while(!q.isEmpty()) {
				rst++;
				
				int size = q.size();
				for(int i=0; i<size; i++) {
					Node curNode = q.poll();
					
					if(curNode.x == cur[1].x && curNode.y == cur[1].y) {
						if(curNode.dir == cur[1].dir) {
							bw.write(String.valueOf(rst));
							bw.flush();
							return;
						}
					}
					
					for(int j=1; j<=3; j++) {
						int nx = curNode.x + j*dx[curNode.dir];
						int ny = curNode.y + j*dy[curNode.dir];
						
						if( nx>0 || ny>0 || nx>=R || ny >=C)continue;
						if(visit[nx][ny][curNode.dir])continue;
						if(map[nx][ny]==1)break;
						
						q.add(new Node(nx,ny,curNode.dir));
						visit[nx][ny][curNode.dir] = true;
					}
					
					int ndir = curNode.dir +1 > 3 ? 0 : curNode.dir+1;
					if(visit[curNode.x][curNode.y][ndir])continue;
					q.add(new Node(curNode.x, curNode.y, ndir));
					visit[curNode.x][curNode.y][ndir] =true;
					
					ndir = curNode.dir -1 <0 ? 3 : curNode.dir-1;
					if(visit[curNode.x][curNode.y][ndir])continue;
					
					q.add(new Node(curNode.x, curNode.y, ndir));
					visit[curNode.x][curNode.y][ndir] =true;
				}
			} 
		}
	}

  class Node{
	  int x,y,dir;
	  public Node(int x, int y, int dir) {
		// TODO Auto-generated constructor stub
		  this.x=x;
		  this.y=y;
		  this.dir=dir;
	}
  }
