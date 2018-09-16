import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static char map[];
 
	static Stack<Character> one;
	static Stack<Character> two;
	static Stack<Character> three;
	static Stack<Character> four;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		 
		 for(int tc=1; tc<=10; tc++) {
			 one = new Stack<>();
			 two = new Stack<>();
			 three = new Stack<>();
			 four = new Stack<>();
			 
			 n = Integer.parseInt(br.readLine());
			 
			 String in = br.readLine();
			 boolean flag = true;
			 for(int i=0; i<n && flag; i++) {
				 switch(in.charAt(i)) {
				 case '(':
					 one.add(in.charAt(i));
					 break;
				 case '[':
					 two.add(in.charAt(i));
					 break;
				 case '{':
					 three.add(in.charAt(i));
					 break;
				 case '<':
					 four.add(in.charAt(i));
					 break;
				 case ')':
					 if(one.isEmpty()) {
						 flag=false;
						 continue;
					 }
					 one.pop();
					 break;
				 case ']':
					 if(two.isEmpty()) {
						 flag=false;
						 continue;
					 }
					 two.pop();
					 break;
				 case '}':
					 if(three.isEmpty()) {
						 flag=false;
						 continue;
					 }
					 three.pop();
					 break;
				 case '>':
					 if(four.isEmpty()) {
						 flag=false;
						 continue;
					 }
					 four.pop();
					 break;
				 }
			 }
			 if(flag &&one.size()==0 &&two.size()==0 &&three.size()==0 &&four.size()==0)bw.write(String.valueOf("#"+tc+" "+"1"+"\n"));
			 else bw.write(String.valueOf("#"+tc+" "+"0"+"\n"));
			 bw.flush();
			 
		 }//test_case
	}//main
	
}

 
 