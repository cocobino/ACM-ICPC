import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;





public class Main{
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int R = Integer.parseInt(br.readLine()); // 세로줄
		int C = Integer.parseInt(br.readLine()); // 가로줄
		
		for(int i=0; i<R; i++) {
			for(int j=0; j<C; j++) {
			System.out.print("*");
			}
			System.out.println("");
			
		}
		
		
		
	
	}
	
}