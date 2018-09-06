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
		
		
		int rst=0;
		int [] sum = new int[8];
		int input = Integer.parseInt(br.readLine());

		for(int i=0 ; i<7;i++) {
			sum[i]= input%2;
			input/=2;
		}
		for(int i=0;i<7; i++) {
			if(sum[i]==1)rst++;
		}
	
		System.out.println(rst);
	}

}