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
		 int A = Integer.parseInt(st.nextToken());
		 int B = Integer.parseInt(st.nextToken());
		 int C = Integer.parseInt(st.nextToken());
		 
		 int arr[] = new int[101];
			
		 st = new StringTokenizer(br.readLine());
			 int As = Integer.parseInt(st.nextToken());
			 int Ae = Integer.parseInt(st.nextToken());
			 for(int i=As; i<Ae; i++)arr[i]++;
			 

			 st = new StringTokenizer(br.readLine());
			 int Bs= Integer.parseInt(st.nextToken());
			 int Be= Integer.parseInt(st.nextToken());
			 for(int i=Bs; i<Be; i++)arr[i]++;
		 
			 st = new StringTokenizer(br.readLine());
			 int Cs = Integer.parseInt(st.nextToken());
			 int Ce = Integer.parseInt(st.nextToken());
			 for(int i=Cs; i<Ce; i++)arr[i]++;
			 
			 int rst=0;
			 for(int i=0; i<101; i++) {
				 if(arr[i]==1)rst+=A*arr[i];
				 else if(arr[i]==2)rst+=B*arr[i];
				 else rst+=C*arr[i];
			 }
			 bw.write(String.valueOf(rst));
			 bw.flush();
		
		
	}
}