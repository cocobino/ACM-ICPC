import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static boolean visit[][];
	
	static int dx[] = {-1,0,1,0}; //ºÏ,µ¿,³²,¼­
	static int dy[] = {0,1,0,-1};
	static int stx,sty,stdir;
	static int maxx=Integer.MIN_VALUE,maxy=Integer.MIN_VALUE,minx=Integer.MAX_VALUE,miny=Integer.MAX_VALUE;
	
	
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
		 int n = Integer.parseInt(br.readLine());
	
		 
		 for(int i=0; i<n; i++) {
			 stx =0; sty = 0; stdir=0;
			 maxx=Integer.MIN_VALUE;maxy=Integer.MIN_VALUE;minx=Integer.MAX_VALUE;miny=Integer.MAX_VALUE;
			 String in = br.readLine();
			 dist();
			 for(int j=0; j<in.length(); j++) {
				 switch(in.charAt(j)) {
				 case 'F':
					 movefront(stx, sty, stdir);
					 break;
				 case 'B':
					 moveback(stx, sty, stdir);
					 break;
				 case 'L':
					 turnleft(stx, sty, stdir);
					 break;
				 case 'R':
					 turnright(stx, sty, stdir);
					 break;
				 }
			 }
			
			 int rst = (maxx-minx)*(maxy-miny);
			 bw.write(String.valueOf(rst+"\n"));
			 bw.flush();
			 
			 
			 
		 }//for loop
		 
	}//main

	 

	private static void dist() {
		// TODO Auto-generated method stub
		minx =Math.min(minx,stx);
		miny =Math.min(miny,sty);
		maxx =Math.max(maxx,stx);
		maxy =Math.max(maxy,sty);
	}



	private static void turnright(int x, int y, int dir) {
		// TODO Auto-generated method stub
		int curdir=-1;
		if(dir==3)dir=0;
		else dir++;
		curdir = dir;
		stdir = curdir;
		
	}

	private static void turnleft(int x, int y, int dir) {
		// TODO Auto-generated method stub
		int curdir;
		if(dir==0)dir=3;
		else dir--;
		curdir=dir;
		stdir = curdir;
	}

	private static void moveback(int x, int y, int dir) {
		// TODO Auto-generated method stub
		int nx = x+dx[dir];
		int ny = y+dy[dir];
		stx=nx;
		sty=ny;
		dist();
		
		
	}

	private static void movefront(int x, int y, int dir) {
		// TODO Auto-generated method stub
		int nx = x-dx[dir];
		int ny = y-dy[dir];

		stx=nx;
		sty=ny;
		dist();
	}
 
}//class

class Node{
	int x,y,dir;
	public Node(int x, int y, int dir) {
		// TODO Auto-generated constructor stub
		x= this.x;
		y= this.y;
		dir = this.dir;
	}
	
}