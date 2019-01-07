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
   
   static int r,c;
   
   public static void main(String[] args) throws IOException {
	 st =new StringTokenizer(br.readLine());
	 r = Integer.parseInt(st.nextToken());
	 c = Integer.parseInt(st.nextToken());
	 
	 int map[][] = new int[r][c];
	 for(int i=0; i<r; i++) {
		 st = new StringTokenizer(br.readLine());
		 for(int j=0; j<c; j++) {
			map[i][j] = Integer.parseInt(st.nextToken());
		 }
	 }//insert
	 
	 int rst=0 ;
	 for(int i=0; i<c; i++) {
		 for(int j=i+1; j<c; j++) {
			 for(int k=j+1; k<c; k++) {
				 int sum =0;
				 
				for(int n=0; n<r; n++) {
					sum += Math.max(map[n][i], Math.max(map[n][j], map[n][k]));
					rst = Math.max(rst, sum);
				}
			 }
		 }
	 }
	 bw.write(String.valueOf(rst));
	 bw.flush();
	 
	 
   }// main

 

}//class 
 