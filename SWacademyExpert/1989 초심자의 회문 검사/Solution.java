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
		
	static int n,m;
	static int map[][];
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=1; T<=test_case; T++) {
    		String in = br.readLine().trim();
    		String tmp1="";
    		String tmp2="";
    		int center = in.length()/2;
    		
    		if(in.length()%2!=0) {
    		for(int i=0; i<center; i++) {
    			tmp1+=in.charAt(i);
    		}
    		for(int i=in.length()-1; i>center; i--) {
    			tmp2+=in.charAt(i);
    		}
    		if(tmp1.equals(tmp2))bw.write(String.valueOf("#"+T+" "+1+"\n"));
    		else bw.write(String.valueOf("#"+T+" "+0+"\n"));
    		}else {
    			for(int i=0; i<center; i++) {
        			tmp1+=in.charAt(i);
        		}
        		for(int i=in.length()-1; i>=center; i--) {
        			tmp2+=in.charAt(i);
        		}
        		if(tmp1.equals(tmp2))bw.write(String.valueOf("#"+T+" "+1+"\n"));
        		else bw.write(String.valueOf("#"+T+" "+0+"\n"));
    		}
    		bw.flush();
    		
    	}//test-case

	}//main

	 
}