	import java.io.BufferedReader;
	import java.io.BufferedWriter;
	import java.io.IOException;
	import java.io.InputStreamReader;
	import java.io.OutputStreamWriter;
	import java.util.ArrayList;
	import java.util.Collections;
	import java.util.LinkedList;
	import java.util.Queue;
	import java.util.StringTokenizer;
	
	
	
	
	public class Main {
		
		
		
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	       
	       int a = Integer.parseInt(br.readLine());
	       int b = Integer.parseInt(br.readLine());
	       int c = Integer.parseInt(br.readLine());
	       int arr[] = new int[10];
	       
	       int rst = a*b*c;
	       
	       while(rst !=0) {
	    	   arr[rst%10]++;
	    	   rst/=10;
	       }
	       
	       for(int i=0; i<10; i++) {
	    	   bw.write(String.valueOf(arr[i]+"\n"));
	       }
	     bw.flush();  
		}
	    
		}