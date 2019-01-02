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
    	int n =Integer.parseInt(br.readLine());
    	
    	for(int i=1; ; i++) {
    		bw.write(String.valueOf(n*i+" "));
    		bw.flush();
    		
    		if(n*i % 10 ==0)break;
    	}
    	
	}// main

 
    
}//class

