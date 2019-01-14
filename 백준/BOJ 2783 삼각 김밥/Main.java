
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		double min,x,y;
		
		x = Integer.parseInt(st.nextToken());
		y = Integer.parseInt(st.nextToken());
		
		min = x/y*1000;
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			double g = Integer.parseInt(st.nextToken());
			double p = Integer.parseInt(st.nextToken());
			if(min>=(g/p)*1000)min=g/p*1000;
			

			
		}
		
		bw.write(String.format("%.2f", min));
		bw.flush();
		
	}// main
   
 
}// class

   