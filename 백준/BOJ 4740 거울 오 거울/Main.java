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
   //static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
    
  
    public static void main(String[] args) throws IOException {
    	
    	 while(true) {
    		 
    		String a = br.readLine();
    		
    		if(a.equals("***"))break;
    		
    		for(int i= a.length()-1; i>=0; i--) {
    			bw.write(String.valueOf(a.charAt(i)));
    		}
    		bw.newLine();
    		bw.flush();
    	 }//loop
    	 
	}// main

 
    
}//class

