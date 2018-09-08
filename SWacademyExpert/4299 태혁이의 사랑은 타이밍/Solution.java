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
		
	static int n,m,max=0;
	static int map[];
	static boolean visit[];
	
	static int dx[] = {0,1,0,-1, 1,1,-1,-1};
	static int dy[] = {1,0,-1,0,-1,1, 1,-1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=1; T<=test_case; T++) {
    	
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	int d = Integer.parseInt(st.nextToken()); // ÀÏ
    	int h = Integer.parseInt(st.nextToken()); // ½Ã
    	int m = Integer.parseInt(st.nextToken()); // ºÐ
    	
    	d=d-11;h=h-11;m=m-11;
    	
    	int rst =(d*1440)+(h*60)+m;
    	if(rst<0)rst=-1;
    	
    	bw.write(String.valueOf("#"+T+" "+rst+"\n"));
    	bw.flush();
    		
    		}//test-case
    	}//main func

	
 	}//class

	 
