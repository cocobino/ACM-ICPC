import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;



public class Main {
		static int N;
		static int arr[];
		static int visit[];
		static int start[], cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int test_case = Integer.parseInt(br.readLine());
        for(int T=0; T<test_case; T++) {
        N = Integer.parseInt(br.readLine());
        arr = new int[N+1];
        visit = new int[N+1];
        start = new int[N+1];
        
        cnt=0;
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=1; i<=N; i++) {
        	arr[i]= Integer.parseInt(st.nextToken());
        }
        
        int ans=0;
        for(int i=1; i<=N; i++) {
        if(visit[i] ==0)ans+=dfs(i,1,i);
        }
        
        bw.write(String.valueOf(N-ans+"\n"));
        bw.flush();
        }//test_case
        
    }
    
	private static int dfs(int curNode, int cnt, int start1) {
		// TODO Auto-generated method stub
		if(visit[curNode] !=0) {
			if(start1 != start[curNode])return 0;
			return cnt-visit[curNode];
		}
		visit[curNode] =cnt;
		start[curNode] = start1;
		
		return dfs(arr[curNode], cnt+1, start1);
		}
	
	}
	