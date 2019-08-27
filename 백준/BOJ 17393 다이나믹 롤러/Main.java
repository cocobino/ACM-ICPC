import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int dp[][];
	static int dx[] = {1,0};
	static int dy[] = {0,1};
	
	static long min,max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        
        long n  = Long.parseLong(br.readLine());
        
        long a[] = new long[(int)n];
        long b[] = new long[(int)n];
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
        	a[i] = Long.parseLong(st.nextToken());
        }
        
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
        	b[i] = Long.parseLong(st.nextToken());
        }
        
        
        for(int i=0; i<n; i++) {
        	long upper = bsearch(b, a[i])-1;
        	System.out.print(upper - (i+1) >=0 ? upper - (i+1) +" " : 0 + " ");
        	
        }
        
        
    }// main
    
	private static int bsearch(long[] b, long key) {
		int mid;
		int start =0;
		int end = b.length;
		
		 while(end - start >0) {
			 mid = (start + end)/2;
			 
			 if(b[(int)mid] <= key) {
				 start = mid + 1;
			 }else {
				 end = mid;
			 }
		 }
		
		return end +1;
	}

 
   

	
 
     

}// class
  
 