import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		st = new StringTokenizer(br.readLine());
		
		long x = Long.parseLong(st.nextToken());
		long y = Long.parseLong(st.nextToken());
		
		long z= (y*100)/x;
		
		if(z >=99) {
			System.out.println(-1);
		}
		
		long l=0,r= 1;
		long rst = -1;
		
		while(l <= r) {
			long mid = (l +r)/2;
			long nz = ((y+mid)*100) / (x+mid);
			
			if(nz > z) {
				r = mid -1;
			} else {
				l = mid+1;
			}
		}
		
		System.out.println(l);
	}
}