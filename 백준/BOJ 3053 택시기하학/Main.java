import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.text.DecimalFormat;
import java.util.StringTokenizer;
 
public class Main {
	
	
	public static void main(String[] args) throws IOException { 
				
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		DecimalFormat  df = new DecimalFormat("0.000000");
		
		int r = Integer.parseInt(br.readLine());
		double pi = Math.PI;
		
		System.out.println(df.format(r*r*pi));
		
		System.out.print(df.format(2*r*r));
		
		br.close();
		bw.close();
		
		
	}
}