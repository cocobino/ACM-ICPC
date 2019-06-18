import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int max =0;
		int min = Integer.MAX_VALUE;
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int from =  Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			
			max = Math.max(from, max);
			min = Math.min(min, to);
			
		}
		
			if( max-min <0)System.out.println(0);
			else System.out.println(max-min);
		
		
	}//main

}//class
 