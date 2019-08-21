import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	static int dp[][];
	static int dx[] = {1,0};
	static int dy[] = {0,1};
	
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Scanner sc = new Scanner(System.in);
        StringTokenizer st;
        
        st =new StringTokenizer(br.readLine());
         int r = Integer.parseInt(st.nextToken());
         int c = Integer.parseInt(st.nextToken());
         
         int map[][] = new int[r][c];
         dp = new int[r][c];
         
         for(int i=0; i<r; i++) {
        	 st =new StringTokenizer(br.readLine());
        	 for (int j=0; j<c; j++) {
        		 map[i][j] = Integer.parseInt(st.nextToken());
        		 dp[i][j]=-1;
        	 }
         }//insert
    
         Queue<Node> q = new LinkedList<>();
         q.add(new Node(0,0));
         dp[0][0]=0;
         
         while(!q.isEmpty()) {
        	 Node cur = q.poll();
        	 
        	 for(int i=0; i<2; i++) {
        		 
        		 for(int j=1; j<=map[cur.x][cur.y]; j++) {
        		 int nx = cur.x +dx[i] * j;
        		 int ny = cur.y +dy[i] * j;
        		 
        		 if(nx >=0 && ny >=0 && nx<r && ny<c) {
        			 if(dp[nx][ny] == -1) {
        				 dp[nx][ny] = dp[cur.x][cur.y]+1;
        				 q.add(new Node(nx,ny));
        			 }
        		 }
        		 
        	 }// for loop j
        		 
         } // for loop i
        	 
       }//while
         
         System.out.println(dp[r-1][c-1]);
      
    }// main

	
 
     

}// class
  
 
class Node{
	int x,y;

	public Node(int x, int y) {
		super();
		this.x = x;
		this.y = y;
	}
	
}