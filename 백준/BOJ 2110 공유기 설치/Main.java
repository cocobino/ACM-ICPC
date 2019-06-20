import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	
	static long sorted[];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());

		long arr[] = new long[n];
		sorted = new long[n];
		for (int i = 0; i < n; i++) {
			arr[i] = Long.parseLong(br.readLine());
		}//isnert
		
		mergeSort(arr,0,arr.length-1);
		
		long l = 1;
		long r = arr[n-1]-arr[0];
		
		long d=0;
		long ans=0;
		
		while(l<=r) {
			long mid = (r+l)/2;
			long start = arr[0];
			int cnt= 1;
			
			for(int i=1; i<n; i++) {
				d = arr[i] - start;
				if(mid <= d	) {
					cnt ++;
					start = arr[i];
				}
			}
			
			if(cnt >= k){
				ans = mid;
				l = mid+1;
			}
			else {
				r =  mid -1;
			}
		}
	
		System.out.println(ans);
			
	}// main
	private static void mergeSort(long[] arr, int start, int end) {
		if(start < end	) {
			int mid = (start + end)/2;
			mergeSort(arr, start, mid);
			mergeSort(arr, mid+1, end);
			merge(arr,start,mid,end);
		}
		
	}

	private static void merge(long[] arr, int start, int mid, int end) {
		int left= start;
		int right = mid+1;
		int k = start;
		
		while(left <= mid && right <= end) {
			if( arr[left] <= arr[right]) {
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
			for(int pos= right; pos <=  end; pos++) {
				sorted[k] = arr[pos];
				k++;
			}
		}
		else {
			for(int pos = left; pos <= mid; pos ++) {
				sorted[k]  = arr[pos];
				k++;
			}
		}
		
		for(int i=start; i<=end; i++) {
			arr[i] = sorted[i];
		}
	}	

}// class
