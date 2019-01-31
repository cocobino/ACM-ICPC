import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	                                                                                                  
	static int dx[] = {-1,1,0,0}; //상, 하 , 좌 , 우
	static int dy[] = {0,0,-1,1};
	 						  //오른위(4), 오른아래(5), 왼위(6), 왼아래(7)
	static int map[][],rst[][];
	static boolean visit[][];
	
	static int n;
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		int test = Integer.parseInt(br.readLine());
		
		for(int T=0; T<test; T++) {
			
			st = new StringTokenizer(br.readLine());
			
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());
			
			int dp[][] = new int[n+1][m+1];
			
			for(int i=1; i<=m; i++)dp[1][i]=i;
			
		for(int i=2; i<=n; i++) {
			for(int j=i; j<=m; j++	) {
				for(int k=j; k>=i; k--	) {
					dp[i][j] += dp[i-1][k-1];
				}
			}
		}
			
		bw.write(String.valueOf(dp[n][m]));
		bw.newLine();
		bw.flush();
		
	 
		
		} // test_case
		
		
	}//main
 
}//class
 