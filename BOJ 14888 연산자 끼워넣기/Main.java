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
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		 
	 
	static int n;
	static int arr[] = new int[12], cal[] = new int[4];
	static boolean visit[] = new boolean[12];
	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;
	static ArrayList<Integer> list = new ArrayList<Integer>();
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
 		n = Integer.parseInt(br.readLine());
	
 		StringTokenizer st = new StringTokenizer(br.readLine());
 		for(int i=0; i<n; i++)arr[i] = Integer.parseInt(st.nextToken());
  
 		st = new StringTokenizer(br.readLine());
 		for(int i=0; i<4; i++)cal[i] = Integer.parseInt(st.nextToken());
 	 
 		
 		dfs(1,arr[0]);
 		 
 		bw.write(String.valueOf(max+"\n"));
 		bw.write(String.valueOf(min));
 		bw.flush();
	}

	private static void dfs(int x, int sum) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++) {
			if(cal[i] !=0) {
				cal[i]--;
				switch(i) {
				case 0:
					dfs(x+1,sum+arr[x]);
					break;
				case 1:
					dfs(x+1,sum-arr[x]);
					break;
				case 2:
					dfs(x+1,sum*arr[x]);
					break;
				case 3:
					dfs(x+1,sum/arr[x]);
					break;
				}
				cal[i]++;
			}
		}

			if(x==n) {
				if(max<sum)max=sum;
				if(min>sum)min=sum;
			}
		
		
	}
 
}
 
