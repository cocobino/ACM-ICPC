import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	
	static int N,M;
	static ArrayList<Integer> arr[];
	static boolean visit[];
	static int p[][];
	static int cnt;
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	StringTokenizer st =new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken()); // 정점의 개수 
	int M = Integer.parseInt(st.nextToken()); // 간선의 개수
	arr = new ArrayList[N+1];
	for(int i=0; i<=N; i++)arr[i]=new ArrayList<Integer>();
	visit = new boolean[N+1];
	
	for(int e=0; e<M; e++) {
		st =new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		arr[a].add(b);
		arr[b].add(a);
	}
	int cnt =0;
	for(int i=1; i<=N; i++) {
		if(!visit[i]) {
			dfs(i);
			cnt++;
		}
	}
	bw.write(String.valueOf(cnt));
	bw.flush();
	
	}
	private static void dfs(int curNode) {
		// TODO Auto-generated method stub
		if(visit[curNode])return;
		
		visit[curNode]=true;
		
		for(int go : arr[curNode]) {
			if(!visit[go])dfs(go);
		}
	}

			
		

}
