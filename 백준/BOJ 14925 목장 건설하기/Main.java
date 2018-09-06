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
			
			static int n,m;
			static int map[][],dp[][];
			
			
			static int dx[] = {0,0,-1,1};
			static int dy[] = {1,-1,0,0};
			static int  answer;
			public static void main(String args[]) throws IOException {
				
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
				StringTokenizer st =new StringTokenizer(br.readLine());
				n = Integer.parseInt(st.nextToken());
				m = Integer.parseInt(st.nextToken());
				
				map = new int[n+1][m+1];
				dp = new int[n+1][m+1];
				
				for(int i=1; i<=n; i++) {
					st =new StringTokenizer(br.readLine());
					for(int j=1; j<=m ;j++) {
						map[i][j] = Integer.parseInt(st.nextToken());
					}
				}//insert
			int ans=0;
			
				for(int i=1; i<=n; i++) {
					for(int j=1; j<=m ; j++) {
						if(map[i][j] ==0) {
							dp[i][j] = Math.min(Math.min(dp[i-1][j],dp[i][j-1]), dp[i-1][j-1])+1;
							ans = Math.max(dp[i][j], ans);
						}
					}
				}
				bw.write(String.valueOf(ans));
				bw.flush();
				
			}//main

			 	
			
		}
		
		class Node{
			int x,y ;
			public Node(int x, int y) {
				// TODO Auto-generated constructor stub
				this.x=x;
				this.y=y;
			 
			}
		}