		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
		import java.util.ArrayList;
		import java.util.Arrays;
		import java.util.LinkedList;
		import java.util.Queue;
		import java.util.Scanner;
		import java.util.StringTokenizer;
		
		public class Main {
	 
			public static void main(String args[]) throws IOException {
				BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
				BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
				int arr[] = new int[8];
				int tmp[] = new int[8];
				
				int a[] = new int[8];
				
				for(int i=0; i<8; i++) {
					tmp[i] = arr[i] = Integer.parseInt(br.readLine());
				}
				Arrays.sort(arr);
				int sum=0;
				for(int i=3; i<8; i++) {
					sum +=arr[i];
				}
				bw.write(String.valueOf(sum +"\n"));
				
				for(int i=3; i<8; i++) {
					for(int j=0; j<8; j++) {
						if(arr[i] == tmp[j]) {
							a[i] = j;
						}
					}
				}
			Arrays.sort(a);
				for(int i=3; i<8; i++) {
					bw.write(String.valueOf((a[i]+1)+" "));
				}
				bw.flush();
				
			
			}
		}
		