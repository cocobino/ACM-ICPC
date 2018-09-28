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
	
	static int a,b;
	
	 public static void main(String[] args) throws IOException {
		 st = new StringTokenizer(br.readLine());
		 a = Integer.parseInt(st.nextToken());
		 b = Integer.parseInt(st.nextToken());
		 
		 ArrayList<Integer> arr = new ArrayList<>(); 
		 
		 for(int i=1; i<=b; i++) {
			 for(int j=0; j<i; j++) {
				 arr.add(i);
			 }
		 }
		 int sum =0;
		 for(int i=a-1; i<=b-1; i++) {
			 sum +=arr.get(i);
		 }
		 bw.write(String.valueOf(sum));
		 bw.flush();
	 }//main
 
}// class
 