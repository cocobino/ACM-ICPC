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
	        String arr[] = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
	        
	        int cnt=0;
	        String a = br.readLine();
	        for(int i=0; i<8; i++) {
	        	a = a.replace(arr[i],"b");
	        }
	        bw.write(String.valueOf(a.length()));
	        bw.flush();
	      
		}
	    
		}
	
	