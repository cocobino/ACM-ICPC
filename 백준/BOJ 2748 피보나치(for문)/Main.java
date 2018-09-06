import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader; 
import java.util.LinkedList;
import java.util.StringTokenizer;
	
	public class Main { 
		
		public static void main(String[] args) throws IOException { 
			
			BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); 
			//StringBuilder sb = new StringBuilder();
			//StringTokenizer st = new StringTokenizer(bf.readLine());
			
			int T = Integer.parseInt(bf.readLine());
			int sum =0;
			
			
			sum = fibonacci(T);
			
			System.out.println(sum);
			}

		public static int fibonacci(int n) {
			
			if(n <=1)
			return n;
			
			else return fibonacci(n-2)+fibonacci(n-1);
			
			
		} 
		} 

