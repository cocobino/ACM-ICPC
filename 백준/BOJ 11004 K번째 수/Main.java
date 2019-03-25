import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	 static int r,c,n;
	 static int map[][];
	 
	 static int dx[] = {1,0,-1,0};
	 static int dy[] = {0,1,0,-1};
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
 		int k = Integer.parseInt(st.nextToken());
 		
 		int arr[] = new int[n];
 		
 		st = new StringTokenizer(br.readLine());
 		for(int i=0; i<n; i++) {
 			arr[i] = Integer.parseInt(st.nextToken());
 		}
 		
 		Arrays.sort(arr);
 		
 		System.out.println(arr[k-1]);
 	 
		
	}//main
 	 
}// class
