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
    		StringTokenizer st= new StringTokenizer(br.readLine());
    		n = Integer.parseInt(st.nextToken()); //전체 과목
    		m = Integer.parseInt(st.nextToken()); // 선택과목
    		
    		map = new int[n+1];
    		visit = new boolean[n+1];
    		
    		st= new StringTokenizer(br.readLine());
    		for(int i=1; i<=n; i++) {
    			map[i] = Integer.parseInt(st.nextToken());
    		}
    		
    		Arrays.sort(map);
    		max=0;
    		int cnt=0;
    		for(int i=map.length-1; i>=0; i--) {
    			cnt++;
    			max+=map[i];
    			if(cnt==m)break;
    		}
    		System.out.println("#"+T+" "+max);
    		
    		}//test-case
    	}//main func

	
 	}//class

	 
