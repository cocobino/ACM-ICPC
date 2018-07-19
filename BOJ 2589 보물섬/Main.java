import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;




public class Main {
		static char arr[][]; 
		static int n,m;
		static boolean visit[][];
		static int dx[] = {0,0,-1,1};
		static int dy[] = {1,-1,0,0};
		static int rst[][];
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());
        
        arr = new char[n][m];
        visit = new boolean[n][m];
        rst = new int[n][m];
        
       for(int i=0; i<n; i++) {
    	   String a = br.readLine();
    	   for(int j=0; j<m; j++) {
    		   arr[i][j] = a.charAt(j);
    	   }
       }
       
       for(int i=0; i<n; i++) {
    	   for(int j=0; j<m; j++) {
    		   if(arr[i][j]=='L')rst[i][j]=1;
    		   else rst[i][j]=0;
    	   }
       }
     int rst1 =0;
       for(int i=0; i<n; i++) {
    	   for(int j=0; j<m; j++) {
    		   if(rst[i][j]==0)continue; 
    			   rst1 = Math.max(rst1, bfs(i,j));
    		   
    	   }
       }
     bw.write(String.valueOf(rst1));
     bw.flush();
	}
	private static int bfs(int x, int y) {
		// TODO Auto-generated method stub
		int st=-1;
		
		visit = new boolean[n][m];
		 
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(x,y));
		visit[x][y]=true;
		
		while(!q.isEmpty()) {
			st++;
			int qsize = q.size();
			for(int i=0; i<qsize; i++) {
				Node curNode = q.poll();
				
				for(int j=0; j<4; i++) {
					int nextX = curNode.x + dx[j];
					int nextY = curNode.y + dy[j];
					
					if(nextX <0 ||nextY <0 || nextX >=n || nextY >=m)continue;
					if(visit[nextX][nextY] || rst[nextX][nextY]==0)continue;
					
					q.add(new Node(nextX, nextY));
					visit[nextX][nextY]=true;
				}
			}
		}
		return st;
	}


	


}

class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}