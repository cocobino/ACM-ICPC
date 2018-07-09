import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

		
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int test = Integer.parseInt(br.readLine());
	int cnt=test;
	int len=0;
	for(int T=0; T<test; T++) {
		String a = br.readLine();
		boolean arr[] = new boolean[26];
		
		for(int i=1; i<a.length(); i++) {
			if(a.charAt(i-1)!=a.charAt(i)) {
				if(arr[a.charAt(i)-97]==true) {
				cnt--;
				break;
				}
				arr[a.charAt(i-1)-97] =true;
			}
			
		}
		
	}
	bw.write(String.valueOf(cnt));
	bw.flush();
	}
}

