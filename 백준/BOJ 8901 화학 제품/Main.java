import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Scanner sc = new Scanner(System.in);
	static StringTokenizer st;
	
	static int a,b,c,ab,bc,ca;
	
	 public static void main(String[] args) throws IOException {
		 int T = Integer.parseInt(br.readLine());
		 
		 for(int test=0; test<T; test++) {
			 
			 st =new StringTokenizer(br.readLine());
			  a = Integer.parseInt(st.nextToken());
			  b = Integer.parseInt(st.nextToken());
			  c = Integer.parseInt(st.nextToken());
			 
			 st =new StringTokenizer(br.readLine());
			 ab = Integer.parseInt(st.nextToken());
			 bc = Integer.parseInt(st.nextToken());
			 ca = Integer.parseInt(st.nextToken());
			 
			 
			 
			 
		bw.write(String.valueOf(sol(a,b,c)+"\n"));
		bw.flush();
			 
		 }//test
		 
		
			 
	 }//main



	private static int sol(int a, int b, int c) {
		// TODO Auto-generated method stub
		int rst=0, cnt=0;
		while(a>=0 && b>=0){
			rst = Math.max(rst, cnt + set_bc(a,b,c));
			a--; b--; cnt+=ab;
		}
	 return rst;
	}



	private static int set_bc(int a, int b, int c) {
		// TODO Auto-generated method stub
		int ret = 0, cnt = 0;
		while(b>=0 && c>=0){
			ret = Math.max(ret, cnt + set_ca(a, b, c));
			b--; c--; cnt+=bc;
		}
		return ret;
	}



	private static int set_ca(int a, int b, int c) {
		// TODO Auto-generated method stub
		return Math.min(a, c)*ca;
	}

		 
	
	
}// class
 