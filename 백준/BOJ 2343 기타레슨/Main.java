import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	 
	
	static long min,max;
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        
     
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int k = Integer.parseInt(st.nextToken());
        
        int arr[] = new int[n];
        int sum =0;
        st = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++) {
        	arr[i] = Integer.parseInt(st.nextToken());
        	sum += arr[i];
        }//insert
        
        int l = 1;
        int r = sum;
        int rst =0;
        while(l <= r) {
        	int mid = (l+r)/2;
        	
        	if(ispossible(mid,n,arr,k)) {
        		rst = mid;
        		r = mid -1;
         	}
        	else 
        		l = mid +1;
        }
        System.out.println(rst);
        
    }// main
	private static boolean ispossible(int mid,int n, int[] arr, int k) {
		int sum =0;
		int cnt =1;
		
		for(int i=0; i<n; i++) {
			if(arr[i] > mid)return false;
			
			sum += arr[i];
			if(sum > mid) {
				sum = arr[i];
				cnt++;
			}
			
		}
		return k >= cnt;
	}
     
}// class
  
 