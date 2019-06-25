import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
		static int sorted[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[n];
		sorted = new int[n];
		
		for(int i=0; i<n; i++) {
			arr[i] =Integer.parseInt(st.nextToken());
		}
		
		mergeSort(arr, 0, n-1);
//		System.out.println(Arrays.toString(arr));
		
		int m = Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			System.out.print(binary(Integer.parseInt(st.nextToken()), arr)+" ");
		}

	}// main

	private static void mergeSort(int[] arr, int start, int end) {
		if(start <end) {
			int mid = (start +end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			maerge(arr,start,mid,end);
		}
		
	}

	private static void maerge(int[] arr, int start, int mid, int end) {
		int left= start;
		int right= mid+1;
		int k = start;
		
		while(left <=mid && right <=end) {
			if(arr[left]<= arr[right]) {
				sorted[k] = arr[left];
				left++;
			}
			else {
				sorted[k] = arr[right];
				right++;
			}
			k++;
		}
		
		if(left > mid) {
			for(int pos = right; pos<=end; pos++) {
				sorted[k] = arr[pos];
				k++;
			}
		}
		else {
			for(int pos = left; pos<=mid; pos++) {
				sorted[k] = arr[pos];
				k++;
			}
		}
		
		for(int i=start; i<=end; i++) {
			arr[i] = sorted[i];
		}
		
	}

	private static int binary(int find, int[] arr) {
		int left =0;
		int right = arr.length-1;
		
		while(true) {
			int mid = (left+right)/2;
			 
			if(arr[mid] == find || arr[left] == find || arr[right]==find)return 1;
			if(arr[mid] <find)left = mid+1;
			else right = mid-1;
			
			if(left >= right)return 0;
			
		}
	}
	 
}// class
