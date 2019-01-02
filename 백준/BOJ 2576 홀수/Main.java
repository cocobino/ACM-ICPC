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
  
	//2576
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 LinkedList<Integer> arr = new LinkedList<>();
	 for(int i=0; i<7; i++) {
		 int n = Integer.parseInt(br.readLine());
		 if(n%2!=0)arr.add(n);
	 }
	 if(arr.size()==0)bw.write(String.valueOf("-1"));
	 else {
		 Collections.sort(arr);
		 int sum =0,min=Integer.MAX_VALUE;
		 for(int i=0; i<arr.size(); i++) {
			 sum += arr.get(i);
			 min = Math.min(arr.get(i),min);
		 }
		 
		 
		 bw.write(String.valueOf(sum));
		 bw.newLine();
		 bw.write(String.valueOf(min));
		
		 
	 }
	 bw.flush();
	 bw.close();
	 br.close();
		
	}//main
		
	 	
		
}//class   f