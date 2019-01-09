import java.awt.List;
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
			int n = Integer.parseInt(br.readLine());
			
			 int sum=0;
		        for(int i=0; i<=n;i++){
		            for(int j=n;j>=i;j--){
		                sum+=(i+j);
		            }
		        }
			bw.write(String.valueOf(sum));
			bw.flush();
	}// main
	
 
 

}// class
  