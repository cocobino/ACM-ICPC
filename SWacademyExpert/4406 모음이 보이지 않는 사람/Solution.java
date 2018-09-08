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
    	
    		String in = br.readLine();
    		LinkedList<Character> arr = new LinkedList<>();
    		LinkedList<Character> rst = new LinkedList<>();
    		for(int i=0; i<in.length(); i++) {
    			arr.add(in.charAt(i));
    		}
    		//solve
    		
    		for(int i=0; i<arr.size();i++) {
    			if(arr.get(i) !='a' && arr.get(i)!='e' &&arr.get(i)!='i' &&arr.get(i)!='o' &&arr.get(i)!='u') {
    				rst.add(arr.get(i));
    			}
    		}
    		bw.write(String.valueOf("#"+T+" "));
    		for(int a : rst) {
    			bw.write(String.valueOf((char)a));
    		}
    		bw.write(String.valueOf("\n"));
    		bw.flush();
    		
    		}//test-case
    	}//main func

	
 	}//class

	 
