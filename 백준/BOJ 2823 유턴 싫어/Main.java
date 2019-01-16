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

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	static int r,c;
	static char map[][];
	static int rst[][];
	static boolean visit[][];
	
	
	static int dx[] = {0,0,1,-1}; //우,좌,하,상
	static int dy[] = {1,-1,0,0};
	static Node start;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 st =new StringTokenizer(br.readLine());
	 r= Integer.parseInt(st.nextToken());
	 c = Integer.parseInt(st.nextToken());
	 
	 
	 map = new char[r][c];
	 visit =new boolean[r][c];
	 
	 
	 for(int i=0; i<r; i++) {
		 String a =br.readLine();
		 for(int j=0; j<c; j++) {
			 map[i][j] = a.charAt(j);
			 if(map[i][j] =='.' && start ==null) {
				 start = new Node(i,j);
			 }
		 }
	 }//insert
	 
	 //sol bfs
	 Queue<Node> q = new LinkedList<>();
	 q.add(start);
	 visit[start.x][start.y]=true;
	 boolean flag= false;
	 while(!q.isEmpty() && !flag) {
		int size = q.size();
		
		for(int i=0; i<size; i++) {
		 Node cur = q.poll();
		 
		 int x = cur.x;
		 int y = cur.y;
		 
		 //end option
		 int cnt=0;
		 for(int j=0; j<4; j++) {
			 int nx = x+dx[j];
			 int ny = y+dy[j];
			 if(nx>=0 && ny>=0 && nx<r && ny<c)
			 if(map[nx][ny]=='.')cnt++;
		 }
		 if(cnt<=1)flag=true;
		 
		 for(int j=0; j<4; j++) {
			int nx = x +dx[j];
			int ny = y +dy[j];
			//범위안이고
			if(nx>=0 && ny >=0 && nx<r && ny<c) {
				if(map[nx][ny] =='.' && !visit[nx][ny]) {
					visit[nx][ny]=true;
					q.add(new Node(nx,ny));
				}
			}
			 
		 	}//for loop : dir
		 
		}//for loop : q.size
		
	 }// while loop
	 
	 if(flag)bw.write(String.valueOf(1));
	 else bw.write(String.valueOf(0));
	 bw.flush();
	 
	}//main 
 
}// classg

    class Node{
    	int x,y;
    	public Node(int x, int y) {
			// TODO Auto-generated constructor stub
    		this.x=x;
    		this.y=y;
    		
		}
    }