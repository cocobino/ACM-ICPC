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
    	
    	while(true) {
    		String in = br.readLine();
    		if ( in.equals(".")) {
    			break;
    		}//end option
    		Stack<Character> arrow = new Stack<>();
    		boolean flag=false;
    		//sol
    		for(int i=0; i<in.length(); i++) {
    			//case 1
    			if(in.charAt(i)=='(' || in.charAt(i) == '['	) {
    				arrow.add(in.charAt(i));
    			}
    			//case 2
    			else if(in.charAt(i) == ']' && arrow.size() !=0) {
    				if(arrow.peek() == '[') {
    					arrow.pop();
    				}else {
    					flag=true;
    				}
    			}
    			//case 3
    			else if(in.charAt(i) == ')' && arrow.size() !=0) {
    					if(arrow.peek() == '(') {
    						arrow.pop();
    						}
    					else {
    						flag=true;
    					}
    				}
    			//case 4
    			else if(in.charAt(i)==')' || in.charAt(i)==']'){
    				if(arrow.isEmpty()) {
    					flag = true;
    				}
    				
    			}
    				
    			
    		}
    		if(flag || !arrow.isEmpty())bw.write(String.valueOf("no"+"\n"));
    		else if(arrow.isEmpty())bw.write(String.valueOf("yes"+"\n"));
    		
    		bw.flush();
    		
    		
    	}//while loop
    	
    	
	}// main
    
}//class

