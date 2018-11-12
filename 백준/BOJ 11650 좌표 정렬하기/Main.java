import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static int n;
   static Node[] list;
   
   
    public static void main(String[] args) throws IOException {
    	
    	 n = Integer.parseInt(br.readLine());// 1¹ø °³¼ö
    	 list = new Node[n];
    	 
    	 
    	 for(int i=0; i<n; i++) {
    		 st = new StringTokenizer(br.readLine());
    		 int x = Integer.parseInt(st.nextToken());
    		 int y = Integer.parseInt(st.nextToken());
     
    		 list[i] = new Node(x,y);
    	 }
    	 Arrays.sort(list);
    	 
    	 for(int i=0; i<n; i++) {
    		 bw.write(String.valueOf(list[i].x + " "+ list[i].y + "\n"));
    		 
    	 }
 
    	 bw.flush();
   
   
    	 
    	} //main

	 		 
 	}//class

class Node implements Comparable<Node>{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
		
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		return this.x <o.x ? -1 : this.x > o.x ? 1 : this.y < o.y ? -1 : 1;
		
	}
}