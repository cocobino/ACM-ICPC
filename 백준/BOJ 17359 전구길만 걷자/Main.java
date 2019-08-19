import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

	static int min = Integer.MAX_VALUE;
	static int cnt= 0;
	public static void main(String[] args) throws IOException {
	 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st;
	  
	int n =Integer.parseInt(br.readLine());
	
	String in[] = new String[n];
	
	
	
	for(int i=0 ; i<n; i++) {
		in[i] = br.readLine();
		for(int j=0; j<in[i].length()-1; j++) {
			if(in[i].charAt(j)=='0' && in[i].charAt(j+1)=='1')cnt++;
			if(in[i].charAt(j)=='1' && in[i].charAt(j+1)=='0')cnt++;
		}
//		System.out.println("cnt"+ cnt);
	}//insert
	
	
	
	perm(in,0, n);
	
	System.out.println(min);
	
	}//main

	private static void perm(String[] in, int idx, int n) {
		if(idx == n) {
			int count =0;
			for(int i=0; i<n-1; i++) {
//				System.out.println(in[i].charAt(in[i].length()-1) +" : "+ in[i+1].charAt(0));
				if(in[i].charAt(in[i].length()-1) != in[i+1].charAt(0)) {
					count++;
				}
			}
			
			min = Math.min(min, cnt+count);
			
			return; 
		}
		
		  
		for(int i=idx; i<n; i++) {
			swap(in, idx, i);
			perm(in,idx+1,n);
			swap(in,idx,i);
		}
		 
	}//func : perm


	private static void swap(String[] in, int idx, int i) {
		String tmp = in[idx];
		in[idx]= in[i];
		in[i] = tmp;
	}
 

}// class
 