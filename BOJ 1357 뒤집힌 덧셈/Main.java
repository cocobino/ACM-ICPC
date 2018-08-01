import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer (br.readLine());
		int a =Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(reverse(reverse(a)+reverse(b))));
		bw.flush();
		
	}

	private static int reverse(int a) {
		// TODO Auto-generated method stub
		int ans=0;
		while(a>0) {
		 ans *=10;
		 ans += a%10;
		 a/=10;
		}
		return ans;
	}
}