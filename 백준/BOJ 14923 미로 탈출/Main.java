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
			
			static int n,m,sx,sy,ex,ey;
			static int[][] map;
			static boolean visit[][][];
			static int min= Integer.MAX_VALUE;
			
			static int dx[] = {0,0,-1,1};
			static int dy[] = {1,-1,0,0};
			
			public static void main(String args[]) throws IOException {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
				StringTokenizer st =new StringTokenizer(br.readLine());
				n = Integer.parseInt(st.nextToken());
				m = Integer.parseInt(st.nextToken());
				
				map = new int[n][m];
				visit = new boolean[n][m][2];
				
				Node start,end;
				
				st =new StringTokenizer(br.readLine());
				sx = Integer.parseInt(st.nextToken())-1;
				sy = Integer.parseInt(st.nextToken())-1;
				start = new Node(sx,sy,0);
				
				st =new StringTokenizer(br.readLine());
				ex = Integer.parseInt(st.nextToken())-1;
				ey = Integer.parseInt(st.nextToken())-1;
				end = new Node(ex,ey,0);
				
				for(int i=0; i<n; i++) {
					st =new StringTokenizer(br.readLine());
					for(int j=0; j<m ;j++) {
						map[i][j] = Integer.parseInt(st.nextToken());
					}
				}//insert
			
					
					
					Queue<Node> q = new LinkedList<Node>();
					q.add(start);
					visit[start.x][start.y][0]=true;
					visit[start.x][start.y][1]=true;
					int rst=-1;
					boolean flag =false;
					while(!q.isEmpty() && !flag) {
						rst++;
						int size = q.size();
						
						for(int i=0; i<size; i++) {
						Node cur =q.poll();
						int x= cur.x;
						int y= cur.y;
						//종료조건
						if(x == end.x && y == end.y) {
							flag = true;
							bw.write(String.valueOf(rst));
							break;
						}
						
						for(int j=0; j<4; j++) {
							int nx = x +dx[j];
							int ny = y +dy[j];
							//범위안에있고
							if(nx >=0 && ny>=0 && nx<n && ny<m) {
								//다음칸이 벽이라면
								if(map[nx][ny] ==1) {
									if(cur.broke<1 && !visit[nx][ny][1]) {
										q.add(new Node(nx,ny,1));
										visit[nx][ny][1]=true;
									}
								}
								//다음칸이 빈칸
								else {
									if(!visit[nx][ny][cur.broke]) {
										q.add(new Node(nx,ny,cur.broke));
										visit[nx][ny][cur.broke]=true;
									}
								}
							}
							
						}
						
						}
					}//while _ end
					
					if(!flag)bw.write(String.valueOf(-1));
					bw.flush();
					 
					
				
			}
		}
		
		class Node{
			int x,y,broke;
			public Node(int x, int y, int broke) {
				// TODO Auto-generated constructor stub
				this.x=x;
				this.y=y;
				this.broke =broke;
			}
		}