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
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
    
   static int a,b,c;
   
    public static void main(String[] args) throws IOException {
    	st = new StringTokenizer(br.readLine());
    	a = Integer.parseInt(st.nextToken());
    	b = Integer.parseInt(st.nextToken());
    	c = Integer.parseInt(st.nextToken());
    	
    	Queue<Node> q = new LinkedList<>();
    	q.add(new Node(a,b,c));
    	boolean flag = false;
    	
    	int step=0;
    	while(!q.isEmpty()) {
    		step++;
    		Node cur = q.poll();
    		if(step>=10000)break;
    		if(cur.a == cur.b && cur.b == cur.c && cur.a == cur.c) {
    			flag=true;
    			break;
    		}
    		 
    		 int a = cur.a;
    		 int b = cur.b;
    		 int c = cur.c;
    		 
    		 
    		 if(a<b) {
    			 b =b-a;
    			 a *=2;
    			 q.add(new Node(a,b,c));
    		 }
    		 //init
    		 a=cur.a;
    		 b=cur.b;
    		 c=cur.c;
    		 if(a>b) {
    			 a = a-b;
    			 b *=2;
    			 q.add(new Node(a,b,c));
    		 }
    		 //init
    		 a=cur.a;
    		 b=cur.b;
    		 c=cur.c;
    		 if(b<c) {
    			 c = c-b;
    			 b *=2;
    			 q.add(new Node(a,b,c));
    		 }    		 //init
    		 a=cur.a;
    		 b=cur.b;
    		 c=cur.c;
    		 if(b>c) {
    			 b = b-c;
    			 c *=2;
    			 q.add(new Node(a,b,c));
    		 }
    		 //init
    		 a=cur.a;
    		 b=cur.b;
    		 c=cur.c;
    		 if(a>c) {
    			 a = a-c;
    			 c *=2;
    			 q.add(new Node(a,b,c));
    		 }
    		 //init
    		 a=cur.a;
    		 b=cur.b;
    		 c=cur.c;
    		 if(a<c) {
    			 c = c-a;
    			 a *=2;
    			 q.add(new Node(a,b,c));
    		 }
    		 
    	
    	}//while-end
    	
    	if(flag)bw.write(String.valueOf(1));
    	else bw.write(String.valueOf(0));
    	
    	bw.flush();
    	
   }//main 
 

}// class
 
class Node	{
	int a,b,c;
	public Node(int a, int b, int c) {
		// TODO Auto-generated constructor stub
		this.a=a;
		this.b=b;
		this.c=c;
	}
}