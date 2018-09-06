import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
 
	static int r,c,k;
	
	static int map[][];
	static int visit[][][];
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	static int movecnt, min=20000;
	static Node start,end;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		StringTokenizer st= new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		map = new int[r][c];
		visit= new int[r][c][k];
		
		
		for(int i=0; i<r; i++){
			String a  = br.readLine();
			for(int j=0; j<c; j++) {
				switch(a.charAt(j)) {
				case '0':
					map[i][j] = 0;
					break;
				case '1':
					map[i][j] = 1;
					break;
				}
			}
		}//insert
		 
		start = new Node(0,0,0);
		end = new Node(r-1,c-1,k);
		
		Queue<Node> q = new LinkedList<Node>();
		q.add(start);
		visit= new int[r][c][k];
		visit[0][0][0]=1;
		
		while(!q.isEmpty()) {
			Node cur = q.poll();
			for(int i=0; i<4; i++) {
				int nx = cur.x +dx[i];
				int ny = cur.y +dy[i];
				
				int nbroke = cur.broke + map[nx][ny];
				int nd = visit[cur.x][cur.y][cur.broke]+1;
				
				
				if(nx<0 || ny<0 || nx>=r || ny>=c)continue;
				if(nbroke<=k && visit[nx][ny][nbroke]>nd) {
					visit[nx][ny][nbroke] = nd;
					q.add(new Node(nx,ny,nbroke));
				}
			}
		}
		
		int ans = 10000;
		for(int i=0; i<=k; i++)ans = Math.min(min, visit[r-1][c-1][i]);
		if(ans == 10000)ans= -1;
		
		bw.write(String.valueOf(ans));
		bw.flush();
	}

}

class Node{
	int x,y,broke;
	public Node(int x, int y, int broke) {
		// TODO Auto-generated constructor stub
		this.x =x;
		this.y =y;
		this.broke = broke;
	}
}
