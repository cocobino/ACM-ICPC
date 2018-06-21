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
		public static int N, M;
		public static boolean visit[];
		public static ArrayList<Integer> arr[];
		public static int res[] = new int[10001];
		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		StringTokenizer st= new StringTokenizer(br.readLine());
		N = Integer.parseInt(st.nextToken());
		M = Integer.parseInt(st.nextToken());
		
		arr = new ArrayList[N+1];
		
		for(int i=1;i<=N; i++) {
			arr[i] = new ArrayList<Integer>();
		}
		
		for(int i=0; i<M; i++) {
			st= new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			arr[a].add(b);
		}
		// ÀÔ·ÂºÎ ------------------
		
		for(int i=1; i<=N; i ++) {
			visit = new boolean[N+1];
			dfs(i);
		}
		
		int max =0;
		for(int i=1; i<=N; i++) {
			if(max<res[i]) {
				max = res[i];
			}
		}
		for(int i=1; i<=N; i++) {
			if(res[i]==max) {
				bw.write(String.valueOf(i+" "));
				bw.flush();
			}
		}
		
	}

	public static void dfs(int curNode) {
		// TODO Auto-generated method stub
		visit[curNode]=true;
		for(int c : arr[curNode]) {
			if(visit[c] == false) {
				dfs(c);
				res[c]++;
			}
		}
	}
}