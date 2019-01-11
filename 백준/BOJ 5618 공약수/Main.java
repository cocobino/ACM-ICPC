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
   static StringTokenizer st;
     
   public static void main(String[] args) throws IOException {
	 
	  int n = Integer.parseInt(br.readLine());
	  long min = Long.MAX_VALUE;
	  LinkedList<Long> arr = new LinkedList<>();
	  
	  
	  st = new StringTokenizer(br.readLine());
	  for(int i=0; i<n; i++) {
		 arr.add(Long.parseLong(st.nextToken()));
		  min = Math.min(min, arr.get(i));
	  }//insert
	   
	  for(long i=1; i<=min; i++) {
		  int cnt=0;
		  for(int j=0; j<arr.size(); j++) {
			  if(arr.get(j)%i==0)cnt++;
		  }
		  if(cnt==arr.size())bw.write(String.valueOf(i+"\n"));
		
	  }
	  bw.flush();
	  
   }// main

 

}//class  