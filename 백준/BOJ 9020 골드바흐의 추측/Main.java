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
   
   static final int size = 10001;
   
  
    public static void main(String[] args) throws IOException {
 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	boolean era[] = new boolean[size];
		
		for(int i=2; i*i<size; i++) {
			if(!era[i]) {
				for(int j=i*i; j<size; j+=i) {
					era[j]=true;
					era[1]=true;
				}
			}
		}//eratos
		
    	
    	for(int T=0; T<test_case;T++) {
    		int n = Integer.parseInt(br.readLine());
    		
    		for(int i=n/2; i>0; i--) {
    			if(!era[i] && !era[n-i]) {
    				bw.write(String.valueOf(i+" "+(n-i)));
    				bw.write("\n");
    				bw.flush();
    				break;
    			}
    		}
    		
    		
    	}//for loop
    	
    	
	}// main
 
}//class

