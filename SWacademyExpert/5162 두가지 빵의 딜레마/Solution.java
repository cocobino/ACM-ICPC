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
    		 StringTokenizer st = new StringTokenizer(br.readLine());
    		 a = Integer.parseInt(st.nextToken());
    		 b = Integer.parseInt(st.nextToken());
    		 total= Integer.parseInt(st.nextToken());
    		 
    		 int big =0;
    		 int small =0;
    		 if(a>b) {
    			 small =b;
    			 big =a;
    		 }
    		 else if(a<b) {
    			 small = a;
    			 big =b;
    		 }else {
    			 small=big=a;
    		 }
    		 int rst =0;
    		 rst = (total/small);
    		 total = total-(rst*small);
    		 if(total>=big) {
    			 rst = rst+(total/big);
    		 }
    		 
    		 bw.write(String.valueOf("#"+(T)+" "+rst+"\n"));
    		 bw.flush();
    		 
    	}//test-case
    		
    	}//main func
 

	}//class

	 
