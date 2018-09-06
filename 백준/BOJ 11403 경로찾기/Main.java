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
	
	static int N;
	static int arr[][];
	static int visit[];
	static int p[][];
	
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	 N  =Integer.parseInt(br.readLine());
	
	 arr =new int[N+1][N+1];
	 visit = new int [N+1];
	 p = new int[N+1][N+1];
	 
	for(int i=1; i<=N; i++) {
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int j=1; j<=N; j++) {
			arr[i][j] = Integer.parseInt(st.nextToken());
		}
	}
	
	for(int i=1; i<=N; i++) {
		dfs(i);
		for(int j=1; j<=N; j++) {
			p[i][j] = visit[j]; 
		}
		Arrays.fill(visit, 0);
	}
	
	for(int i=1; i<=N; i++) {
		for(int j=1; j<=N; j++) {
		bw.write(String.valueOf(p[i][j]+" "));
		}
		bw.write(String.valueOf("\n"));
	}
	
	bw.flush();
	}

	private static void dfs(int curNode) {
		// TODO Auto-generated method stub
		int n = visit.length-1;
		
		for(int i=1; i<=n; i++) {
			if(arr[curNode][i]==1 &&visit[i]==0) {
				visit[i]=1;
				dfs(i);
			}
		}
	}

			
		

}