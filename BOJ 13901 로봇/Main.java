	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.Scanner;
	import java.util.StringTokenizer;
	
	public class Main {
		 
		 static int r,c,startx,starty;	 
		 static int  map[][];
		 static boolean visit[][];
		 
		 static int dx[] = {-1,1,0,0};
		 static int dy[] = {0,0,-1,1};
		 
		 static final int wall = -1;
		 static final int robot =1;
		public static void main(String args[]) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
			StringTokenizer st= new StringTokenizer(br.readLine());
			r = Integer.parseInt(st.nextToken());
			c = Integer.parseInt(st.nextToken());
	 
			map = new int[1001][1001];
			visit = new boolean[1001][1001];
			
			int n = Integer.parseInt(br.readLine()); //장애물개수
			
			for(int i=0; i<n; i++) {
				st= new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				map[x][y]=wall;
				visit[x][y]=true;
			}//장애물 설치
			
			//시작위치
			st= new StringTokenizer(br.readLine());
			startx = Integer.parseInt(st.nextToken());
			starty = Integer.parseInt(st.nextToken());
			map[startx][starty]= robot;
			visit[startx][starty]=true;
			
			int d=0;
			boolean flag =false;	
			int command[] = new int[4];
			st= new StringTokenizer(br.readLine());
			for(int i=0; i<4; i++)command[i]=Integer.parseInt(st.nextToken())-1;
				
			while(true){
				int nx = startx+dx[command[d]], ny = starty+dy[command[d]];
				if(nx<0 || nx>=r || ny<0 || ny>=c || visit[nx][ny] || map[nx][ny]==wall){
					int k;
					for(k=1; k<4; k++){
						d = (d+1)%4;
						nx = startx+dx[command[d]]; ny = starty+dy[command[d]];
						if(nx>=0 && nx<r && ny>=0 && ny<c && !visit[nx][ny]) break;
					}
					if(k == 4) break;
				}
				visit[nx][ny] = true;
				startx = nx;
				starty = ny;
			}
			
			bw.write(String.valueOf(startx+" "+starty));
			bw.flush();
		}
		
	 
		}
		