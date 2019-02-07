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
		int n  = Integer.parseInt(br.readLine());
		
		arr = new int[n];
		
		st =new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]  =Integer.parseInt(st.nextToken());
		}//insert
		
		int dp[] = new int[n];
		dp[0]=1;
		int max =0;
		for(int i=0; i<n; i++) {
			dp[i] = 1;
			
			for(int j=0; j<i; j++) {
				
				if(arr[j]<arr[i] && dp[j]+1 > dp[i]) {
					dp[i] = dp[j]+1;
				}
			}
			
			if(max < dp[i]) {
				max = dp[i];
			}
		}
		
		bw.write(String.valueOf(max));
		bw.flush();
		
	}//main
 
}//class
  