import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		 int tc = Integer.parseInt(br.readLine());
		 
		 for(int T=1; T<=tc; T++) {
			 st = new StringTokenizer(br.readLine());
			 int l = Integer.parseInt(st.nextToken());
			 int n = Integer.parseInt(st.nextToken());
			 
			 int max =0;
			 int leftmin = 0;
			 int min=0;
			 int rightmin = 0;
			 
			 boolean flag=false;
			 int mid = l/2;
			 
			 for(int i=0; i<n; i++) {
				 int ant = Integer.parseInt(br.readLine());
				 
				 max = Math.max(max, Math.max(l-ant, ant));
				 
				 if(mid == ant) {
					 flag=true;
					 min = mid;
				 }
				 else if(!flag && ant<mid){
					 leftmin = Math.max(ant, leftmin);
				 }
				 else if(!flag && ant>mid) {
					 rightmin = Math.max(rightmin, l-ant);
				 }
			 }
			 if(flag)min = mid;
			 else min = Math.max(leftmin, rightmin);
			 
			 System.out.println(min + " "+ max);
			 
		 }
		 
		
	}// main
	 
}// class
   