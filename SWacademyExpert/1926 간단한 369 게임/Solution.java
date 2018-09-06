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
		
	static int n;
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int n = Integer.parseInt(br.readLine());
    	
    	for(int i=1; i<=n; i++) {
    		String a= Integer.toString(i);
    		String rst="";
    		int cnt=0;
    		for(int j=0; j<a.length(); j++) {
    			if(a.charAt(j)=='3' || a.charAt(j)=='6' || a.charAt(j)=='9') {
    				cnt++;
    			}
    		}
    		if(cnt==0)bw.write(String.valueOf(a+" "));
    		else if(cnt>0) {
    			for(int j=0; j<cnt; j++) {
    				rst+="-";
    			}
    			bw.write(String.valueOf(rst+" "));
    		}
    	}
    	bw.flush();
	}//main

	 
}