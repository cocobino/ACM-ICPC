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
	        	
	      //  StringTokenizer st = new StringTokenizer(br.readLine());
	       String a = br.readLine();
	       for(int i=0; i<a.length(); i++) {
	    	   if(i%10==0 && i!=0) 
	    		   bw.write("\n");
	    		   bw.write(String.valueOf(a.charAt(i)));
	    		   
	    	   
	       }
	    	   
	       
	       
	       
	        	bw.flush();
	        }
	        
		}
	