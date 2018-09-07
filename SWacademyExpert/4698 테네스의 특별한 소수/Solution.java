import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
 
public class Solution {
		
	static int d,a,b;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());

    	for(int T=1; T<=test_case; T++) {
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		d = Integer.parseInt(st.nextToken());
    		a = Integer.parseInt(st.nextToken());
    		b = Integer.parseInt(st.nextToken());
    		
    	 boolean chk[] =new boolean[b+1];
    	 chk[0]=true;
    	 chk[1]=true;
    	 for(int i=2; i*i<b+1; i++) {
    		 for(int j=2*i; j<b+1; j+=i) {
    			 chk[j]=true;
    		 }
    	 }
    	 
    	 int rst=0;
    	 for(int i=a; i<=b; i++) {

    		 
    		 if(!chk[i]) {
    			 String a = Integer.toString(i);
    			 for(int j=0; j<a.length(); j++) {
    				 if(a.charAt(j)-'0'==d) {
    					 rst++;
    					 break;
    				 }
    			 }
    		 }
    	 }
    
    	 bw.write(String.valueOf("#"+T+" "+rst+"\n"));
    	 bw.flush();
    	}//test-case
    		
    	}//main func
 
	}//class

	 
