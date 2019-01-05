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
    	String tmp[] = br.readLine().split(" ");
    	
    	int a = Integer.parseInt(tmp[0]);
    	int b = Integer.parseInt(tmp[2]);
    	int c = Integer.parseInt(tmp[4]);
    	
    	
    	int arst = cal(a,b,tmp[1]);
    	    arst = cal(arst,c,tmp[3]);
    	    
    	int brst = cal(b,c,tmp[3]);
    		brst = cal(a,brst,tmp[1]);
    		
    		bw.write(String.valueOf(Math.min(arst, brst)));
    		bw.newLine();
    		bw.write(String.valueOf(Math.max(arst, brst)));
    		bw.flush();
    
    	
    	
	}// main


	private static int cal(int a, int b, String p) {
		// TODO Auto-generated method stub
		switch(p) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		}
		return 0;
	}// func cal
    
}//class

