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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//Scanner sc = new Scanner(System.in);
	
		StringTokenizer st= new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
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
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		//Scanner sc = new Scanner(System.in);
	
		StringTokenizer st= new StringTokenizer(br.readLine());
			long a = Long.parseLong(st.nextToken());
			long b = Long.parseLong(st.nextToken());
			
		System.out.println(gcd(a,b));
		System.out.println(a*b/gcd(a,b));
		}
		
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
		//Scanner sc = new Scanner(System.in);
		
		
		StringTokenizer st= new StringTokenizer(br.readLine());
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int result = gcd(a,b);
		for(int i=0; i<result; i++) {
			System.out.print("1");
		}
	}

	private static int gcd(int a, int b) {
		// TODO Auto-generated method stub
		if(b>a)return gcd(b,a);
		if(b==0) return a;
		return gcd(b, a%b);
	}
}