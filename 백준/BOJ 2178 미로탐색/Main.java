import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
import java.util.StringTokenizer;


public class Main{
	
	static int arr[][];
	static boolean visit[][];
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	static int r,c;
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	 	
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		r =Integer.parseInt(st.nextToken());
		c =Integer.parseInt(st.nextToken());
		
		arr = new int[r][c];
		visit = new boolean[r][c];
		
		for(int i=0; i<r;i++) {
			String a = br.readLine();
			for(int j=0; j<c; j++) {
				arr[i][j] = a.charAt(j)-'0';
				visit[i][j] =false;
			}
		}
		
		visit[0][0] =true;
		bfs(0,0);
		bw.write(String.valueOf(arr[r-1][c-1]));
		bw.flush();
	}


	private static void bfs(int x, int y) {
		// TODO Auto-generated method stub
		Queue<Node> q = new LinkedList<Node>();
		q.add(new Node(x,y));
		
		while(!q.isEmpty()) {
		Node curNode = q.poll();
		
		for(int i=0; i<4; i++) {
			int nextX = curNode.x+dx[i];
			int nextY = curNode.y+dy[i];
			
			
            if (nextX < 0 || nextY < 0 || nextX >= r || nextY >= c) {
                continue;
            }
           
            if (visit[nextX][nextY] || arr[nextX][nextY] == 0) {
                continue;
            }
            
            q.add(new Node(nextX, nextY));
            
            arr[nextX][nextY] = arr[curNode.x][curNode.y]+1;
            visit[nextX][nextY] = true;
		}
		}
		
		
		
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