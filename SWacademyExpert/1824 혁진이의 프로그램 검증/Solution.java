import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int tc = Integer.parseInt(br.readLine());
		for(int T=1; T<=tc; T++)solution(T);
	}//main

	//declare
	static char map[][];
	static boolean visit[][];
	static int memory;
//	static boolean memchk;
	static int n,m;
	static int curx,cury,dir;
	static boolean flag;
	
	static int dx[] = {0,0,-1,1};//©Л, аб, ╩С,го
	static int dy[] = {1,-1,0,0};
	
	private static void solution(int tc) throws NumberFormatException, IOException {
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		map = new char[n][m];
		visit = new boolean[n][m];
		
		memory = -1;
	//	memchk=false;
		
		for(int i=0; i<n; i++) {
			String a = br.readLine();
			for(int j=0; j<m; j++) {
				map[i][j] = a.charAt(j);
			}
		}//insert
	 
		curx=0;cury=0;dir=0;
		flag=false;
		
		Node start = new Node(0,0,0,false);
		Queue<Node> q = new LinkedList<Node>();
		q.add(start);
		int step=0;
		while(!q.isEmpty() && !flag) {
			step++;
			if(step>1000)break;
			
			Node cur = q.poll();
			int x =cur.x;
			int y = cur.y;
			int dir =cur.dir;
			if(map[cur.x][cur.y] == '>') {
				cur.dir=0;
			}else if(map[cur.x][cur.y]=='<') {
				cur.dir=1;
			}else if(map[cur.x][cur.y]=='^') {
				cur.dir=2;
			}else if(map[cur.x][cur.y]=='v') {
				cur.dir=3;
			}else if(map[cur.x][cur.y]=='_') {
				if(memory==0)cur.dir=0;
				else cur.dir=1;
			}else if(map[cur.x][cur.y]=='|') {
				if(memory==0)cur.dir=3;
				else cur.dir=2;
			}else if(map[cur.x][cur.y]=='?') {
				for(int i=0; i<4; i++) {
					if(flag)break;
					
					int nx = cur.x + dx[cur.dir];
					int ny = cur.y + dy[cur.dir];
					
					if(nx<0)nx=n-1;
					if(nx>=n)nx=0;
					if(ny<0)ny=m-1;
					if(ny>=m)ny=0;
					
					q.add(new Node(nx,ny,cur.dir,cur.memchk));
				}
			}else if(map[cur.x][cur.y]=='.') {
				
			}else if(map[cur.x][cur.y]>='0' && map[cur.x][cur.y]<='9') {
				cur.memchk=true;
				memory=map[cur.x][cur.y]-'0';
			}else if(map[cur.x][cur.y]=='+' && cur.memchk) {
				memory++;
				if(memory>15)memory=0;
			}else if(map[cur.x][cur.y]=='-' && cur.memchk) {
				memory--;
				if(memory<0)memory=15;
			}else if(map[cur.x][cur.y]=='@') {
				flag=true;
				break;
			}
			
			int nx = cur.x + dx[cur.dir];
			int ny = cur.y + dy[cur.dir];
			
			if(nx<0)nx=n-1;
			if(nx>=n)nx=0;
			if(ny<0)ny=m-1;
			if(ny>=m)ny=0;
			
			q.add(new Node(nx,ny,cur.dir,cur.memchk));
			
		}//while
		
		 
		 if(flag)bw.write(String.valueOf("#"+tc+" "+"YES"+"\n"));
		 else bw.write(String.valueOf("#"+tc+" "+"NO"+"\n"));
		 bw.flush();
	}//solution

 
	

	  	 
}//class

 class Node{
	 int x,y,dir;
	 boolean memchk;
	 public Node(int x, int y, int dir, boolean memchk) {
		// TODO Auto-generated constructor stub
		 this.x=x;
		 this.y=y;
		 this.dir=dir;
		 this.memchk=memchk;
	}
 }