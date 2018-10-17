import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
     
   
   static int n,k;
   static int map[][];
   static boolean visit[][];
   
   static int dx[] = {0,0,-1,1};
   static int dy[] = {-1,1,0,0}; //좌,우,위,아래
   
    public static void main(String[] args) throws IOException {
   st = new StringTokenizer(br.readLine());
   n = Integer.parseInt(st.nextToken());
   k = Integer.parseInt(st.nextToken());
   
   String line1 = br.readLine();
   String line2 = br.readLine();
   
   map = new int[2][n];
   visit = new boolean[2][n];
   
   
   for(int i=0; i<line1.length(); i++) {
	   map[0][i] = line1.charAt(i)-'0';
   }
   
   for(int i=0; i<line2.length(); i++) {
	   map[1][i] = line2.charAt(i)-'0';
   }//insert
   
   Node start = new Node(0,0,0);
   Queue<Node> q = new LinkedList<>();
   q.add(start);
   boolean flag = false;
   
   //visit[0][0]=true;
   
   int step=0;
   while(!q.isEmpty() && !flag) {
	   
	   Node cur = q.poll();
	   
	   if(cur.step>=n)break;
	   
	   int x = cur.x;
	   int y = cur.y;
	   int stp = cur.step;
	   //case 1 : ->, <-
	   
	   for(int i=0; i<2; i++) {
		   int nx = x +dx[i];
		   int ny = y +dy[i];
		   if(ny>=n)flag=true;
		   
		   if(nx>=0 && ny>cur.step && nx<2 && ny<n) {
			   if(map[nx][ny] ==1 && ! visit[nx][ny]) {
				   q.add(new Node(nx,ny,cur.step+1));
				   visit[nx][ny]=true;
			   }
		   } 
	   }
	   
	   //case 2 : 아래, 위
	   for(int i=2; i<4; i++) {
		   int nx = x+dx[i];
		   int ny = y+dy[i]+k;
		   if(ny>=n)flag=true;
		   
		   if(nx>=0 && ny>cur.step && nx<2 && ny<n) {
			  if(map[nx][ny] ==1 && ! visit[nx][ny]) {
				  q.add(new Node(nx,ny,cur.step+1));
				  visit[nx][ny]=true;
			  }
		   } 
	   }
	   
	 
	   
	   
   }//bfs
	   
   if(flag)bw.write(String.valueOf(1));
   else bw.write(String.valueOf(0));
   bw.flush();
   
   
   }//main 

 

}// class
  

 class Node{
	 int x,y,step;
	 public Node(int x, int y, int step) {
		// TODO Auto-generated constructor stub
		 this.x=x;
		 this.y=y;
		 this.step=step;
	}
 }