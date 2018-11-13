import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
      
   
    public static void main(String[] args) throws IOException {
    	
    	String in = br.readLine();
    	String tmpa="",tmpb="";
    	int a=0,b=0;
    	for(int i=0; i<in.length(); i++) {
    		if(in.charAt(i)== ':') {
    			for(int j=0; j<i; j++) {
    				tmpa +=in.charAt(j);
    			}
    			for(int k=i+1; k<in.length(); k++) {
    				tmpb +=in.charAt(k);
    			}
    			break;
    		}
    	}//insert
    	 a = Integer.parseInt(tmpa);
    	 b = Integer.parseInt(tmpb);
    	 
    	int min = Math.min(a, b);
    	
    	for(;;) {
    		
    		if(a % min ==0 && b % min ==0) {
    			a/=min;
    			b/=min;
    		}
    		else {
    			min--;
    		}
    		
    		if(min==1) {
    			bw.write(String.valueOf(a + ":"+ b));
    			break;
    		}
    	}
    	
    	bw.flush();
    	
    	
    	
    	
  
	}//main
}//class