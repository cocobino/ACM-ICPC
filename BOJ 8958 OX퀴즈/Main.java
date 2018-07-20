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
	   
	        int test = Integer.parseInt(br.readLine());
	        for(int T=0; T<test; T++) {
	        	String a = br.readLine();
	        	int cnt=0;
	        	int wgt=0;
	        	for(int i=0; i<a.length(); i++) {
	        		if(a.charAt(i)=='O') {
	        			cnt++;
	        			wgt +=cnt;
	        		}
	        		if(a.charAt(i)=='X') {
	        			cnt=0;
	        		}

	        	}
	        	bw.write(String.valueOf(wgt+"\n"));
	        	bw.flush();
	        	
	        	
	        }//test_case
	        
		}
	    
		}