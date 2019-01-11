
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
	 int test_case = Integer.parseInt(br.readLine());
	 
	 
	 for(int i=0; i<test_case; i++) {
		 int arr[][] = new int[4][2];
		 
		 st = new StringTokenizer(br.readLine());
		 for(int j=0; j<4; j++) {
			 arr[j][0]=Integer.parseInt(st.nextToken());
		 }

		 for(int j=0; j<4; j++) {
			 arr[j][1]=Integer.parseInt(st.nextToken());
		 }
		 
		 int rst =0;
		 
		 int hp = arr[0][0] + arr[0][1] >=1 ? arr[0][0] + arr[0][1] : 1; 
		 int mp = arr[1][0] + arr[1][1] >=1 ? arr[1][0] + arr[1][1] : 1;
		 int attack = arr[2][0] + arr[2][1] >=0 ? arr[2][0] + arr[2][1] : 0;
		 int shiled = arr[3][0]+arr[3][1];
		 
		 rst = 1*hp + 5*mp + 2*attack + 2*shiled;
		 
		 bw.write(String.valueOf(rst+"\n"));
		 bw.flush();
		 
		 
	 }
		
		
		
	}// main

 

}// class

   