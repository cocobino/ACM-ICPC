import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
		/*
		 * 1-> 1 돌아왔을때 T 값이 음수 
		 */
		public static final int INF = Integer.MAX_VALUE;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int K = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[K];
		
		
		for(int i=0; i<K; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}
			Arrays.sort(arr);
			
		long max = arr[K-1];
		long min =1;
		long mid =0;
		
		while(max >= min) {
			mid = (min+max)/2;
			long rst = 0;
			
			for(int j=0; j<arr.length; j++) {
				rst += arr[j]/mid;
			}
			if(rst>=N) {
				min = mid+1;
			}else if(rst <N) {
				max = mid-1;
			}
		
		}
	bw.write(String.valueOf(max));
	bw.flush();
		
	}
}