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
		
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	
    	int test_case = Integer.parseInt(br.readLine());

    	for(int T=0; T<test_case; T++) {
    		char list[][] =new char[5][15];
    		for(int i=0; i<5; i++)Arrays.fill(list[i], '.');
    		
    		for(int i=0; i<5; i++) {
    			String in = br.readLine();
    		for(int j=0; j<in.length(); j++) {	
    			list[i][j] = in.charAt(j);
    		}
    	}//insert
    		String rst = "";
    		for(int i=0; i<15; i++) {
    			for(int j=0; j<5; j++) {
    				if(list[j][i] != '.')rst+=list[j][i];
    			}
    		}
    		bw.write(String.valueOf("#"+(T+1)+" "+rst+"\n"));
    		bw.flush();
    	}//test-case
    		
    	}//main func

	}//class

	 
