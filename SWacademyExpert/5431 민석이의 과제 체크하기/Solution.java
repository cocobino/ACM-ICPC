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
    		
    		StringTokenizer st =new StringTokenizer(br.readLine());
    		int n = Integer.parseInt(st.nextToken()); //수강생
    		int k = Integer.parseInt(st.nextToken()); // 과제제출
    		boolean a[] = new boolean[n+1];
    		st =new StringTokenizer(br.readLine());
    		
    		for(int i=1; i<=k; i++) {
    		int r = Integer.parseInt(st.nextToken());
    		a[r] = true;
    		}
    		System.out.print("#"+(T+1)+" ");
    		for(int i=1; i<=n; i++) {
    			if(!a[i]) {
    				
    				System.out.print(i+" ");
    			}
    		}
    		System.out.println();
    		
    	}//test-case
    		
    	}//main func

	}//class

	 
