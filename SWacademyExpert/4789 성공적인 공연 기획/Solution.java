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
		
	static int a,b,total;
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());

    	for(int T=1; T<=test_case; T++) {
    		String a = " "+br.readLine();
    		char arr[] = new char[1005];
    		for(int i=1; i<a.length(); i++) {
    			arr[i] = a.charAt(i);
    		}
    		
    		int need=0;
    		int total=0;
    		int rst=0;
    		for(int i=0; i<a.length();i++) {
    			if(arr[i]=='0') {
    				continue;
    			}
    			else if(total >= i) {
    				total +=(arr[i]-'0');
    			}else {
    				rst +=(i-total);
    				total += (i-total);
    				total +=(arr[i]-'0');
    			}
    			
    		}
    		
    		bw.write(String.valueOf("#"+T+" "+(rst-'1')+"\n"));
    		bw.flush();
    		
    	}//test-case
    		
    	}//main func
 

	}//class

	 
