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
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int cnt=0;
    	for(int i=1; i<Integer.MAX_VALUE; i++	) {
    		String tmp = Integer.toString(i);
    		
    		for(int j=0; j<tmp.length()-2; j++) {
    			if(tmp.charAt(j) =='6' &&tmp.charAt(j+1) =='6' && tmp.charAt(j+2) =='6') {
    				cnt++;
    				break;
    			}
    		}
    		
    		if(cnt==n) {
    			bw.write(String.valueOf(tmp));
    			bw.flush();
    			break;
    		}
    		
    		
    	}
    	
	}// main
    
}//class

