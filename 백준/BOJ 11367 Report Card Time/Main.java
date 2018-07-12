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
    		String a[] = br.readLine().split(" ");
    		
    		bw.write(String.valueOf(a[0]+" "));
    		
    		 if (Integer.parseInt(a[1]) >= 90) {
    	           bw.write(String.valueOf("A"));
    	        } else if (Integer.parseInt(a[1]) >= 80) {
    	        	bw.write(String.valueOf("B"));
    	        } else if (Integer.parseInt(a[1]) >= 70) {
    	        	bw.write(String.valueOf("C"));
    	        } else if (Integer.parseInt(a[1]) >= 60) {
    	        	bw.write(String.valueOf("D"));
    	        } else {
    	        	bw.write(String.valueOf("F"));
    	        }
    	        if (Integer.parseInt(a[1]) >= 60 && (Integer.parseInt(a[1]) % 10 >= 7 || Integer.parseInt(a[1]) == 100)) {
    	        	bw.write(String.valueOf("+"));
    	        	bw.newLine();
    	        }else bw.newLine();
    		
    		bw.flush();
    	}//for loop
	}// main
    
}//class
