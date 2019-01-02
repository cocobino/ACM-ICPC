import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static char map[][];
	static int n,m;
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
 
	static boolean visit[][];
	static int krst=0,vrst=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		 n = Integer.parseInt(st.nextToken());
		 m = Integer.parseInt(st.nextToken());
	 
		 map = new char[n][m];
		 visit = new boolean [n][m];
		 
		 for(int i=0; i<n; i++) {
			 String a =br.readLine();
			 for(int j=0; j<m; j++) {
				 map[i][j] = a.charAt(j);
			 }
		 }//insert
		 
		 /*sol bfs*/
		 for(int i=0; i<n; i++) {
			 for(int j=0; j<m; j++) {
				 if(!visit[i][j] && (map[i][j]=='.' || map[i][j]=='k'
			 || map[i][j]=='v')) {
					 bfs(i,j);
				 }
			 }
		 }
		 
		 bw.write(String.valueOf(krst + " " + vrst));
		 bw.flush();
		
	}//main

	private static void bfs(int x, int y) {
		// TODO Auto-generated method stub
		int vcnt=0,kcnt=0;
		if(map[x][y] == 'k')kcnt++;
		else if(map[x][y] == 'v')vcnt++;
		
		Queue<Node> q = new LinkedList<>();
		visit[x][y] =true;
		q.add(new Node(x,y));
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			
			int curx = cur.x;
			int cury = cur.y;
			
			for(int i=0; i<4; i++) {
				int nx = curx + dx[i];
				int ny = cury + dy[i];
				
				if(nx>=0 && ny>=0 && nx<n && ny<m) {
					if(!visit[nx][ny] && map[nx][ny]!='#') {
						//ºóÄ­ÀÏ°æ¿ì
						if(map[nx][ny]=='.') {
							q.add(new Node(nx,ny));
							visit[nx][ny]=true;
						} else if(map[nx][ny] =='v') {
							vcnt++;
							q.add(new Node(nx,ny));
							visit[nx][ny]=true;
						}
						else if(map[nx][ny]=='k') {
							kcnt++;
							q.add(new Node(nx,ny));
							visit[nx][ny]=true;
						}
					}
				}
			}
			
			
		}//bfs
		
		if(kcnt>vcnt) {
			krst+=kcnt;
		}else {
			vrst+=vcnt;
		}
		
	}
		
	 	
		 
}// class

class Node{
	int x,y ;
	public Node(int x, int y ) {
		// TODO Auto-generated constructor stub
		this.x =x ;
		this.y=y; 
	 
	}
}