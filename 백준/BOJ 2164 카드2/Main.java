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
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	Queue<Integer> arr = new LinkedList<>();

    	
    	
    	for(int i=1; i<=n; i++) {
    		arr.add(i);
    	}//insert
    	
    	for(;;) {
    		if(arr.size() == 1) {
    			break;
    		}
    		
    		arr.remove();
    		
    		if(arr.size() == 1) {
    			break;
    		}
    		
    		arr.add(arr.remove());
    	}//loop
    	
    	bw.write(String.valueOf(arr.poll()));
    	bw.flush();
    	
	}// main
    
}//class

