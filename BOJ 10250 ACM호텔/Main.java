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
	
		        int test = Integer.parseInt(br.readLine());
		        
		        for(int T=0; T<test; T++) {
		        	StringTokenizer st = new StringTokenizer(br.readLine());
		        	int H = Integer.parseInt(st.nextToken());
		        	int W = Integer.parseInt(st.nextToken());
		        	int N = Integer.parseInt(st.nextToken());
		        	
		        	
		        	
		        	int Y = N%H;
		        	int X = N/H;
		        	
		        	if(Y==0) {
		        		Y=H;
		        		X=X-1;
		        	}
		        		
		        		
		        	bw.write(String.valueOf(Y*100+X+1+"\n"));
		        	bw.flush();
		        	
		        }
			}
		    
			}
		
	