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
		
		int arr[] = new int[3];
		st =new StringTokenizer(br.readLine());
		for(int i=0; i<3; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		String a =br.readLine();
		
		Arrays.sort(arr);
		
		for(int i=0; i<a.length(); i++) {
			if(a.charAt(i)=='A') {
				System.out.print(arr[0]+" ");
			}
			else if(a.charAt(i)=='B') {
				System.out.print(arr[1]+" ");
			}
			else if(a.charAt(i)=='C') {
				System.out.print(arr[2]+" ");
			}
		}
	}//main
 	 
}// class
 