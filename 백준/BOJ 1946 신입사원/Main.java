import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
	int tc = Integer.parseInt(br.readLine());
	
	for(int T=0; T<tc; T++) {
		int n =  Integer.parseInt(br.readLine());
		
		Test employ1[] = new Test[n];
		 
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int test = Integer.parseInt(st.nextToken());
			int interview = Integer.parseInt(st.nextToken());
			
			employ1[i] = new Test(test, interview);
			 
		}
		
		Arrays.sort(employ1);
	 
		int cnt =1;
		int p = employ1[0].inter;
		
		 for(int i=1; i<n; i++) {
			 if(employ1[i].inter < p) {
				 p = employ1[i].inter;
				 cnt++;
			 }
		 }
	  
		 System.out.println(cnt);
		
	}
	 
	  
	  
	}// main
	 
}// class

class Test implements Comparable<Test>{
	int test,inter;

	public Test(int test, int inter) {
		super();
		this.test = test;
		this.inter = inter;
	}
	
	@Override
	public int compareTo(Test o) {
		if(this.test > o.test)return 1;
		else if(this.test < o.test)return -1;
		else return 0;
	}
			
}
 