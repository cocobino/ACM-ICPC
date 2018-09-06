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
		
		static int n,max,min;
		static int list[];
		static int cal[] = new int[4];
		
		 
		
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	 
    	int test_case = Integer.parseInt(br.readLine());
    	
    	for(int T=0; T<test_case; T++) {
    	 
    		n = Integer.parseInt(br.readLine());
    		//연산자개수  + - * / 순서로 입력
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		for(int i=0; i<4; i++) {
    			cal[i] = Integer.parseInt(st.nextToken());
    		}
    		//숫자 입력
    		list = new int[n];
    		st = new StringTokenizer(br.readLine());
    		for(int i=0; i<n; i++) {
    			list[i] = Integer.parseInt(st.nextToken());
    		}
    		//insert
    		max = Integer.MIN_VALUE;
    		min = Integer.MAX_VALUE;
    		//solve
    		dfs(1,list[0]);
    		
    		bw.write(String.valueOf("#"+(T+1)+" "+(max-min)+"\n"));
    		bw.flush();
    	}//test_case
    	
    	
	}// main



	private static void dfs(int cur, int num) {
		// TODO Auto-generated method stub
		if(cur==n) {
			max = Math.max(max, num);
			min = Math.min(min, num);
		}
		else {
			if(cal[0] !=0) {
				cal[0]--;
				dfs(cur+1,num+list[cur]);
				cal[0]++;
			}
			if(cal[1] !=0) {
				cal[1]--;
				dfs(cur+1, num-list[cur]);
				cal[1]++;
			}
			if(cal[2] !=0) {
				cal[2]--;
				dfs(cur+1,num*list[cur]);
				cal[2]++;
			}
			if(cal[3] !=0) {
				cal[3]--;
				dfs(cur+1,num/list[cur]);
				cal[3]++;
			}
		}
		
	}



	 
}