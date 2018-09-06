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
		
	static char map[][] = new char[5][5];
	static boolean visit[], tmp[][];
	
	static int dx[] = {1,0,-1,0};
	static int dy[] = {0,-1,0,1};
	static int ans=0,cnt=0;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 //insert		  
		for(int i=0; i<5; i++) {
			String a = br.readLine();
			for(int j=0; j<5; j++) {
				 map[i][j] = a.charAt(j);	
			}
		}
		
		
		//solve
		for(int i=0; i<25; i++) {
			visit = new boolean[25];
			tmp = new boolean[5][5];
			dfs(i,1,0);
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		
	}
	private static void dfs(int n, int cnt, int s) {
		// TODO Auto-generated method stub
		if(map[n/5][n%5] =='S')++s;
		
		visit[n]=true;
		tmp[n/5][n%5]=true;
		
		if(7 == cnt) {
			if(s>=4) {
				find();
			}
		}else {
			for(int i=n+1; i<25; i++) {
				if(!visit[i]) {
					dfs(i, cnt+1,s);
				}
			}
		}
		visit[n]= false;
		tmp[n/5][n%5]=false;
	}
	private static void find() {
		// TODO Auto-generated method stub
		for(int i=0; i<25; i++) {
			if(visit[i]) {
				int x = i/5;
				int y = i%5;
				
				boolean[][] visit = new boolean[5][5];
				visit[x][y]=true;
				cnt=1;
				isComponent(x,y,visit);
				return;
			}
		}
	}
	private static void isComponent(int x, int y, boolean[][] check) {
		// TODO Auto-generated method stub
		if(7==cnt)ans++;
		else {
			for(int i=0; i<4; i++) {
				int nx = dx[i] +x;
				int ny = dy[i] +y;
				if(0<=nx && ny>=0 && nx<5 && ny<5) {
					if(tmp[nx][ny] && !check[nx][ny]) {
						check[nx][ny]=true;
						cnt++;
						isComponent(nx,ny,check);
						
					}
				}
			}
		}
	}
  }
