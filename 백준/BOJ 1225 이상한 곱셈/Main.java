		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
		import java.util.ArrayList;
		import java.util.Collections;
		import java.util.LinkedList;
		import java.util.Queue;
		import java.util.Scanner;
		import java.util.StringTokenizer;
		
		
		
		public class Main {
		
			
		    public static void main(String[] args) throws IOException {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		     	
		        String a = br.readLine();
		        
		        char arr[];
		        char brr[];
		        int div=0;
		        for(int i=0; i<a.length(); i++) {
		        	if(a.charAt(i)==' ')div=i;
		        }
		        arr = a.substring(0, div).toCharArray();
		        brr = a.substring(div+1, a.length()).toCharArray();
		        long ans=0;
		        for(int i=0; i<arr.length; i++) {
		        	for(int j=0; j<brr.length; j++) {
		        		ans += (arr[i]-48)*(brr[j]-48);
		        	}
		        }
		        
		        bw.write(String.valueOf(ans));
		        bw.flush();
		      }
		    }
