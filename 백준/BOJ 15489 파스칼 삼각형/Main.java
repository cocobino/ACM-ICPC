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
    
    	int pas[][] = new int[30][];
    	for(int i=0; i<pas.length; i++) {
    		pas[i] = new int[i+1];
    	}
    	
    	for(int i=0; i<pas.length; i++) {
    		for(int j=0; j<i; j++) {
    			pas[i][j]=1;
    			if(i>1 && j>=1 && j<i-1) {
    				pas[i][j] = pas[i-1][j-1] + pas[i-1][j];
    			}
    		}
    	}//pascal
    	
    	st= new StringTokenizer(br.readLine());
    	int r = Integer.parseInt(st.nextToken()); //번째줄
    	int c = Integer.parseInt(st.nextToken())-1; //번쨰줄 번
    	int w = Integer.parseInt(st.nextToken()); //길이
    	
    	int range=1;f
    	
    	int rst= 0;
    	for(int i=r; i<r+w; i++) {
    		for(int j=c; j<c+range; j++) {
    			rst +=pas[i][j];
    		}
    		range++;
    	}
    	
    	bw.write(String.valueOf(rst));
    	bw.flush();
    	
	}// main
    
}//class

