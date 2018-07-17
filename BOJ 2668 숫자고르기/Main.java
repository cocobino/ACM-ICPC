import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;




public class Main {
		static int n,k;
		static int arr[];
		static boolean visit[];
		static int cnt=0,start;
		
		//static int dx[]= {0,0,-1,1};
		//static int dy[]= {1,-1,0,0};
		static ArrayList<Integer> rst;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        arr = new int[n+1];
        visit = new boolean[n+1];
        rst = new ArrayList<Integer>();
        
        for(int i=1; i<=n; i++) {
        	arr[i] = Integer.parseInt(br.readLine());
        } // ÀÔ·ÂºÎ
        
        for(int i=1; i<=n; i++) {
        	visit[i]=true;
        	start =i;
        	dfs(i);
        	visit[i]=false;
        }
        
        
        Collections.sort(rst);
        bw.write(String.valueOf(rst.size()+"\n"));
        for(int ans : rst) {
        	bw.write(String.valueOf(ans)+"\n");
        }
            bw.flush();    
	}
		private static void dfs(int curNode) {
			// TODO Auto-generated method stub
			if(!visit[arr[curNode]]) {
				visit[arr[curNode]]=true;
				dfs(arr[curNode]);
				visit[arr[curNode]]=false;
			}
			if(arr[curNode] ==start) {
				rst.add(start);
			}
			
			
		}
	}
	

