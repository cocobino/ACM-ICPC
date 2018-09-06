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
 
	static int r,c;
	static int map[][];
	static boolean firevisit[][];
	static boolean jasonvisit[][];
	
	static int dx[] = {0,1,0,-1};
	static int dy[] = {1,0,-1,0};
	
	static final int WALL =1;
	static final int Fire =2;
	static final int Jason =3;
	
	static int time=0;
	static Queue<Node> jason = new LinkedList<Node>();
	static Queue<Node> fire = new LinkedList<Node>();
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		
		map = new int[r][c];
		firevisit = new boolean[r][c];
		jasonvisit = new boolean[r][c];
		
		for(int i=0; i<r; i++) {
			String a = br.readLine();
			for(int j=0; j<c; j++) {
				switch(a.charAt(j)) {
				case '#':
					map[i][j] = WALL;
					break;
				case 'J':
					map[i][j] = Jason;
					jason.add(new Node(i,j));
					break;
				case 'F':
					map[i][j] = Fire;
					fire.add(new Node(i,j));
					firevisit[i][j]= true;
					break;
				}
			}
		}
		//insert
		boolean exit=false;
		while(!jason.isEmpty()) {
			time ++;
			int size = jason.size();
			for(int i=0; i<size; i++) {
				Node cur = jason.poll();
				int x = cur.x;
				int y = cur.y;
				
				if(map[x][y] == Fire)continue;
				
				for(int j=0; j<4; j++) {
				int nx= x +dx[j];
				int ny =y +dy[j];
				
				if(nx<0 || ny<0 || nx>=r || ny >=c) {
					exit =true;
					break;
				}
				
				if(map[nx][ny] ==0 && !jasonvisit[nx][ny]) {
					jasonvisit[nx][ny] =true;
					jason.add(new Node(nx,ny));
					}
				}
			}
			
			if(exit)break;
			
			int firesize = fire.size();
			for(int i=0; i<firesize; i++) {
				Node curfire = fire.poll();
				int x = curfire.x;
				int y = curfire.y;
				
					for(int j=0; j<4; j++) {
						int nx = x + dx[j];
						int ny = y + dy[j];
						
						if(nx<0 || ny<0 || nx>=r || ny >=c)continue;
						if(map[nx][ny] == 0) {
							map[nx][ny] = Fire;
							fire.add(new Node(nx,ny));
						}
					}
				
			}
		}
		
		if(exit)bw.write(String.valueOf(time));
		else bw.write(String.valueOf("IMPOSSIBLE"));
		bw.flush();
	}

}

class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x =x;
		this.y =y;
	}
}
