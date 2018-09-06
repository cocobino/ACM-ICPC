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
		
		int a = 300;
		int b = 60;
		int c = 10;
		
		int a_1=0,b_1=0,c_1=0;
		
		int T = Integer.parseInt(br.readLine());
		
		int tmp = T;
		if(tmp>=300) {
			a_1=tmp/300;
			tmp %=300;
		}
		if(300>tmp && tmp>=60) {
			b_1 = tmp/60;
			tmp %=60;
		}
		if(60>tmp && tmp >=10) {
			c_1 = tmp/10;
			tmp %=10;
		}
		if( tmp !=0)bw.write(String.valueOf(-1));
		else bw.write(String.valueOf(a_1+" "+b_1+" "+c_1));
		bw.flush();
	}
 }
 }