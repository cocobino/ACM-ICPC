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
	static char map[][];
	static boolean visit[][];
	static boolean number[][];
	
	static int dx[] = {0,0,-1,1,0};
	static int dy[] = {1,-1,0,0,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {

		for(int tc=1; tc<=10; tc++) {
			n= Integer.parseInt(br.readLine());
			
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a= Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			
			int rst = (int)Math.pow(a, b);
			
			bw.write(String.valueOf("#"+tc+" "+rst+"\n"));
			bw.flush();
			
		 }//test_case
	}//main
 
	
}

 
 