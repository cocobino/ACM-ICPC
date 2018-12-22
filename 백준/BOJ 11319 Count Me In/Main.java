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
  
   
   
    public static void main(String[] args) throws IOException {
    	 int test = Integer.parseInt(br.readLine());
    	 
    	 for(int i=0; i<test; i++) {
    	 String a = br.readLine();
    	 
    	 int big =0;
    	 int small =0;
    	 
    	 for(int j=0; j<a.length(); j++) {
    		 if(a.charAt(j)==' ')continue;
    		 if(a.charAt(j)=='a' || a.charAt(j)=='e'||a.charAt(j)=='i'||a.charAt(j)=='o'||a.charAt(j)=='u'||
    				 a.charAt(j)=='A'||a.charAt(j)=='E'||a.charAt(j)=='I'||a.charAt(j)=='O'||a.charAt(j)=='U')small++;
    		 else big++;
    			 
    	 }
    	 bw.write(String.valueOf(big +" "+ small+"\n"));
    	 
    	 bw.flush();
    	 
    	 }

    	 
	}// main
    
}//class
