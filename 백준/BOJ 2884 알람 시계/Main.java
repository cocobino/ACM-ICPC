
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
	
	static int h,m;
	
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	static int x,y;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 st = new StringTokenizer(br.readLine());
	 h = Integer.parseInt(st.nextToken());
	 m = Integer.parseInt(st.nextToken());
	 
	 if(m-45>=0) {
		 m-=45;
	 }else if(m-45<0){
		 if(h>0)h--;
		 else if(h==0)h=23;
		 m-=45;
		 m+=60;
	 }
	 
	 bw.write(String.valueOf(h +" "+m));
	 bw.flush();
		
		
		
	}// main

 

}// class

   