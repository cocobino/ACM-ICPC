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
		

		int test_case = Integer.parseInt(br.readLine());
		int cup[] = {0,1,0,0};	
		for(int i=0; i<test_case; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b= Integer.parseInt(st.nextToken());
			
			int tmp=0;
			tmp = cup[b];
			cup[b] = cup[a];
			cup[a] = tmp;
			
			
			
		}
		for(int i=1; i<=cup.length; i++) {
			if(cup[i]==1) {System.out.println(i); break;}
		}
	}

}