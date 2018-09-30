import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {

	static int n,m;
	static int map[][]= new int[50][50];
	
	static final int BLACK =0;
	static final int WHITE =1;
	
	
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st =new StringTokenizer(br.readLine());
		
		n =Integer.parseInt(st.nextToken());
		m =Integer.parseInt(st.nextToken());
		
		for(int i=0; i<n; i++) {
			String a = br.readLine();
			for(int j=0; j<m; j++) {
				char c = a.charAt(j);
				switch(c) {
				case 'W':
					map[i][j]=WHITE;
					break;
				case 'B':
					map[i][j]=BLACK;
					break;
				}
			}
		}
		
	int wmap[][] ={{1,0,1,0,1,0,1,0},
					{0,1,0,1,0,1,0,1},
					{1,0,1,0,1,0,1,0},
					{0,1,0,1,0,1,0,1},
					{1,0,1,0,1,0,1,0},
					{0,1,0,1,0,1,0,1},
					{1,0,1,0,1,0,1,0},
					{0,1,0,1,0,1,0,1}};
		
	int bmap[][] = {{0,1,0,1,0,1,0,1},
					{1,0,1,0,1,0,1,0},
					{0,1,0,1,0,1,0,1},
					{1,0,1,0,1,0,1,0},
					{0,1,0,1,0,1,0,1},
					{1,0,1,0,1,0,1,0},
					{0,1,0,1,0,1,0,1},
					{1,0,1,0,1,0,1,0}};
	int cnt=0;
	int cnt1=0;
	int min = Integer.MAX_VALUE;
	int min1 = Integer.MAX_VALUE;
	int ans=0;
	for(int i=0; i<n-7; i++) {
		for(int j=0; j<m-7; j++) {
			if(map[i][j]==WHITE) {
				 min = Math.min(min, cnt = wcal(i,j,wmap));
				 min1 = Math.min(min1, cnt1 = bcal(i,j,bmap));
				 ans = Math.min(min1, min);
			}
			
			if(map[i][j]==BLACK) {
				min = Math.min(min, cnt = wcal(i,j,wmap));
				 min1 = Math.min(min1, cnt1 = bcal(i,j,bmap));
				ans = Math.min(min1, min);}
		}
	}

	bw.write(String.valueOf(ans));
	bw.flush();


	
	}



	private static int bcal(int x, int y, int[][] bmap) {
		// TODO Auto-generated method stub
		int cnt=0,wx=0,wy=0;
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				if(map[i][j]!=bmap[wx][wy])cnt++;
				wy++;
			}
			wx++;
			wy=0;
		}
		return cnt;
	}



	private static int wcal(int x, int y, int[][] wmap) {
		// TODO Auto-generated method stub
		int cnt=0,wx=0,wy=0;
		for(int i=x; i<x+8; i++) {
			for(int j=y; j<y+8; j++) {
				if(map[i][j]!=wmap[wx][wy])cnt++;
				wy++;
			}
			wx++;
			wy=0;
		}
		return cnt;
	}
}