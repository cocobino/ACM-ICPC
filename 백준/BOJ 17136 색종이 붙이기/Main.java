import java.util.*;
import java.io.*;

public class Main {

		static boolean vis[][][][][][][];
		static int map[][];
		static int r,c,d;
		static int rst;
		static int dx[] = {0,0,-1,1};
		static int dy[] = {1,-1,0,0};
		static int endcnt=0;
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	 
		rst = Integer.MAX_VALUE;
		map = new int[10][10];
		vis = new boolean[10][10][7][7][7][7][7];
		for(int i=0; i<10; i++) {
			st =new StringTokenizer(br.readLine());
			for(int j=0; j<10; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
				if(map[i][j] == 1)endcnt++;
			}
		}//insert
		
		dfs(0,map,0,0,0,0,0);
 
		//(rst == Integer.MAX_VALUE)System.out.println(-1);
		 System.out.println(rst);
	}//main

	private static void dfs(int depth, int[][] prev, int one, int two, int three, int four, int five) {
		if(endoption(prev)) {
			rst = Math.min(rst, one+two+three+four+five);
			return;
		}
		if(one>5 || two >5 || three>5 || four>5 || five>5)return;
		if(one+two+three+four+five > rst)return;
		
		int tmp[][] = new int[10][10];
		deepcopy(tmp,prev);
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				for(int size=5; size>=1; size--) {
					if(inrage(i,j, size) && ispossible(i,j,size,tmp)) {
						draw(i,j,size,tmp);
						switch(size) {
						case 1:
							if(!vis[i][j][one+1][two][three][four][five]) {
								vis[i][j][one+1][two][three][four][five]=true;
							dfs(depth+1, tmp, one+1, two, three, four, five);
							}
							break;
						case 2:
							if(!vis[i][j][one][two+1][three][four][five]) {
								vis[i][j][one][two+1][three][four][five]=true;
							dfs(depth+1, tmp, one, two+1, three, four, five);
							}
							break;
						case 3:
							if(!vis[i][j][one][two][three+1][four][five]) {
								vis[i][j][one][two][three+1][four][five]=true;
							dfs(depth+1, tmp, one, two, three+1, four, five);
							}
							break;
						case 4:
							if(!vis[i][j][one][two][three][four+1][five]) {
								vis[i][j][one][two][three][four+1][five]=true;
							dfs(depth+1, tmp, one, two, three, four+1, five);
							}
							break;
						case 5:
							if(!vis[i][j][one][two][three][four][five+1]) {
								vis[i][j][one][two][three][four][five+1]=true;
							dfs(depth+1, tmp, one, two, three, four, five+1);
							}
							break;
							
						}
						deepcopy(tmp,prev);
					}
				}
			}
		}
		
	}

	private static void draw(int x, int y, int size, int[][] tmp) {
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				if(size==1)tmp[i][j]=6;
				else tmp[i][j]=size;
			}
		}
		
	}

	private static boolean inrage(int x, int y, int size) {
		if(x+size<=10 && y+size<=10)return true;
		return false;
	}

	private static boolean ispossible(int x, int y, int size, int[][] tmp) {
		// TODO Auto-generated method stub
		for(int i=x; i<x+size; i++) {
			for(int j=y; j<y+size; j++) {
				if(tmp[i][j] != 1)return false;
			}
		}
		return true;
	}

	private static void deepcopy(int[][] tmp, int[][] prev) {
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				tmp[i][j] = prev[i][j];
			}
		}
		
	}

	private static boolean endoption(int[][] prev) {
		int cnt=0;
		for(int i=0; i<10; i++) {
			for(int j=0; j<10; j++) {
				if(prev[i][j]>=2 && prev[i][j]<=6) {
					cnt++;
				}
			}
		}
		if(cnt==endcnt)return true;
		return false;
	}

 
  
}//class
 