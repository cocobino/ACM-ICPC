import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {

	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
	static int n;
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	
	static String a,b;
	static char tmp;
 	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	
	 a = br.readLine();
	 tmp=br.readLine().charAt(0);
	 b = br.readLine();
	
	 if(b.length() > a.length()) {
		 String tmp;
		 tmp = a;
		 a = b;
		 b =tmp;
	 }
	
	switch(tmp) {
	case '*':
		printa();
		break;
	case '+':
		printb();
		break;
	}
		
	}//main


	private static void printb() throws IOException {
		// TODO Auto-generated method stub
		if(a.length() != b.length()) {
		
			bw.write(String.valueOf("1"));
		for(int i=0; i<a.length()-b.length()-1; i++) {
			bw.write(String.valueOf("0"));
		}
		
		
		bw.write(String.valueOf(b));
		bw.flush();
		}
		else {
			String tmp= "";
			
			bw.write(String.valueOf("2"));
			for(int i=0; i<a.length()-1;i++)bw.write(String.valueOf("0"));
		}
		bw.flush();
	}


	private static void printa() throws IOException {
		// TODO Auto-generated method stub
		bw.write(String.valueOf("1"));
		for(int i=0; i<a.length()+b.length()-2; i++) {
			bw.write(String.valueOf("0"));
		}
		bw.flush();
	}
 

}//class   