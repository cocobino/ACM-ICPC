import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
		public static LinkedList<Integer> arr[]; //인접리스트 그래프
		public static int n, indegree[];
		public static int cost[], dp[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine()); // 건물의 종류수
		
		cost = new int[n+1];
		arr = new LinkedList[n+1];
		
		for(int i=1; i<=n; i++) {
			arr[i] = new LinkedList<Integer>();
		}
		
		for(int i=1; i<=n; i++) {
			StringTokenizer st =new StringTokenizer(br.readLine());
			cost[i] = Integer.parseInt(st.nextToken());// 걸리는시간
			
			while(st.hasMoreTokens()) {
				int vertex = Integer.parseInt(st.nextToken());
				if(vertex != -1)arr[i].add(vertex);
			}
		}
		dp = new int[n+1];
		for(int i=1; i<=n; i++) {
			topologicalSort(i);
		}
		for(int i=1; i<=n; i++) {
		bw.write(String.valueOf(dp[i]+"\n"));
		}
		bw.flush();
	}


	private static int topologicalSort(int vertex) throws IOException {
		// TODO Auto-generated method stub
		
		
		if(dp[vertex] != 0)return dp[vertex];
		
		dp[vertex] = cost[vertex];
		
		for(int b : arr[vertex]) {
			dp[vertex] = Math.max(dp[vertex], topologicalSort(b)+cost[vertex]);
		}	
			return dp[vertex];
		
		
		
	}
}