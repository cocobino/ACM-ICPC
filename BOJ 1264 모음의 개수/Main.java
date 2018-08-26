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
	 
			while(true) {
				String a = br.readLine();
				int cnt=0;
				if(a.equals("#"))break;
				
				for(int j=0; j<a.length();j++) {
					char c= a.charAt(j);
					switch(c) {
					case'a':
					case'e':
					case'i':
					case'o':
					case'u':
					case'A':
					case'E':
					case'I':
					case'O':
					case'U':
						cnt++;
					}
				}
				bw.write(String.valueOf(cnt+"\n"));
				bw.flush();
			}
			
		}
	}
		