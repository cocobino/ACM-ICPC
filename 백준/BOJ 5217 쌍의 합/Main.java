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
    		 int n = Integer.parseInt(br.readLine());
    		 String rst ="";
    		 rst +="Pairs for "+n+": ";
    		 boolean flag= false;
    		 for(int j=1; j<=n; j++) {
    			 for(int k=1; k<=n; k++) {
    				 if(j==k)continue;
    				 if((j+k)==n && j<k) {
    					 flag=true;
    					 rst+=j+" "+k;
    				 }
    			 }
    			 if(flag) {
    				 rst+=", ";
    				 flag=false;
    			 }
    		 }
    		 if(rst.length()>=15)bw.write(String.valueOf(rst.substring(0, rst.length()-2)+"\n"));
    		 else bw.write(String.valueOf(rst+"\n"));
    		 
    	 }
    	 bw.flush();
    	 
	}// main
    
}//class
