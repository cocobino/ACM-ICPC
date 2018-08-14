import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
	static LinkedList<Integer> arr[];
	 
	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			arr = new LinkedList[5];
			for(int i=1; i<=4; i++)arr[i] = new LinkedList<Integer>();
			
			for(int i=1; i<=4; i++) {
				String a =br.readLine();
				for(int j=0; j<8; j++) {
					arr[i].add(a.charAt(j)-'0');
				}
			}
			
		
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=0; i<n; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			int num = Integer.parseInt(st.nextToken()); //톱니번호
			int dir = Integer.parseInt(st.nextToken()); //회전 방향(1=시계, -1=반시계)
			
			left(num-1,-dir);
			right(num+1,-dir);
			rotate(num,dir);
			
		}
int rst =0;
		for(int i=0; i<4; i++) {
			if(arr[i+1].get(0)==1) {
				rst +=(int)Math.pow(2, i);
			}
		}
		bw.write(String.valueOf(rst));
		bw.flush();
		
	}


	private static void right(int num, int dir) {
		// TODO Auto-generated method stub
	 if(!(1<=num && num<=4))return;
	 
	 if(check(num, num-1)) {
		 right(num+1, -dir);
		 rotate(num, dir);
	 }
	}


	private static void left(int num, int dir) {
		// TODO Auto-generated method stub
		if(!(1<=num && num<=4))return;
		
		if(check(num,num+1)) {
			left(num-1,-dir);
			rotate(num,dir);
		}
	}


	private static void rotate(int num, int dir) {
		// TODO Auto-generated method stub
		  if(dir==1) {
			  arr[num].addFirst(arr[num].pollLast());
		  }else {
			  arr[num].addLast(arr[num].pollFirst());
		  }
		  
		 
	}


	private static boolean check(int a, int b) {
		// TODO Auto-generated method stub
		if(a>b) {// 왼쪽
			if(arr[a].get(6) == arr[b].get(2)) {
				return false;
			}else {
				return true;
			}
		}else {
			if(arr[a].get(2) == arr[b].get(6)) {
				return false;
			}else {
				return true;
			}
		}
	}
	
	
 
 }
 
