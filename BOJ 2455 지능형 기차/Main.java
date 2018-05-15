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
				
		//BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		//BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		
	
	
		int add =0, max=0;
		
		int[][] train = new int[4][2];

		for(int i=0; i<4; i++) {
			for(int j=0; j<2; j++) {
//				StringTokenizer st= new StringTokenizer(br.readLine());
				train[i][j] = sc.nextInt();
				
			}
			
		}
		for(int i=0;i<4;i++) {
			add += train[i][1]-train[i][0];
			if(max<add)max=add;
		}
		System.out.println(max);
		
		
	}

}