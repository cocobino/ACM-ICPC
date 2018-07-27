		import java.io.BufferedReader;
		import java.io.BufferedWriter;
		import java.io.IOException;
		import java.io.InputStreamReader;
		import java.io.OutputStreamWriter;
		import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
		import java.util.LinkedList;
		import java.util.Queue;
		import java.util.Scanner;
		import java.util.StringTokenizer;
		
		
		
		public class Main {
		
			
		    public static void main(String[] args) throws IOException {
		        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		     	
		        StringTokenizer st = new StringTokenizer(br.readLine());
		        int a = Integer.parseInt(st.nextToken());
		        int b = Integer.parseInt(st.nextToken());
		        int c = Integer.parseInt(st.nextToken());
		        int arr[] = new int[81];
		        for(int i=1; i<=a; i++) {
		        	for (int j=1; j<=b; j++) {
		        		for (int k=1; k<=c; k++) {
		        			arr[i+j+k]++;
		        		}
		        	}
		        }
		        int max=0;
		        int ans =0;
		        for(int i=0; i<arr.length;i ++) {
		        	if(max<arr[i]) {
		        		max=arr[i];
		        		ans=i;
		        	}
		        	
		        	
		        }
		        bw.write(String.valueOf(ans));
	        	bw.flush();
		        
		      }
		    }
