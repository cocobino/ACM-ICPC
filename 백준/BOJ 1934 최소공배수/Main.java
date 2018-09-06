import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
	
	
	public static void main(String[] args) throws IOException { 
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		
		for(int i=0; i<T; i++) {
	
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			System.out.println(a*b/gcd(a,b));
			
		}
		
		
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		
		if(b>a) return gcd(b,a);
		if (b==0) return a;
		
		return gcd(b, a%b); 
	}
}