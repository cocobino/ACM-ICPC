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
import java.util.Stack;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static Queue q;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
//		int tc = Integer.parseInt(br.readLine());
	 for(int T=1; T<=10; T++) {
		 n = Integer.parseInt(br.readLine());
 
		 String tree[][] = new String[n][3];
		 q = new LinkedList();
		 for(int i=0; i<n; i++) {
			 String tmp[] = br.readLine().split(" ");
			 for(int j=1; j<tmp.length; j++) {
				 tree[i][j-1] = tmp[j];
			 }
		 }//insert
		 
		 pre(tree,0);
		 
		 Stack s = new Stack();
		 while(!q.isEmpty()) {
			 String tmp = (String)q.poll();
			 if(!tmp.equals("-") && !tmp.equals("+") && !tmp.equals("*") && !tmp.equals("/"))s.push(tmp);
			 else {
				 int x = Integer.parseInt((String)s.pop());
				 int y = Integer.parseInt((String)s.pop());
				 
				 if(tmp.equals("-")) {
					 s.push(y-x+"");
				 }else if(tmp.equals("+")) {
					 s.push(x+y+"");
				 }else if(tmp.equals("*")) {
					 s.push(x*y+"");
				 }else if(tmp.equals("/")) {
					 s.push(y/x+"");
				 }
			 }
		 }
		 
		 int ans = Integer.parseInt((String)s.pop());
		 bw.write(String.valueOf("#"+T+" "+ans+"\n"));
		 bw.flush();
		 
	 }//test_case
	 
	}//main

	private static void pre(String[][] tree, int n) {
		// TODO Auto-generated method stub
		if(tree[n][1] == null) {
			q.offer(tree[n][0]);
			return;
		}
		pre(tree,Integer.parseInt(tree[n][1])-1);
		if(tree[n][2]!=null)pre(tree, Integer.parseInt(tree[n][2])-1);
		q.offer(tree[n][0]);
		
	}
 
	 

}//class
  