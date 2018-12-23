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
    	
    	while(true) {
    		String in[] = br.readLine().split(" ");
    		if(in[1].equals("0") && in[2].equals("0"))break;
    		
    		if( Integer.parseInt(in[1])>17 || Integer.parseInt(in[2])>=80) {
    			bw.write(String.valueOf(in[0] + " "+ "Senior\n"));
    		}else
    		{
    			bw.write(String.valueOf(in[0] + " "+ "Junior\n"));
    		}
    		
    		bw.flush();
    	}//loop
    	
	}// main
    
}//class
