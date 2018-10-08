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
	
	 
	
	 public static void main(String[] args) throws IOException {
		 
		 st = new StringTokenizer(br.readLine());
		 int r = Integer.parseInt(st.nextToken());
		 int b = Integer.parseInt(st.nextToken());
		 
		 int sum = r+b;
		 int x=0,y=0;
		 
		 for(int i=3; i<=sum/3; i++) {
			 if(sum % i == 0) {
				 x = sum/i;
				 y =i;
				 
				 if((x-2)*(y-2) == b ) {
					 break;
				 }
			 }
		 }
		 
		 bw.write(String.valueOf(x + " "+ y));
		 bw.flush();
	}//main

 
	
}// class
 