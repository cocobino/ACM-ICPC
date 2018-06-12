import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.security.cert.CertPathBuilder;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.StringTokenizer;


public class Main{
		
		public static LinkedList<Integer> []tree;
		public static boolean visit[];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int N = Integer.parseInt(br.readLine()); //컴 개수
		int L = Integer.parseInt(br.readLine()); //라인개수
			
			tree = new LinkedList[N+1];
			visit = new boolean[N+1];
			
			for(int i=1; i<=N; i++) {
				tree[i] = new LinkedList<Integer>();
			}
			
			
		for(int i=0; i<L; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int prt = Integer.parseInt(st.nextToken());
			int chd = Integer.parseInt(st.nextToken());
			
			tree[prt].add(chd);
			tree[chd].add(prt);
		}
		
		dfs(1);
		int cnt=0;
		for(int i=1; i<=N;i++) {
			if(visit[i])cnt++;
		}
		bw.write(String.valueOf(cnt-1));
		bw.flush();
	}

	private static void dfs(int curNode) {
		// TODO Auto-generated method stub
		if(visit[curNode])return;
		
		visit[curNode]=true;
		
		for( int tmp : tree[curNode]) {
			if(visit[tmp] ==false)dfs(tmp);
		}
		
	}
 }