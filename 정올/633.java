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
    	
    	boolean flag=false;
    	for(;!flag;) {
    		bw.write(String.valueOf("1. Korea\n2. USA\n3. Japan\n4.China\n"));
        	bw.write(String.valueOf("number? "));
        	bw.flush();
        	
    	int n =Integer.parseInt(br.readLine());
    	bw.newLine();
    	
    	switch(n) {
    	case 1:
    		bw.write(String.valueOf("Seoul\n"));
    		
    		break;
    	case 2:
    		bw.write(String.valueOf("Washington\n"));
    		
    		break;
    	case 3:
    		bw.write(String.valueOf("Tokyo\n"));
    		
    		break;
    	case 4:
    		bw.write(String.valueOf("Beijing\n"));
    		
    		break;
    		default:
    			bw.write(String.valueOf("none\n"));
    			flag=true;
    	}
    	bw.newLine();
    	bw.flush();
    	}//loop
    	
	}// main

 
    
}//class

