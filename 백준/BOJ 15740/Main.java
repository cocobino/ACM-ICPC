import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
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
    	st = new StringTokenizer(br.readLine());
    	String aa = st.nextToken();
    	String bb = st.nextToken();
     BigInteger	 a = new BigInteger(aa);
     BigInteger	 b = new BigInteger(bb);
     
     bw.write(String.valueOf(a.add(b)));
     bw.flush();


    	
		}//main 
 
 
     
}// class

 