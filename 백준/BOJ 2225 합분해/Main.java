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
	                                                                                                  
	static int dx[] = {-1,1,0,0}; //╩С, го , аб , ©Л
	static int dy[] = {0,0,-1,1};
 
	static int arr[];
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
	st = new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	int K = Integer.parseInt(st.nextToken());
	
 
	 
	long dp[][]= new long[201][201];
	
	
	for (int i = 0; i <= N; i++)
		dp[1][i] = 1;

	for (int i = 1; i <= K; i++) 
		for (int j = 0; j <= N; j++) 
			for (int k = 0; k <= j; k++) 
				dp[i][j] += dp[i - 1][j - k] % 1000000000;
	
		bw.write(String.valueOf(dp[K][N]% 1000000000));
		bw.flush();
	}//main
 
}//class
  