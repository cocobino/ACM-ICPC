
import java.util.*;
import java.io.*;

public class Main {


	static int dx[] = { 1, -1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };

	static int n;
	static int map[][];
	static int min;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
 
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		
		for(int i=0; i<n; i++) {
			st =new StringTokenizer(br.readLine());
			for(int j=0; j<n; j++) {
			map[i][j] = Integer.parseInt(st.nextToken());	
			}
		}//insert
		min = Integer.MAX_VALUE;
		boolean vis[] = new boolean[n];
		powerset(0,vis);
		
		System.out.println(min);
	}// main

	private static void powerset(int idx, boolean[] vis) {
		// TODO Auto-generated method stub
		if(idx==vis.length) {
			int cnt=0;
			for(int i=0; i<vis.length; i++) {
				if(vis[i])cnt++;
			}
			if(cnt==n/2) {
				int a=0,b=0;
				for(int i=0; i<vis.length; i++) {
					for(int j=0; j<vis.length; j++) {
						if(i==j)continue;
						if(vis[i] &&vis[j]) {
							a+=map[i][j];
						}
						else if(!vis[i] && !vis[j]) {
							b+=map[i][j];
						}
					}
				}
				min = Math.min(min, Math.abs(a-b));
			}
			
			return;
		}
		
		vis[idx]=true;
		powerset(idx+1,vis);
		vis[idx]=false;
		powerset(idx+1,vis);
		
	}
 
 
}// class
