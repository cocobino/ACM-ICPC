import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	 static int r,c,n;
	 static int map[][];
	 
	 static int dx[] = {1,0,-1,0};
	 static int dy[] = {0,1,0,-1};
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		Node node[] = new Node[3];
		for(int i=0; i<3; i++) {
			st= new StringTokenizer(br.readLine());
			node[i] = new Node(Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}//insert
		
		Arrays.sort(node);
		double rst1=0,rst2=0,rst3=0;
		if((node[1].x - node[0].x) !=0)
		 rst1 = (double)((node[1].y - node[0].y)/(double)(node[1].x - node[0].x));
		else rst1 = 1;
		
		if((node[2].x - node[1].x) !=0)
		 rst2 = (double)((node[2].y - node[1].y)/(double)(node[2].x - node[1].x));
		else rst2 = 1;
		
		if((node[2].x - node[0].x) !=0)
		 rst3 = (double)((node[2].y - node[0].y)/(double)(node[2].x - node[0].x));
		else rst3 = 1;
		
		if(rst1 == rst2 && rst2 == rst3 && rst1 ==rst3) {
			System.out.println("WHERE IS MY CHICKEN?");
		}
		else {
			System.out.println("WINNER WINNER CHICKEN DINNER!");
		}
		
		
		
	}//main
 	 
}// class
 
class Node implements Comparable<Node>{
	int x,y;

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.x>o.x)return 1;
		else if(this.x < o.x)return -1;
		else {
			if(this.y > o.y)return 1;
			else if(this.y <o.y)return -1;
			else return 0;
		}
	}
	
}