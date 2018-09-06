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
				
				double rst=0;
				
				switch(a) {
				case "A+":
				rst = 4.3;
				break;
				case "A0":
					rst=4.0;
					break;
				case "A-":
					rst = 3.7;
					break;
				case "B+":
					rst = 3.3;
					break;
				case "B0":
					rst =3.0;
					break;
				case "B-":
					rst = 2.7;
					break;
				case "C+":
					rst =2.3;
					break;
				case "C0":
					rst = 2.0;
					break;
				case "C-":
					rst = 1.7;
					break;
				case "D+":
					rst = 1.3;
					break;
				case "D0":
					rst=1.0;
					break;
				case "D-":
					rst = 0.7;
					break;
				case"F":
					rst=0.0;
					break;
				}
			
				bw.write(String.valueOf(rst));
				bw.flush();
			
			}
		}
			