import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
 
	static int n,k;
	static boolean visit[];
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
	 String in[] = br.readLine().split(" ");
	 
	 boolean flag=false;
	 for(int i=0; i<in.length-1; i++) {
		 if(Integer.parseInt(in[i]) > Integer.parseInt(in[i+1]))flag=true;		 
	 }
	 if(flag)bw.write(String.valueOf("Bad"));
	 else bw.write(String.valueOf("Good"));
	 bw.flush();
	 
	 
	 
	}//main

 
 
	
}//class
 