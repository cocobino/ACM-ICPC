import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Solution {

	
	static int r,c,p;

	static int dx[] = { 1, -1, 0, 0 };
	static int dy[] = { 0, 0, 1, -1 };

	static int player[];
	static int[][] map;

	static Queue<Node> q[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;

//		int test_case = Integer.parseInt(br.readLine().trim());

//		for (int T = 1; T <= test_case; T++) {
		 st =new StringTokenizer(br.readLine());
		 r = Integer.parseInt(st.nextToken());
		 c = Integer.parseInt(st.nextToken());
		 p = Integer.parseInt(st.nextToken());
		 
		 player = new int[p+1];
		 map = new int[r][c];
		 q = new LinkedList[p+1];
		 for(int i=1; i<=p; i++)q[i] = new LinkedList<>();
		 
		 st =new StringTokenizer(br.readLine());
		 for(int i=1; i<=p; i++)player[i] = Integer.parseInt(st.nextToken());
		 
		 for(int i=0; i<r; i++) {
			 String a =br.readLine();
			 for(int j=0; j<a.length(); j++) {
				 char tmp = a.charAt(j);
				 if(tmp>='1' && tmp<='9') {
				 map[i][j] = tmp-'0';
				 q[map[i][j]].add(new Node(i,j));
				 }
				 else if(tmp =='#')map[i][j]=-1;
				 if(map[i][j]=='.') {
					 map[i][j]=0;
				 }
			 }
		 }//insert
		 
		 //sol
		 	
		 boolean flag=false;
		 while(!flag){
			 //플레이어 큐가 비면 종료시켜줌
			 int cnt=0;
			 for(int i=1; i<=p; i++) {
				if(q[i].size() ==0)cnt++;
			 }
			 if(cnt==p) {
				 flag=true;
				 break;
			 }
			 
			 for(int i=1; i<=p; i++) {
				 for(int play=0; play<player[i]; play++ ) {
				 	int qsize = q[i].size();
				 if(qsize==0)break;
				 
				 while(qsize-->0) {
					 Node cur = q[i].poll();
					 
					 for(int dir=0; dir<4; dir++) {
						 int nx = cur.x + dx[dir];
						 int ny = cur.y + dy[dir];
						 if(nx>=0 && ny>=0 && nx<r && ny<c && map[nx][ny]==0) {
							 map[nx][ny]=i;
							 q[i].add(new Node(nx,ny));
						 }
						 
					 }
				 }
				 }
				 	
			 }
			 
			 
		 }//while loop
		 
		 //print
		 int rst[] = new int[p+1];
		 for(int i=0; i<r; i++) {
			 for(int j=0; j<c; j++) {
				 if(map[i][j]>=1 && map[i][j]<=9)
				 rst[map[i][j]]++;
			 }
		 }
		 
		 for(int i=1; i<=p; i++) {
			 System.out.print(rst[i]+" ");
		 }
		 
//		} // test_case

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