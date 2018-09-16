import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int n;
	static int map[][];
	static boolean visit[][];
	static HashSet<String> duple;
	
	static int dx[]= {0,0,-1,1};
	static int dy[]= {1,-1,0,0};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		n= Integer.parseInt(br.readLine());
		
		for(int tc=1; tc<=n; tc++) {
		map = new int[4][4];
		duple = new HashSet<>();
		visit = new boolean[4][4];
		for(int i=0; i<4; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			for(int j=0; j<4; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//insert
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				dfs(i,j,"",0);
			}
		}
		
		bw.write(String.valueOf("#"+tc+" "+duple.size()+"\n"));
		bw.flush();
		}//test_case
		
	 

	}

	private static void dfs(int x, int y, String curString,int depth) {
		// TODO Auto-generated method stub
		if(depth==7) {
			duple.add(curString);
			return;
		}
		
		String plus = Integer.toString(map[x][y]);
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y+ dy[i];
			
			if(nx<0 || ny<0 || nx>=4 || ny>=4)continue;
			dfs(nx,ny,curString+plus,depth+1);
	}
		
	}//dfs
	
	
}//class
 