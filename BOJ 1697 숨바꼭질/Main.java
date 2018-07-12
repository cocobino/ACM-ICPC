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
	static int N,K;
	static int[] dx={-1,1,0};
	static boolean visit[] = new boolean[100001];
	static int pos,cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        
        visit = new boolean[1000001];
        
        bw.write(String.valueOf(bfs(N)));
        bw.flush();
    }

	private static int bfs(int n) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<Node>();
		visit[n]=true;
		q.add(new Node(n,0));
		
		while(!q.isEmpty()) {
			Node node = q.poll();
			 cnt = node.count;
			 pos = node.value;
		}
		if(pos==K)return cnt;
		
		 for (int i = 0; i < 3; i++) {
	            int next;
	 
	            if (dx[i] != 0) {
	                next = pos + dx[i];
	            } else {
	                next = pos * 2;
	            }
	 
	            if (0 <= next && next <= 100000) {
	                if (!visit[next]) {
	                    q.add(new Node(cnt + 1, next));
	                    visit[next] = true;
	                }
	            }
	 
	        }
	 
	 
	    return -1;
	}
	 
	static class Node{
		int value; int count;
		public Node(int value , int count) {
			// TODO Auto-generated constructor stub
			this.value=value;
			this.count = count;
		}
	}

   }

