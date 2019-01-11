
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
		int e = Integer.parseInt(st.nextToken());//가지고 있는 빈경
		int f = Integer.parseInt(st.nextToken());// 그날 발견 빈병
		int c = Integer.parseInt(st.nextToken());// 새병바꾸는데 필요한 빈병
		
		e+=f;
		int rst =0;
		
		int loop =0;
		while(loop !=2000) {
			if(e>=c) {
				e-=c;
				rst++;
				e++;
			}
			loop++;
		}
		
		
		
		bw.write(String.valueOf(rst));
		bw.flush();
	}// main
 
	

 
 
}// class

   