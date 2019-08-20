import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int sorted[];
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        
       st = new StringTokenizer(br.readLine());
       int n = Integer.parseInt(st.nextToken());
       int k = Integer.parseInt(st.nextToken());
       sorted = new int[n+1];
       int arr[] = new int[n+1];
       
       st = new StringTokenizer(br.readLine());
       for(int i=1; i<=n; i++) {
    	   arr[i] = Integer.parseInt(st.nextToken());
       }//for loop
      
      mergeSort(arr, 0, arr.length-1);
      
      int dp[] = new int[n+1];
      
      for(int i=1; i<=n; i++) {
    	  dp[i] = dp[i-1] + arr[i];
      }
      
      
      
      for(int i=0; i<k; i++) {
    	  st = new StringTokenizer(br.readLine());
    	  int left = Integer.parseInt(st.nextToken());
    	  int right = Integer.parseInt(st.nextToken());
    	  
    	  System.out.println(dp[right]-dp[left-1]);
    	  
      }
      
       
      
    }// main

	private static void mergeSort(int[] arr, int start, int end) {
		if(start <end) {
			int mid = (start + end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr, start, mid, end);
		}
		
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int l = start;
		int r = mid+1;
		int idx = start;
		
		while( l <= mid && r <= end) {
			if( arr[l] <= arr[r]) {
				sorted[idx++] = arr[l];
				l++;
			}
			else {
				sorted[idx++] = arr[r];
				r++;
			}
		}
		
		if( l> mid) {
			for(int pos=r; pos<=end; pos++) {
				sorted[idx++] = arr[pos];
			}
		}
		else {
			for(int pos=l; pos<=mid; pos++) {
				sorted[idx++] = arr[pos];
			}
		}
		
		
		for(int i=start; i<=end; i++) {
			arr[i] = sorted[i];
		}
		
	}
 
     

}// class
  
 