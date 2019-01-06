import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
    
  static int n;
  static int map[][];
   
    public static void main(String[] args) throws IOException {
      n = Integer.parseInt(br.readLine());
      //map = new int[n][n];
      
      long sum =0;
      int num=0;
      for(int i=0; i<n; i++) {
    	  st =new StringTokenizer(br.readLine());
    	  for(int j=0; j<n; j++) {
    		 num =Integer.parseInt(st.nextToken());
    		  sum +=num;
    		  
    	  }
      }//insert
     bw.write(String.valueOf(sum));
     bw.flush();
      
    
     
	}// main
 
}//class

