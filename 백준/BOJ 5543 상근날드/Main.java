
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
		 int arr[]  = new int[3];
		 int brr[] = new int[2];
		 
		 for(int i=0; i<5; i++) {
			 if(i<=2)arr[i]=Integer.parseInt(br.readLine());
			 else brr[i-3] = Integer.parseInt(br.readLine());
		 }
		Arrays.sort(arr);
		Arrays.sort(brr);
		
		bw.write(String.valueOf(arr[0]+brr[0]-50));
		bw.flush();
		
		
	}// main

 

}// class

   