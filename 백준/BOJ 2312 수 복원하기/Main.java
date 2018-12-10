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
    	 
    	for(int T=0; T<test_case;T++) {
    		int n = Integer.parseInt(br.readLine());
    		
    		for(int i=2; i<=n; i++) {
    			int cnt=0;
    			while(n%i ==0) {
    				cnt++;
    				n/=i;
    			}
    			if(cnt>0) {
    				bw.write(String.valueOf(i + " "+ cnt+"\n"));
    			}
    		}
    		
    	}//for loop
    	bw.flush();
    	
	}// main
 
}//class

