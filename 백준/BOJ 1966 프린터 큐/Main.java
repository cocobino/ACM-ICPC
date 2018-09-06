import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

		static Queue<Integer> important;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int T=0; T<test_case; T++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			important = new LinkedList<Integer>();
			int []sort = new int[n];
			
			st = new StringTokenizer(br.readLine());
			for(int i=0; i<n; i++) {
				int importNum = Integer.parseInt(st.nextToken());
				important.add(importNum);
				sort[i] = importNum;
				}
			Arrays.sort(sort);
			
			int order = sort.length-1;
			int cnt =0; //회전 횟수
			int cal =0; // 순서
			
			while(true) {
				int poll = important.poll();
				if(cal == m)poll +=101;
				cal++;
				
				if(sort[order]==poll-101) {
					cnt++;
					bw.write(String.valueOf(cnt)+"\n");
					bw.flush();
					break;
				}else if(sort[order] == poll) {
					cnt++;
					order --;
				}else {
					important.add(poll);
				}
				
			}
			
			
		}//test_case
		
	}
}