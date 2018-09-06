import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	 
		 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[N];
		int brr[] = new int[N-1];
		//String a = br.readLine();
		//int idx_num=0;
		
		 st = new StringTokenizer(br.readLine(), ",");
		 for(int i=0; i<N; i++) {
			 arr[i] = Integer.parseInt(st.nextToken());
		 }
		
		for(int i=0; i<K; i++) {
			for(int j=0; j<N-1; j++) {
				arr[j]=arr[j+1]-arr[j];
			}
		}
		
		for(int i=0; i<N-K; i++) {
			bw.write(String.valueOf(arr[i]));
			if(i==N-K-1)break;
			bw.write(String.valueOf(","));
		}
		bw.flush();
	}
}