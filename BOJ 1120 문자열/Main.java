import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String a = br.readLine();
		int div=0;
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)==' '){
				div=i;
				break;
			}
		}//
		String A = a.substring(0, div);
		String B = a.substring(div+1, a.length());
		
		int cnt=0;
		int max=0;
		int minus=0;
		if(B.length()!=A.length())minus=B.length()-A.length();
		int tmp=0;
		while(tmp != minus+1) {
		for(int i=0; i<A.length(); i++) {
		 if(A.charAt(i) == B.charAt(i+tmp))cnt++;
		}
		max =Math.max(cnt, max);
		tmp++;
		cnt=0;
		}
		
		int temp=0;tmp=0;
		while( tmp != minus+1) {
			int i;
			for(i=0 ;i<A.length(); i++) {
				if(A.charAt(i) == B.charAt(i+tmp))cnt++;
			}
			if(cnt==max) {
				temp=tmp;
			}
			tmp++;
			cnt=0;
		}
		
		
		int ans=0;
		for(int i=0; i<A.length(); i++) {
			if(A.charAt(i) != B.charAt(temp+i))ans++;
		}
		bw.write(String.valueOf(ans));
		bw.flush();
		
		
	}
}