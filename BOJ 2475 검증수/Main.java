import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.Vector;
 
 

public class Main {
	
    public static void main(String[] args) throws IOException {
    	 BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	 BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 int arr[] = new int[5];
    	 StringTokenizer st = new StringTokenizer(br.readLine());
    	 arr[0] = Integer.parseInt(st.nextToken()); 
    	 arr[1] = Integer.parseInt(st.nextToken());
    	 arr[2]= Integer.parseInt(st.nextToken());
    	 arr[3]= Integer.parseInt(st.nextToken());
    	 arr[4]= Integer.parseInt(st.nextToken());
    	 
    	 
    	 for(int i=0; i<5; i++) {
    		 arr[i] = (int) Math.pow(arr[i], 2);
    	 }
    	 
    	 int ans=0;
    	 for(int i=0; i<5; i++) {
    		 ans += arr[i];
    	 }
    	 bw.write(String.valueOf(ans%10));
    	 
    	 bw.flush();
    	 
 	}
 }

