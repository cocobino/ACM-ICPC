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
	import java.util.StringTokenizer;
	
	
	
	
	public class Main {
		
		
		
	    public static void main(String[] args) throws IOException {
	        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	        	int t = Integer.parseInt(br.readLine());
	        	for(int T=0; T<t; T++) {
	        	StringTokenizer st = new StringTokenizer(br.readLine());
	        	
	        	int a = Integer.parseInt(st.nextToken());
	        	String b = st.nextToken();
	        	
	        	for(int i=0; i<b.length(); i++) {
	        		for(int j=0; j<a; j++) {
	        			bw.write(String.valueOf(b.charAt(i)));
	        		}
	        		
	        	}
	        	bw.write(String.valueOf("\n"));
	        	
	      bw.flush();
	      
	        	}
		}
	    
		}
	