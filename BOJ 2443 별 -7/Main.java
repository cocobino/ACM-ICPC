import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
 
 

public class Main {
	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int n = Integer.parseInt(br.readLine());
    	
    	int tmp =n;
    	
    	for(int i=n; i>0; i--) {
    		
    		for(int k=0; k<n-i; k++) {
    			bw.write(String.valueOf(" "));
    		}
    		
    		for(int j=0; j<2*i-1; j++) {
    			bw.write(String.valueOf("*"));
    		}
    		
    		
    		
    		bw.write(String.valueOf("\n"));
    	}
    	bw.flush();
    	       }

   
    }



