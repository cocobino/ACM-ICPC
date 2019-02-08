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
		 
		int ysum=0, ksum=0;
		
		
		for(int i=0; i<9; i++) {
			st = new StringTokenizer(br.readLine());
			ysum += Integer.parseInt(st.nextToken());
			ksum += Integer.parseInt(st.nextToken());
		}
		
		if(ysum>ksum)bw.write(String.valueOf("Yonsei"+"\n"));
		else if(ysum<ksum)bw.write(String.valueOf("Korea"+"\n"));
		else bw.write(String.valueOf("Draw\n"));
		bw.flush();

		 

		} // test_case

	}// main

}// class
