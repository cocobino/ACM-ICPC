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
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
	static int r,c;
	static int map[][];
	static boolean visit[][];
	
	static int dx[] = {0,1,0,-1 ,1, 1,-1,-1};
	static int dy[] = {1,0,-1,0 ,1,-1,-1, 1};
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		Scanner sc = new Scanner(System.in);
		while(true) {
		//st = new StringTokenizer(br.readLine());
		r =sc.nextInt();
		c =sc.nextInt();
		if(r==0 && c ==0)break;
		map = new int [c][r];
		visit=  new boolean[c][r];
		
		for(int i=0; i<c; i++) {
			 //st = new StringTokenizer(br.readLine());
			for(int j=0; j<r; j++) {
				map[i][j] = sc.nextInt();
			}
		}
		// insert
		int ans=0;
		for(int i=0; i<c; i++) {
			for(int j=0; j<r; j++) {
				if(!visit[i][j] && map[i][j]==1) {
					ans++;
					dfs(i,j);
				}
			}
		}
		bw.write(String.valueOf(ans +"\n"));
		bw.flush();
		
		}//while -loop
	
		
	}




	private static void dfs(int x, int y) {
		// TODO Auto-generated method stub
		if(visit[x][y])return;
		visit[x][y]=true;
		
		for(int i=0; i<8; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(inRange(nx,ny) && map[nx][ny]==1 && !visit[nx][ny]) {
				dfs(nx,ny);
			}
		}
		
	}




	private static boolean inRange(int nx, int ny) {
		// TODO Auto-generated method stub
		if(nx>=0 && ny>=0 && nx<c && ny<r)return true;
		return false;
	}

}