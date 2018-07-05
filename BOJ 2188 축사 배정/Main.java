import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
		static int n;	
		static int m, B[];
		static int arr[][];
		static boolean visit[];
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st= new StringTokenizer(br.readLine());
		 n =Integer.parseInt(st.nextToken()); // ผา
		 m =Integer.parseInt(st.nextToken()); // รเป็
	
		arr = new int [n+1][m+1];
		visit = new boolean[n+1];
		B = new int[n+1];
		
		
		for(int i=1; i<=n; i++) {
			 Arrays.fill(arr[i], -1);
			 String str2[] = br.readLine().split(" ");
			 int lenth = Integer.parseInt(str2[0]);
			 for(int j=1; j<=lenth; j++) {
				 arr[i][j] = Integer.parseInt(str2[j]);
			 }
		}
		
		int rst = 0;
		for(int i=1; i<=n; i++) {
			Arrays.fill(visit, false);
			if(dfs(i))rst++;
		}
		bw.write(String.valueOf(rst));
		bw.flush();
		
	
		
		
	}
	private static boolean dfs(int cur) {
		// TODO Auto-generated method stub
		visit[cur] = true;
		for(int i=1; i<=m; i++) {
			if(arr[cur][i] == -1)break;
			int v = arr[cur][i];
			if(B[v] ==0 ||(!visit[B[v]] && dfs(B[v]))) {
				B[v] = cur;
				return true;
			}
		}
		return false;
	}
}