import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSpinnerUI;
 
public class Main {
	
	
	public static void main(String[] args) throws IOException { 
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int total = Integer.parseInt(st.nextToken());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int cnt=0;
		
		for(int i=0;;i++) {
			 a = a/2 + a%2;
			 b = b/2 + b%2;
			 cnt++;
			 
			 if(a==b) {break;}
		}	
		System.out.println(cnt);
		
	}

}