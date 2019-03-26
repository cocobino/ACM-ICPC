import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int r, c, n;
	static char map[][];
	static boolean vis[][];

	static int dx[] = { 1, 0, -1, 0 }; // го , ©Л, ╩С, аб
	static int dy[] = { 0, 1, 0, -1 };
	
	static final int down = 0;
	static final int right=1;
	static final int up =2;
	static final int left=3;
	
	static int stx,sty;
	static boolean flag;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

		st =new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		map = new char[r][c];
		
		for(int i=0; i<r; i++) {
			String a =br.readLine();
			for(int j=0; j<a.length(); j++) {
				map[i][j] = a.charAt(j);
			}
		}//insert
		
		//sol
		flag =false;
		for(int i=0; i<r&&!flag; i++) {
			for(int j=0; j<c&&!flag; j++) {
				stx=i;sty=j;
				vis = new boolean[r][c];
				dfs(i,j,0,map[i][j],0);
			}
		}
		
		if(flag)System.out.println("Yes");
		else System.out.println("No");
	}// main

	private static void dfs(int x, int y, int dir, char nxt, int cnt) {
		// TODO Auto-generated method stub
	 
		vis[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(nx>=0 && ny>=0 && nx<r && ny<c) {
			 
				if(map[nx][ny]==nxt) {
					if(!vis[nx][ny]) {
						dfs(nx,ny,i,nxt,cnt+1);
					}
					else if(vis[nx][ny] && cnt>=3) {
						if(nx==stx && ny ==sty) {
							flag=true;
							return;
						}
					}
					
				}
			}
		}
		
		

			

		
	}
}// class
