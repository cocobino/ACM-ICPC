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
	
	static int dx[] = {0};
	static int dy[] = {1};
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 st =new StringTokenizer(br.readLine());
	 r= Integer.parseInt(st.nextToken());
	 c = Integer.parseInt(st.nextToken());
	 
	 map = new char[r][c];
	 rst = new int[r][c];
	 for(int i=0; i<r; i++)Arrays.fill(rst[i], -1);
	 
	 for(int i=0; i<r; i++) {
		 String a = br.readLine();		 
		 for(int j=0; j<c ;j++) {
			 map[i][j] = a.charAt(j);
			 
			 
		 }
	 }//insert
	 
	 for(int i=0; i<r; i++) {
	
		 for(int j=0; j<c ;j++) {
			 if(map[i][j] =='c') {
				 dfs(i,j,0);
			 } 
		 }
	 }
	 
	 
	 for(int i=0; i<r; i++) {
		 for(int j=0; j<c; j++) {
			 bw.write(String.valueOf(rst[i][j]+" "));
		 }
		 bw.newLine();
	 }
	 bw.flush();
 
	}//main

	private static void dfs(int x, int y, int depth) {
		// TODO Auto-generated method stub
		rst[x][y] = depth;
		
		int nx = x + dx[0];
		int ny = y +dy[0];
		
		if(nx>=0 && ny>=0 && nx<r && ny<c) {
			if(map[nx][ny] =='.') {
				dfs(nx,ny,depth+1);
			}
		}
	}
 
 
}// classg

    