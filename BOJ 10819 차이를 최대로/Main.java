import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	 
	 static int cnt=0;
	static int max=0;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int arr[] = new int[n];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i]= Integer.parseInt(st.nextToken());
		}
		
		f(arr,0,n);
		bw.write(String.valueOf(max));
		bw.flush();
		
	}

	private static void f(int[] arr, int num, int n) {
		// TODO Auto-generated method stub
		if( num==n) {
			return;
			}
		 
		for(int i=num; i<n; i++) {
			swap(arr, num, i);
			f(arr,num+1,n);
			max(arr,n);
			swap(arr, i, num);
		}
	}

	private static void max(int[] arr, int n) {
		// TODO Auto-generated method stub
		int tmp = 0;
		int ans =0;
		
		for(int i=0; i<n-1; i++) {
			tmp =Math.abs(arr[i] -arr[i+1]);
			ans += tmp;
		}
		if(max>ans)max = ans;
	}

	private static void swap(int[] arr, int num, int i) {
		// TODO Auto-generated method stub
		int tmp = arr[num];
		arr[num] = arr[i];
		arr[i]= tmp;
	}
}