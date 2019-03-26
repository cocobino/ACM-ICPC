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

public class Main {

	static int r, c, n;
	static int map[][];
	static boolean readvis[][];

	static int dx[] = { 1, 0, -1, 0 }; // го , ©Л, ╩С, аб
	static int dy[] = { 0, 1, 0, -1 };

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		// BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;

	 int n = Integer.parseInt(br.readLine());
	 int arr[] = new int[n];
	 
	 st= new StringTokenizer(br.readLine());
	 for(int i=0; i<n; i++) {
		 arr[i] = Integer.parseInt(st.nextToken());
	 }//insert
	 
	 boolean flag=false;
	 
	 int wgt=0;
	 int rst=0;
	 for(int i=0; i<n; i++) {
		 if(arr[i] !=0 && !flag) {
			 wgt++;
			 rst+=wgt;
		 }
		 
		 else if(arr[i] ==0) {
			 wgt=0;
			 flag=false;
		 }
		 else if(arr[i] !=0 && flag) {
			 wgt++;
			 rst+=wgt;
		 }
	 }
	 	System.out.println(rst);
	 
		
	}// main
}// class
f