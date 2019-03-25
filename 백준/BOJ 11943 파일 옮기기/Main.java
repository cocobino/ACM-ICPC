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
		int a = Integer.parseInt(st.nextToken());
 		int b = Integer.parseInt(st.nextToken());
 		
 		st = new StringTokenizer(br.readLine());
		int c = Integer.parseInt(st.nextToken());
 		int d = Integer.parseInt(st.nextToken());
 		
 		
 		//1번 사과로 옮기기
 		int rst = Math.min(a+d, b+c);
 		
 		System.out.println(rst);
		
	}//main
 	 
}// class
