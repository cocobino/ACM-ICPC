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
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		 
	 
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		int N = Integer.parseInt(br.readLine());
		
		int arr[] = new int[N];
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<N; i++)arr[i] = Integer.parseInt(st.nextToken()); 
		
		st = new StringTokenizer(br.readLine());
		int B = Integer.parseInt(st.nextToken()); //총감독 감시
		int C = Integer.parseInt(st.nextToken()); //부감독 감시
		
		
		long sum1=0;
		long sum2=0;
		
		//sol
		
		//총감독관
		for(int i=0; i<N; i++) {
			if(arr[i]>=B) {
				arr[i]=arr[i]-B;
				sum1++;
			}else {
				arr[i]=0;
				sum1++;
			}
		}
		//부감독관
		for(int i=0; i<N; i++) {
			if(arr[i] !=0 && arr[i]%C ==0) { // 인원수가 0이아니고 c로 나누어서 떨어지면
				sum2=sum2+(arr[i]/C);
			}else if(arr[i] !=0 && arr[i]%C !=0) {
				sum2 =(sum2+1)+(arr[i]/C);
			}
		}
		
		
		bw.write(String.valueOf(sum1+sum2));
		bw.flush();
		
	 	} 
}
 
