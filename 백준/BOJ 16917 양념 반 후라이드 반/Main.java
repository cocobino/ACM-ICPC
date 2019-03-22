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
		StringTokenizer st;
		
		st =new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		int c = Integer.parseInt(st.nextToken());
		int x = Integer.parseInt(st.nextToken());
		int y = Integer.parseInt(st.nextToken());
		
		int min = Math.max(x, y);
		
		long rst = a*x + b*y;
		long tmp=0;
		long max = Math.max(x, y);
		
		if(x>y) {
			tmp = a*(x-y) + (2*y*c);
		}
		else {
			tmp = b*(y-x)+(2*x*c);
		}
		rst = Math.min(rst, Math.min(2*c*max, tmp));
		
		System.out.println(rst);
				
	}//main
 	 
}// class
