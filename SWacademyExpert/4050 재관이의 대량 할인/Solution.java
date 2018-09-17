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
	
	static int n;
	static int map[];
	static boolean visit[];


	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			n = Integer.parseInt(br.readLine());
			map = new int[n];
			int sum=0;
			StringTokenizer st = new StringTokenizer (br.readLine());
			for(int i=0; i<n; i++) {
				map[i]=Integer.parseInt(st.nextToken());
				sum += map[i];
			}
			Arrays.sort(map);
			
			int min =0;
			for(int i=n-1; i>=0 && i-2>=0; i-=3	) {
				min +=  map[i-2];
			}
			
			bw.write(String.valueOf("#"+tc+" "+(sum-min)+"\n"));
			bw.flush();
			
		}//test-case
	}//main

}//class
 
