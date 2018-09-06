import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

		static int cnt=0;

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());
		int L = Integer.parseInt(st.nextToken());
		int cnt=0;
		int arr[] = new int[N];
	
		for(int i=0; ;) {
			arr[i]++;
			if(arr[i]==M)break;
			cnt++;
			
			if(arr[i]%2 ==1)i = (i+N-L)%N;
			else i = (i+L)%N;
			
		}// for - loop
		bw.write(String.valueOf(cnt));
		bw.flush();
	}
}
