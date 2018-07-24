import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;

 

public class Main {
		
	 //static ArrayList<Integer> arr[];
	  static int N, M, S, E;

	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 	  StringBuilder sb = new StringBuilder();
    	 int test = Integer.parseInt(br.readLine());
    	 for(int T=0; T<test; T++) {
    	 StringTokenizer st =new StringTokenizer(br.readLine());
    	 	N = Integer.parseInt(st.nextToken());
    	    M = Integer.parseInt(st.nextToken());
    		
    		while(M-->0) {
    			br.readLine();
    		}
    		
    		sb.append(N-1).append("\n");
    		
    	    
    	    
    	 }//test_case loop
    	    bw.write(String.valueOf(sb));
    	    bw.flush();
      }

    }



