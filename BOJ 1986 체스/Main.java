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
		
 	static char map[][];
 	static boolean safe[][];
 	static int r,c;
 	static int xx,yy;	
 	
	static int qdx[] = {0,1,0,-1, 1,-1,-1,1};
 	static int qdy[] = {1,0,-1,0, 1,1,-1,-1};
 	
 	static int kdx[] = {1,2,2,1,-1,-2,-2,-1};
 	static int kdy[] = {2,1,-1,-2,-2,-1,1,2};
 	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		map = new char[r][c];
		safe = new boolean[r][c];
		for(int i=0; i<r; i++)Arrays.fill(map[i], '0');
		st = new StringTokenizer(br.readLine());
		int Q = Integer.parseInt(st.nextToken());
		for(int i=0; i<Q; i++) {
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			map[x][y]='Q';
			
		}
		st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		for(int i=0; i<K; i++) {
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			map[x][y]='K';
			
		}
		st = new StringTokenizer(br.readLine());
		int P = Integer.parseInt(st.nextToken());
		for(int i=0; i<P; i++) {
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			map[x][y]='P';
			safe[x][y]=true;
		}
		
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				switch(map[i][j]) {
				case 'Q':
					xx=i;yy=j;
					Queen(i,j,0);
					break;
				case 'K':
					Knight(i,j,0);
					break;
				}
			}
		}
		int rst=0;
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(!safe[i][j])rst++;
			}
		}
		
		
		bw.write(String.valueOf(rst));
		bw.flush();
	}


	private static void Knight(int x, int y, int dir) {
		// TODO Auto-generated method stub
		safe[x][y]=true;
		 for(int i=0; i<8; i++) {
			 int nx = x+kdx[i];
			 int ny = y+kdy[i];
			 
			 if(nx>=0 && ny>=0 && nx<r && ny<c
					 && map[nx][ny] =='0') {
				 safe[nx][ny]=true;
			 }
		 }
			
	}


	private static void Queen(int x, int y, int dir) {
		// TODO Auto-generated method stub
		if(dir==8)return;
		safe[x][y] = true;
		int nx = x +qdx[dir];
		int ny = y +qdy[dir];
		
		if(nx<0 || ny<0 || nx>=r || ny>=c || map[nx][ny] !='0') {
			Queen(xx,yy,dir+1);
		}else {
			Queen(nx,ny,dir);
		}
		
	}

}
