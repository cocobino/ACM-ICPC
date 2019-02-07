import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	public static void main(String[] args) throws Exception {
	
		st =new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
		
		
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<5; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			
			bw.write(String.valueOf( tmp-n*k+" "));
			bw.flush();
		}
	}
}
