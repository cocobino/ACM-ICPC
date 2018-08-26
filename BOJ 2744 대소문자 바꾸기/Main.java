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
		 
				String a = br.readLine();
				String rst="";
				for(int i=0; i<a.length(); i++) {
					if(a.charAt(i)>=65 && a.charAt(i)<=90) {
						rst+=(char)(a.charAt(i)+32);
					}else if(a.charAt(i)>=97 && a.charAt(i)<=122) {
						rst+=(char)(a.charAt(i)-32);
					}
				}
			bw.write(String.valueOf(rst));
			bw.flush();
			}
		}
			