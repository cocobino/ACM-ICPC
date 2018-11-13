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
    	
    	int tmp = 2;
    	int wgt =1;
    	
    	int rst =0;
    	for(int i=0; i<n; i++) {
    		rst = (int)Math.pow(tmp+wgt, 2);
    		tmp+=wgt;
    		wgt*=2;
    		
    	}
    	
    	bw.write(String.valueOf(rst));
    	bw.flush();
    	
	}//main
}//class