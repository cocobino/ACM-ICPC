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
	static boolean visit[][];
	static final int black = 1;
	static final int white = 2;
	
	static int dx[] = {0,1,0,-1, 1,1,-1,-1};
	static int dy[] = {1,0,-1,0,-1,1, 1,-1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=1; T<=test_case; T++) {
    		boolean flag=true;
    			String in = br.readLine();
			for(int i=0; i<in.length(); i++) {
				if(in.charAt(i) != in.charAt(in.length()-i-1)) {
					flag = false;
					if(in.charAt(i) == '?' || in.charAt(in.length()-1-i) == '?') {
						flag =true;
					}
				}
				if(!flag)break;
			}
			
			 	if(flag) System.out.println("#"+T+" "+"Exist");
	            else System.out.println("#"+T+" "+"Not exist");
			
			bw.flush();
    		}//test-case
    		
    	}//main func
 	}//class

	 
