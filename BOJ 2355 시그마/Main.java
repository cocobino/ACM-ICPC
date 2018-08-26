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
		 
				StringTokenizer st =new StringTokenizer(br.readLine());
				long a = Integer.parseInt(st.nextToken());
				long b =  Integer.parseInt(st.nextToken());
				long suma=0;
				long sumb=0;
				
				if(a>b) {
					long tmp = b;
					b = a;
					a = tmp;
				}
				
				suma = (a-1)*(a)/2;
				sumb = (b*(b+1))/2;
				
				 
			bw.write(String.valueOf(sumb-suma));
			bw.flush();
			}
		}
			