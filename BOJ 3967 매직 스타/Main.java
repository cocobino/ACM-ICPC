import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	 
	static int r,c,k; 
	static int map[][] = new int [5][9];
	
	 
	static int dx[][] = {{1,1,1,1},{1,2,3,4},{4,3,2,1},{0,1,2,3},{3,3,3,3},{3,2,1,0}};
	static int dy[][] = {{1,3,5,7},{1,2,3,4},{4,5,6,7},{4,3,2,1},{1,3,5,7},{7,6,5,4}};
	
	static LinkedList<Node> rst = new LinkedList<Node>();
	static boolean alpha[] = new boolean[12];
	
	static final int blank = -1;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<5; i++) {
			String a = br.readLine();
			for(int j=0; j<9; j++) {
				if(a.charAt(j)=='x') {
					map[i][j]=0;
					rst.add(new Node(i,j));
				}
				else if(a.charAt(j)=='.')map[i][j]=blank;
				else {
					map[i][j] = a.charAt(j)-'A'+1;
					alpha[map[i][j]-1]= true;
				}
			}
		}//insert
		
		dfs(0,rst.size());
		
		
		
		
	}
	private static void dfs(int k, int goal) {
		// TODO Auto-generated method stub
		if(k==goal) {
			for(int i=0; i<6; i++) {
				int sum =0;
			for(int j=0; j<4; j++) {
				int nx = dx[i][j];
				int ny = dy[i][j];
				sum += map[nx][ny];
				}
			if(sum != 26) {
				return;
			}
		}
			for(int i=0; i<5; i++) {
				for(int j=0; j<9; j++) {
					if(map[i][j]==blank)System.out.print(".");
					else System.out.print((char)(map[i][j]+'A'-1));
				}
				System.out.println();
			}
			System.exit(0);
		}
		
		for(int i=0; i<12; i++) {
			if(!alpha[i]) {
				alpha[i]=true;
				map[rst.get(k).x][rst.get(k).y] = i+1;
				dfs(k+1,goal);
				alpha[i]=false;
			}
		}
		
	}//dfs
	
}

class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
}