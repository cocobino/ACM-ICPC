import java.awt.Point;
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
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static int n,m;
   static int arr[];
   static int cnt=0;
   
    public static void main(String[] args) throws IOException {
    	st = new StringTokenizer(br.readLine());
    	n = Integer.parseInt(st.nextToken());
    	m = Integer.parseInt(st.nextToken());
     
    	arr = new int[1000001];
    	st = new StringTokenizer(br.readLine());
    	for(int i=1; i<=n; i++)arr[i] = Integer.parseInt(st.nextToken());
    	//insert
    	
     
    	
    	long sum =0;
    	long ans=0;
    	for (int i = 1, j = 1; i < n + 1; i++) {
    		if (i <= m)
    			sum += arr[i];
    		else {
    			ans = (ans > sum) ? ans : sum;
    			sum = sum + arr[i] - arr[j++];
    		}
    	}
    	ans = (ans > sum) ? ans : sum;
    	bw.write(String.valueOf(ans));
    	bw.flush();
    		
    	
		}//main 
 
     
}// class 