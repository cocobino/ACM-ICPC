import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static boolean visit[];
   static int n,m;
   static int arr[] = new int[10000];
   
  
   
    public static void main(String[] args) throws IOException {
    	
    	n = Integer.parseInt(br.readLine());
    	
    	int left=0,right=0;
    	
    	st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n; i++) {
    		arr[i]=Integer.parseInt(st.nextToken());
    		right = Math.max(right, arr[i]);
    	}
    	m = Integer.parseInt(br.readLine());
    	
    	while( left != right) {
    		int mid = (left +right +1)/2; // 0,1 일 경우 때문에 +1
    		if(valid(mid)) {
    			left = mid;
    		}else {
    			right = mid -1;
    		}
    	}
    	
    	bw.write(String.valueOf(left));
    	bw.flush();
    	
	}// main

	private static boolean valid(int mid) {
		// TODO Auto-generated method stub
		int ret =0;
		for(int i=0; i<n; i++) {
			ret += Math.min(mid, arr[i]);
		}
		return (ret<=m); // ret 값이 입력 값보다 작으면 집행가능해짐 아니라면 false return;
	}

 

 
}//class
