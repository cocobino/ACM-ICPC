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
    	 
    	 int arr[] = new int[10];
    	 int sum=0;
    	 for(int i=0; i<10; i++) {
    		 arr[i] = Integer.parseInt(br.readLine());
    		 sum +=arr[i];
    		 
    	 }
    	 
    	 int avg = sum/10;
    	 
    	 int cnt[] =new int[10];
    	 for(int i=0; i<10; i++) {
    		 for(int j=0; j<10; j++) {
    			 if(arr[i]==arr[j])cnt[i]++;
    		 }
    	 }
    	 int max=0;
    	 for(int i=0; i<10; i++) {
    		 max = Math.max(max, cnt[i]);
    	 }
    	 int tmp=0;
    	 bw.write(String.valueOf(avg +"\n"));
    	 for(int i=0; i<10; i++) {
    		 if(cnt[i]==max)tmp =i;
    		 
    	 }
    	 bw.write(String.valueOf(arr[tmp]));
    	 bw.flush();

    }

   
    }



