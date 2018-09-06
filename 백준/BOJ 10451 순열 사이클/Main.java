import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.StringTokenizer;


public class Main{
	
	public static boolean visit[];
	public static ArrayList<Integer>[] tree;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			
		int test_case = Integer.parseInt(br.readLine());
			
		for(int T=0; T<test_case; T++) {
			
			int N = Integer.parseInt(br.readLine());
			
			tree = new ArrayList[N+1];
			visit = new boolean[N+1];
			

			for(int i=1; i<=N; i++) {
			tree[i] = new ArrayList<Integer>(); 
			}
			
			StringTokenizer  st= new StringTokenizer(br.readLine());
			for(int i=1; i<=N; i++) {
				tree[i].add(Integer.parseInt(st.nextToken()));
			}
			
			int cnt=0;
			for(int i=1; i<=N; i++) {
				if(visit[i] ==false) {
					cnt++;
					dfs(i);
				}
				
				
			}
			bw.write(String.valueOf(cnt +"\n"));
			bw.flush();
		}
		
	}

	private static void dfs(int curNode) {
		// TODO Auto-generated method stub
		if(visit[curNode])return;
		
		visit[curNode] = true;
		
		for( int tmp : tree[curNode]) {
			if(visit[tmp] ==false)dfs(tmp);
		}
		
	}
}