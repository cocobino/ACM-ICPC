import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		 StringTokenizer st = new StringTokenizer(br.readLine());
		 int n = Integer.parseInt(st.nextToken());
		 int k = Integer.parseInt(st.nextToken());
		 
		 int arr[] = new int[n+1];
		 
		 for(int i=1; i<=n; i++)arr[i]=i;
		 
		 for(int i=0; i<k; i++) {
			 st = new StringTokenizer(br.readLine());
			 int a = Integer.parseInt(st.nextToken());
			 int b = Integer.parseInt(st.nextToken());
			 int tmp;
			 
			 tmp = arr[a];
			 arr[a] = arr[b];
			 arr[b]=tmp;
			 
		 }
		 for(int i=1; i<=n; i++)bw.write(String.valueOf(arr[i]+" "));
		 bw.flush();
	}
 
}
