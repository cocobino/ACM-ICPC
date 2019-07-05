import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static final long div = 1000000007;
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		long n = Long.parseLong(br.readLine());
		long x = Long.parseLong(br.readLine());
		
		long answer = 1;
		while (x > 0) {
			if ((x & 1) == 1)
				answer = ((answer % div) * (n % div)) % div;
			n = ((n % div) * (n % div)) % div;
			x /= 2;
		}

		System.out.print(answer);
	}// main
	 
}// class
   