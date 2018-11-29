import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   
    public static void main(String[] args) throws IOException {
    	
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=0; T<test_case; T++) {
    		st = new StringTokenizer(br.readLine());
    		
    		int m = Integer.parseInt(st.nextToken());
    		int n = Integer.parseInt(st.nextToken());
    		int x = Integer.parseInt(st.nextToken());
    		int y = Integer.parseInt(st.nextToken());
    		
    		//start point
    		int tmpx=1,tmpy=1;
    		int cnt=1;
    		int d=1;
    		for(;;) {
    			if(tmpx == x)d=m;
    			else if(tmpy == y)d=n;
    			
    			tmpx = ((tmpx+d)%m == 0) ? m : (tmpx+d)%m;
    			tmpy = ((tmpy+d)%n == 0) ? n : (tmpy+d)%n;
    			cnt+=d;
    			
    			if(tmpx ==x && tmpy ==y) {
    			break;
    			}
    			if(cnt > n*m) {
    				cnt=-1;
    				break;
    			}
    			
    			
    		}
    		    	
    		bw.write(String.valueOf(cnt+"\n"));
    		bw.flush();
    		
    		
    	}//test_case
    	
	}// main


	 
	
    
}//class

