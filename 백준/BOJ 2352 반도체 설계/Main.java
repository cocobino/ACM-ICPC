import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
static int max = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}//insert
		
		
		int rst = lis(arr,n);
		
		System.out.println(rst);

	}// main
	private static int lis(int[] arr, int n) {
		int[] tail = new int[n];
		int lis = 0;
		
		tail[0] = arr[0];
		lis = 1;
		
		for(int i=1; i<n; i++) {
			if(arr[i] < tail[0]) {
				tail[0] = arr[i];
			}
			else if( arr[i] > tail[lis-1]) {
				tail[lis] = arr[i];
				lis++;
			}
			else {
				int idx = Arrays.binarySearch(tail, 0, lis, arr[i]);
			idx = idx < 0 ? -idx -1 : idx;
			tail[idx] = arr[i];
			}
		}
		
		return lis;
	}
 
 

}// class
 