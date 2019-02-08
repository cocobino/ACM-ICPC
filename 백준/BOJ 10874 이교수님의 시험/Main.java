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
		
		for(int T=0; T<test_case; T++) {
		st = new StringTokenizer(br.readLine());
		int cnt=0,rst=0;
		for(int i=0; i<10; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			if((i % 5)+1 ==tmp)cnt++;
		}
	
		if(cnt==10)bw.write(String.valueOf((T+1)+"\n"));
		bw.flush();
			
		} // test_case

	}// main

}// class
 