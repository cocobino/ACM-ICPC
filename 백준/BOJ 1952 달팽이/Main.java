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
import java.util.StringTokenizer;

public class Main {
	
	 static int R,C;
	 static int map[][]= new int[101][101];
	 static int dx[] = {-1,1,0,0}; //아 왼 위 오
	 static int dy[] = {0,0,-1,1};
	 static int cnt=0, dir=0;
	 
	 static final int move =1;
	 static final int turn =2;
	 
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
 
		StringTokenizer st= new StringTokenizer(br.readLine());
		R = Integer.parseInt(st.nextToken());
		C = Integer.parseInt(st.nextToken());
		
		int x=0,y=0;
		int d=3;
		int ans=0;
		while(true) {
			if(map[x][y] ==1)break;
			map[x][y] =1;
			
			int nx = x+dx[d];
			int ny = y +dy[d];
			
			if(nx<0 || ny<0 || nx>=R || ny >=C || map[nx][ny] !=0) {
				d = dir(d);
				nx = x+dx[d];
				ny = y+dy[d];
				ans++;
			}
			
			x =nx;
			y =ny;
			
			
		}
		
		
		bw.write(String.valueOf(ans-1));
		bw.flush();
		
		
	
	}


	private static int dir(int d) {
		// TODO Auto-generated method stub
		if(d ==3 || d==2)return (d+2)%4; //ex 3이면 1이 되어야한다.
		else return 3-d;
	}
	}