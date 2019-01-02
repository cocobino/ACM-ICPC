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
   //static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
    
  
    public static void main(String[] args) throws IOException {
    	bw.write(String.valueOf("Number? "));
    	int n = Integer.parseInt(br.readLine());
    	
    	if(n==1)bw.write(String.valueOf("dog"));
    	else if(n==2)bw.write(String.valueOf("cat"));
    	else if(n==3)bw.write(String.valueOf("chick"));
    	else bw.write(String.valueOf("I don't know."));
    	
    	bw.flush();
	}// main

 
    
}//class

