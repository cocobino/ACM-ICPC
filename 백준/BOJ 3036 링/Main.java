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
		
		int T = Integer.parseInt(br.readLine());
		int[] input = new int[T+1];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0; i<T; i++) {
		input[i] = Integer.parseInt(st.nextToken());	
			
		}
		for(int i=1; i<T; i++) {
			int result =gcd(input[0],input[i]);
			System.out.println(input[0]/result+"/"+input[i]/result);
		}
		
	}

	private static int gcd(int i, int j) {
		
		if(j>i) return gcd(j,i);
		if(j==0)return i;
		return gcd(j,i%j);
		// TODO Auto-generated method stub
		
	}


}		