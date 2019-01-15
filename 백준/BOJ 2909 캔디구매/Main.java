
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
		st = new StringTokenizer(br.readLine());
		long a = Long.parseLong(st.nextToken());
		long k = Long.parseLong(st.nextToken());//액면가 0개수
		
		int t=1;
		for(int i=0; i<k; i++)t*=10;
		k=t/10;
		
		bw.write(String.valueOf(( a+ (k*5)) / (k*10) * (k*10) ));
		bw.flush();
		
		
		
	}// main
   
 
}// class

    f