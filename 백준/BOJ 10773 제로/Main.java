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
   
   static int n;

   
   
    public static void main(String[] args) throws IOException {
    	 
    	n  = Integer.parseInt(br.readLine());
    	
    	Stack<Integer> arr = new Stack<>();
    	
    	for(int i=0; i<n; i++) {
    		int a = Integer.parseInt(br.readLine());
    		
    		if(a==0 && !arr.isEmpty()) {
    			arr.pop();
    		}
    		else if(a!=0)arr.push(a);
    	}
    	
    	int rst=0;
    	int size = arr.size();
    	for(int i=0; i<size; i++) {
    		rst+=arr.pop();
    	}
    	
    	bw.write(String.valueOf(rst));
    	bw.flush();
    		
	}//main
}//class