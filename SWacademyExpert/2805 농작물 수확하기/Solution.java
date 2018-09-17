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
	static int map[][];
	static boolean visit[][];


	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=T; tc++) {
			n = Integer.parseInt(br.readLine());
			
			map = new int[n][n];
			
			for(int i=0; i<n; i++) {
				String in = br.readLine();
				for(int j=0; j<n; j++) {
					map[i][j] = in.charAt(j)-'0';
				}
			}//insert
			 int sum = 0;
		        int cnt = 1;
		        int i,k,j,l;
		        j = n / 2;

		        for (i = 0; i <= n/2; i++,j--) {//À§ÂÊ »ï°¢Çü
		            for ( k = 1,l=j; k <= cnt; l++, k++) {
		                sum += map[i][l];
		            }
		            cnt += 2;
		        }
		        cnt -= 4;
		        j+=2;
		        for (; i < n; i++,j++) {
		            for (k = 1,l=j; k <= cnt; l++, k++) {
		                sum += map[i][l];
		            }
		            cnt -= 2;
		        }


		
			bw.write(String.valueOf("#"+tc+" "+sum+"\n"));
			bw.flush();
			
 		 }//test_case
	}//main


  


}
 
