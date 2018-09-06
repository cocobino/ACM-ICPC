import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int i=0; i<test_case; i++) {
			int rst =0;
			int s = Integer.parseInt(br.readLine()); // interval
			int n = Integer.parseInt(br.readLine()); // opt
			
			for(int j =0; j<n; j++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int q = Integer.parseInt(st.nextToken());
			int p = Integer.parseInt(st.nextToken());
			
			rst += p*q;
			}
			
			rst +=s;
			bw.write(String.valueOf(rst)+ "\n");
			bw.flush();
			
		}
	
	}
 }