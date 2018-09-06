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
	        
	       int arr[] = new int[26];
	       
	       String a= br.readLine();
	       Arrays.fill(arr, -1);
	       
	       for(int i=0; i<a.length(); i++) {
	    	  if(arr[(a.charAt(i)-97)] == -1) {
	    	  arr[a.charAt(i)-97]=i;
	    	  }
	    	   
	       }
	        for(int i=0; i<26;i ++) {
	        	bw.write(String.valueOf(arr[i]+" "));
	        }
	        bw.flush();
		}
	    
		}