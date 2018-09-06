import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;


		
		public class Main {
			
			
			
			static boolean visit[];
			
			
			static int dx[] = {0,0,-1,1};
			static int dy[] = {1,-1,0,0};
			
			public static void main(String args[]) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
				
				int test_case = Integer.parseInt(br.readLine());
				for(int T=0; T<test_case; T++) {
					
				visit = new boolean[10001];
				StringTokenizer st = new StringTokenizer(br.readLine());
				int a = Integer.parseInt(st.nextToken());
				int b = Integer.parseInt(st.nextToken());
				
				Queue<Node> q = new LinkedList<Node>();
				q.add(new Node(a,""));
				visit[a]= true;
				while(!q.isEmpty()) {
					Node cur = q.poll();
					if(cur.n == b) {
						bw.write(String.valueOf(cur.getCommand()+"\n"));
						bw.flush();
					}
					if(!visit[D(cur.n)]) {
						int tmp = D(cur.n);
						visit[tmp]=true;
						StringBuilder sb = new StringBuilder(cur.getCommand());
						q.add(new Node(tmp, sb.append("D").toString()));
					}
					
					if(!visit[S(cur.n)]) {
						int tmp = S(cur.n);
						visit[tmp]=true;
					StringBuilder sb = new StringBuilder(cur.getCommand());
					q.add(new Node(tmp , sb.append("S").toString()));
					}
					
					if(!visit[L(cur.n)]) {
						int tmp =L(cur.n);
						visit[tmp]=true;
						StringBuilder sb = new StringBuilder(cur.getCommand());
						q.add(new Node(tmp , sb.append("L").toString()));
					}
					
					if(!visit[R(cur.n)]) {
						int tmp = R(cur.n);
						visit[tmp]=true;
						StringBuilder sb = new StringBuilder(cur.getCommand());
						q.add(new Node(tmp , sb.append("R").toString()));
					}
					
				}// while_end
					
				
				
				}//test_case
				bw.flush();
				System.exit(0);
				
			}// main

			private static int R(int n) {
				// TODO Auto-generated method stub
				return (n%10)*1000 +(n/10);
			}

			private static int L(int n) {
				// TODO Auto-generated method stub
				return (n%1000)*10 + n/1000;
			}

			private static int S(int n) {
				// TODO Auto-generated method stub
				 return (n == 0) ? 9999 : n-1;
			}

			private static int D(int n) {
				// TODO Auto-generated method stub
				return (n*2) % 10000;
			}

	 
 
		}
		
		class Node{
		int n;
		String com;
		public Node(int n, String com) {
			// TODO Auto-generated constructor stub
			this.n=n;
			this.com=com; 
		}
		
		public int getNum() {
			return n;
		}
		public String getCommand() {
			return com;
		}
		}