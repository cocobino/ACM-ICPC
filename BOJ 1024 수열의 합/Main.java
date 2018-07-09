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
	
		
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	StringTokenizer st =new StringTokenizer(br.readLine());
	int N = Integer.parseInt(st.nextToken());
	int L = Integer.parseInt(st.nextToken());
	
	
	for(int i=L; i<=100; i++) {
			
		if(solve(i, N)) {
			print(i,N);
			break;
		}
		
		if(i==100) {
			bw.write(String.valueOf(-1));
		}
	}
	bw.flush();
	
	}


	private static void print(int n, int result) throws IOException { // n은 L의 길이 , result = 합
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int f = (result - n*(n-1)/2) /n;
		
		for(int i=0; i<n; i++) {
			bw.write(String.valueOf(f+i+" "));
		}
		bw.flush();
	}


	private static boolean solve(int n, int result) {
		// TODO Auto-generated method stub
		int x = result - n*(n-1)/2;
		if(x<0) {
			return false;
		}
		boolean sol = (x%n ==0);
		return sol;
	}


	
}