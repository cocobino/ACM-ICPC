import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int[] s = new int[n];
		
		for(int i=0; i<n; i++) {
			s[i] = Integer.parseInt(st.nextToken());
		}
		int cur = Integer.parseInt(br.readLine());
		
//		solved
		Arrays.sort(s);
		int prev =0, nxt =Integer.MAX_VALUE;
		boolean flag= false;
		for(int i=0; i<s.length; i++) {
			if(s[i] < cur) {
				prev = Math.max(prev, s[i]);
			}
			if(s[i] >cur) {
				nxt = Math.min(nxt, s[i]);
			}
			if(s[i] == cur)flag=true;
		}
		
		if(flag) {
			System.out.println(0);
			return;
		}
		
		prev+=1;
		
		int rst=0;
		for(int A=prev; A<nxt; A++) {
			for(int B=A+1; B<nxt; B++) {
				if(A<=cur && (cur<=B && A<B)) {
					rst++;
				}
			}
		}
		System.out.println(rst);
		
		
	}
}