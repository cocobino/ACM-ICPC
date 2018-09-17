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
	
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		//int T = Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=10; tc++) {
			int n = Integer.parseInt(br.readLine());
			StringTokenizer st = new StringTokenizer(br.readLine());
			LinkedList<Integer> dq = new LinkedList<>();
			for(int i=0; i<8; i++)dq.add(Integer.parseInt(st.nextToken()));
			
			
			while(!dq.contains(0)) {
				for(int i=1; i<=5; i++) {
					int tmp = dq.get(0)-i;
					dq.remove(0);
					
					if(tmp<=0) {
						dq.addLast(0);
						break;
					}
					dq.addLast(tmp);
				}
				
			}//while
			

				bw.write(String.valueOf("#"+tc));
				for(int i=0; i<8; i++)bw.write(String.valueOf(" "+dq.get(i)));
				bw.write(String.valueOf("\n"));
				bw.flush();
						
			
			
		 }//test_case
	}//main
 
	
}
 
