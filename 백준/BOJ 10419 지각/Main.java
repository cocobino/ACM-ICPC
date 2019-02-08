import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int arr[];
	static int n, s;

	public static void main(String[] args) throws Exception {

		int test_case = Integer.parseInt(br.readLine());

		for (int T = 1; T <= test_case; T++) {
		n = Integer.parseInt(br.readLine());
		
		int rst=0;
		 
		for(int i=1; i<=n; i++) {
			if(i+Math.pow(i, 2)<=n) {
				rst=i;
			}else break;
		}
		
		bw.write(String.valueOf(rst+"\n"));
		bw.flush();
		} // test_case

	}// main

}// class
