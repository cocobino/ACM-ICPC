import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	 
	static int c,k,p;
	static int map[], rst[], stack[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		int arr[] = new int[4];
		
		 st =new StringTokenizer(br.readLine());
		 for(int i=0; i<4; i++)arr[i] =Integer.parseInt(st.nextToken());
		 
		 Arrays.sort(arr);
		 
		 int rst = arr[0]*arr[2];
		 
		 bw.write(String.valueOf(rst));
		 bw.flush();
		
	}//main

}//class
 