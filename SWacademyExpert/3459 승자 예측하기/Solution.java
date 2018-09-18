import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	 static long n;
	 static int map[][];
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
		   n = Long.parseLong(br.readLine());
		   
		   boolean turn =true;
		   
		   long start =1;
		   
		   while(n>0) {
			   n-=start;
			   if(turn) {
				   start*=4;
			   }
			   turn = !turn;
		   }
		   if(turn)bw.write(String.valueOf("#"+tc+" "+"Alice"+"\n"));
		   else bw.write(String.valueOf("#"+tc+" "+"Bob"+"\n"));
			
		  bw.flush();
		  
		}//test-case
	}//main

 
}//class
 
