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
	
	static int n;
	
	 public static void main(String[] args) throws IOException {
		 
		 n = Integer.parseInt(br.readLine());
		 
		 
		 st = new StringTokenizer(br.readLine());
		 HashSet<Integer> arr = new HashSet<>();
		 for(int i=0; i<n; i++	) {
			 arr.add(Integer.parseInt(st.nextToken()));
		 }//insert
		 
		 ArrayList<Integer> sort = new ArrayList<>(arr); 
		 Collections.sort(sort);
		 for(int go : sort) {
			 bw.write(String.valueOf(go +" "));
		 }
		 bw.flush();
	
	 }//main
}// class
 