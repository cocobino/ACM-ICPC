import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	static int dx[] = {1,1,-1,-1};
	static int dy[] = {1,-1,1,-1};
	
	
	static int n,cnt;
	
	 public static void main(String[] args) throws IOException {
 
		 int T = Integer.parseInt(br.readLine());
		 
		 for(int test=0; test<T; test++) {
			 StringTokenizer st= new StringTokenizer(br.readLine());
			
			 int x1 = Integer.parseInt(st.nextToken());
			 int y1 = Integer.parseInt(st.nextToken());
			 int r1 = Integer.parseInt(st.nextToken());
			 
			 int x2 = Integer.parseInt(st.nextToken());
			 int y2 = Integer.parseInt(st.nextToken());
			 int r2 = Integer.parseInt(st.nextToken());
			 
			 double dist = Math.pow((x2-x1), 2) + Math.pow((y2-y1), 2);
			 double r = Math.sqrt(dist);
			 //무수히 많을때
			 if(x1 ==x2 && y1== y2 && r1== r2) {
				 bw.write(String.valueOf("-1"+"\n"));
				 bw.flush();
				 continue;
			 }
			 
			 //교점 없을때
			 else if( (x1 == x2 && y1 ==y2 && r1 != r2) || (r > r1+r2) || (r <Math.abs(r1-r2))) {
				 bw.write(String.valueOf("0"+"\n"));
				 bw.flush();
				 continue;
			 }
			 //교정 1개일때
			 else if( (r==r1+r2) || Math.abs(r1-r2)==r) {
				 bw.write(String.valueOf("1"+"\n"));
				 bw.flush();
				 continue;
			 }
			 else {
				 bw.write(String.valueOf("2"+"\n"));
				 bw.flush();
				 continue;
			 }
		 }//test_case
 	 
	 
	 }//main

 
 
}// class
 