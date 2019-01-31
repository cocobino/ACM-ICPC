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
		int test =  Integer.parseInt(br.readLine());
		
		for(int i=0; i<test; i++) {
			int n = Integer.parseInt(br.readLine());
			st =new StringTokenizer(br.readLine());
			int coin[] = new int[n+1];
			for(int j=1; j<=n; j++) {
				coin[j] = Integer.parseInt(st.nextToken());
			}
			
			int money = Integer.parseInt(br.readLine());
			int dp[] = new int[money+1];
			
			dp[0] =1;
			
			for(int j=1; j<=n; j++) {
				for(int k=coin[j]; k<=money; k++) {
					dp[k] += dp[k - coin[j]];
				}
			}
			bw.write(String.valueOf(dp[money]+"\n"));
			bw.flush();
			
		}
	}//main
 
}//class
 