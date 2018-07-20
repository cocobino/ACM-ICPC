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
	       
	        String a = br.readLine().trim();
	        
	        int cnt= 0;
	        
	        if(a.isEmpty())bw.write(String.valueOf("0"));
	        else {
	        bw.write(String.valueOf(a.split(" ").length));
	        }
	        
	        bw.flush();    
		}
	    
		}