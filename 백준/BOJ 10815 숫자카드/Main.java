import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
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
		
		int N = Integer.parseInt(br.readLine());
		int arr[] = new int[N];
		StringTokenizer st= new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++) {
			arr[i]=Integer.parseInt(st.nextToken());
		}
		Arrays.sort(arr);
		int M = Integer.parseInt(br.readLine());
		int brr[] = new int[M];
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<M; i++) {
			brr[i]=Integer.parseInt(st.nextToken());
		}
		
		// 이분탐색
		for(int i=0; i<brr.length; i++) {
			int flag=0;
			int max =N;
			int min=0;
			int middle;
			
			while(max-min>1) {
				middle = (max+min)/2;
				
				if(brr[i] ==arr[0]) {
					flag =1; break;
				}
				if(brr[i]==arr[middle]) {
					flag =1; break;
				}
				if(brr[i]>arr[middle]) {
					min =middle;
				}else {
					max=middle;
				}
				
			}
			bw.write(String.valueOf(flag+" "));
			
		}
		bw.flush();
	
		
	}
}