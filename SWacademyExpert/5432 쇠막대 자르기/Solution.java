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
    		String in =br.readLine();
    		
    		char list[] = new char[in.length()];
    		for(int i=0; i<list.length; i++) {
    			list[i]=in.charAt(i);
    		}
    		int cur =0;
    		int total =0;
    		
    		for(int i=0; i<in.length(); i++) {
    			if(i+1<in.length() && list[i]=='(' && list[i+1]==')') {
    				total+=cur;
    				i++;
    			}
    			else if(list[i]=='(')cur++;
    			else if(list[i]==')') {
    				cur--;
    				total++;
    			}
    		}
    		
    		bw.write(String.valueOf("#"+T+" "+total+"\n"));
    		bw.flush();
    		
    		}//test-case
    	}//main func

	
 	}//class

	 
