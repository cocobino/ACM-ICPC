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
	  
	 st = new StringTokenizer(br.readLine());
	 double a = Double.parseDouble(st.nextToken());
	 double b = Double.parseDouble(st.nextToken());
	 
	 double m = (b-a)/400;
//	 System.out.println(m);
	 	
	 
	 double rst = 1 / (double)(1 + (double)Math.pow(10, m));
	 
	 System.out.println(rst);
	 
	
	}//main
 
}// class
 