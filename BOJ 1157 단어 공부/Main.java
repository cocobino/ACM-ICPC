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
	        
	        String a = br.readLine().toUpperCase();
	        char ab = 0;
	        int arr[] = new int[26];
	        int max=0;
	        
	        
	        for(int i=0; i<a.length(); i++) {
	        	arr[a.charAt(i)-65]++;
	        	if(max<arr[a.charAt(i)-65]) {
	        		max = arr[a.charAt(i)-65];
	        		ab = a.charAt(i);
	        	}else if(max == arr[a.charAt(i)-65])ab='?';
	        }
	        
	       bw.write(String.valueOf(ab));
	       bw.flush();
	        
		}
	    
		}
	