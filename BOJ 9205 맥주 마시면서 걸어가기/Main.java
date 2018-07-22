	import java.awt.Point;
	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.Arrays;
	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.StringTokenizer;
	import java.util.concurrent.SynchronousQueue; 
	
	
	public class Main {

		public static void main(String[] args) throws IOException {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
			BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

			int T =Integer.parseInt(br.readLine());
			
			while(T-->0) {
				int n = Integer.parseInt(br.readLine())+2;
				int max=102; //편의점 개수
				int d[][] = new int[max][max];
				LinkedList<Node> pos = new LinkedList<Node>();
				
				for(int i=0; i<n; i++) {
					StringTokenizer st = new StringTokenizer(br.readLine());
					int a = Integer.parseInt(st.nextToken());
					int b = Integer.parseInt(st.nextToken());
					pos.add(new Node(a,b));
				}
				
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(i !=j) {
							d[i][j] =max;
						}
					}
				}
				
				for(int i=0; i<n; i++) {
					for(int j=0; j<n; j++) {
						if(i==j)continue;
						
						Node node = pos.get(i);
						Node next = pos.get(j);
						
						int distance = Math.abs(node.x -next.x)+Math.abs(node.y - next.y);
						if(distance <=1000) {
							d[i][j]=1;
						}
					}
				}
				
				f(d,n);
				
				n -= 2;
				if(0<d[0][n+1] && d[0][n+1]<max) {
					bw.write(String.valueOf("happy"+"\n"));
				}else {
					bw.write(String.valueOf("sad"+"\n"));
				}
				
			}//test_case
			
			bw.flush();
		}

		private static void f(int[][] d, int n) {
			// TODO Auto-generated method stub
		for(int k=0; k<n; k++) {	
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(d[i][j] > d[i][k] +d[k][j])d[i][j] = d[i][k] + d[k][j];
					}
				}
			}
		}
	}
	class Node{
		int x,y;
		public Node(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x= x;
			this.y= y;
		}
	}