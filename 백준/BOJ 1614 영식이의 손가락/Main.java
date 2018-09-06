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
	
	 long N = Integer.parseInt(br.readLine());
	 long cnt = Integer.parseInt(br.readLine());
	 long n = N - 1;
	 if (cnt > 0) {
		 if (N % 4 == 1) n += 8 * cnt; 
		 else n += cnt / 2 * 8 + cnt % 2 * (8 - (N - 1) * 2); 
		 }
	 bw.write(String.valueOf(n)); 
	 bw.flush();

	

	
	/* 초기 풀이
		if(i%(8*(i-1)+1)==0)arr[1]++;
		if(i%(b[point]*(i-1)+2)==0) {
			point++;
			arr[2]++;
		}
		if(i%(4*(i-1)+3)==0)arr[3]++;
		
		if(i%(b[point]*(i-1)+4)==0) {
			point--;
			arr[4]++;
		}
		if(i% 8*(i-1)+5 ==0)arr[5]++;
	*/

	}
}