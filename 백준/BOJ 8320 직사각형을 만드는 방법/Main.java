
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int n = Integer.parseInt(br.readLine());
		
		int dp[] = new int[10003];
		
		for(int i=1; i<=n; i++) {
			int sum=0;
			for(int j=1; j*j<=i; j++) {
				if(i%j ==0)sum++;
			}
		dp[i] = dp[i-1]+sum;	
		}
		
		bw.write(String.valueOf(dp[n]));
		bw.flush();
	}// main
   
 
}// class

   