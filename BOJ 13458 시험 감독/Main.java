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
		int B = Integer.parseInt(st.nextToken()); //�Ѱ��� ����
		int C = Integer.parseInt(st.nextToken()); //�ΰ��� ����
		
		
		long sum1=0;
		long sum2=0;
		
		//sol
		
		//�Ѱ�����
		for(int i=0; i<N; i++) {
			if(arr[i]>=B) {
				arr[i]=arr[i]-B;
				sum1++;
			}else {
				arr[i]=0;
				sum1++;
			}
		}
		//�ΰ�����
		for(int i=0; i<N; i++) {
			if(arr[i] !=0 && arr[i]%C ==0) { // �ο����� 0�̾ƴϰ� c�� ����� ��������
				sum2=sum2+(arr[i]/C);
			}else if(arr[i] !=0 && arr[i]%C !=0) {
				sum2 =(sum2+1)+(arr[i]/C);
			}
		}
		
		
		bw.write(String.valueOf(sum1+sum2));
		bw.flush();
		
	 	} 
}
 
