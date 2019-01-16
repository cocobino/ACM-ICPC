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
		 
		 int n = Integer.parseInt(st.nextToken());// 소세지
		 int m = Integer.parseInt(st.nextToken());// 사람의 수
		 
		 
		 int rst = m-gdc(n,m);
		bw.write(String.valueOf(rst));
		bw.flush();
		
	}// main


	private static int gdc(int n, int m) {
		// TODO Auto-generated method stub
		if(m==0) {
			return n;
		}else {
			return gdc(m,n%m);
		}

	}
   
 
}// class

    fa