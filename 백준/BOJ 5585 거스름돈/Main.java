
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static int n,map[];
	
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	static int x,y;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 n =1000- Integer.parseInt(br.readLine());
		 
		 int cnt =0;
		 for(;;	) {
			 if(n-500>=0) {
				 n-=500;
				 cnt++;
			 }else if(n-100>=0) {
				 n-=100;
				 cnt++;
			 }else if(n-50>=0) {
				n-=50;
				cnt++;
				
			 }else if(n-10>=0) {
				 n-=10;
				 cnt++;
			 }else if(n-5>=0) {
				 n-=5;
				 cnt++;
			 }else if(n-1>=0) {
				 n-=1;
				 cnt++;
			 }
			 if(n==0)break;
		 }
		 bw.write(String.valueOf(cnt));
		 bw.flush();
		
	}// main

 

}// class

   