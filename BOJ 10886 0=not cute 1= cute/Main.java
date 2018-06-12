import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;


public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		int a=0, b=0;
		
		for(int i=0; i<test_case; i++) {
			int input= Integer.parseInt(br.readLine());
			if(input == 1)a++;
			else b++;
		}
		if(a>b)bw.write(String.valueOf("Junhee is cute!"));
		else if(a<b)bw.write(String.valueOf("Junhee is not cute!"));
		bw.flush();
	}
 }