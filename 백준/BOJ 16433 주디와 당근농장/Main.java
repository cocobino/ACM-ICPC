import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
 
	static int dx[] = {0,0,-1,1,1,1,-1,-1};
	static int dy[] = {1,-1,0,0,1,-1,-1,1};
	
	static int n,r,c;
	static char map[][];
	static boolean visit[][];
	//static LinkedList<Integer> arr = new LinkedList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		st =new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		r = Integer.parseInt(st.nextToken())-1;
		c = Integer.parseInt(st.nextToken())-1;
		 
		 map = new char[n][n];
		 visit = new boolean[n][n];
		 
		 for(int i=0; i<n; i++)Arrays.fill(map[i], '.');
		  go(r,c);
		  
		  for(int i=0; i<n; i++) {
			  for(int j=0; j<n; j++) {
				  bw.write(String.valueOf(map[i][j]));
			  }
			  bw.newLine();
		  }
		  bw.flush();
		
	}// main
	private static void go(int x, int y) {
		// TODO Auto-generated method stub
		map[x][y]='v';
		visit[x][y] = true;
		
		int nx,ny;
		for(int i=0; i<4; i++) {
			nx = x +dx[i];
			ny = y +dy[i];
			
			if(inrage(nx,ny))visit[nx][ny] = true;
		}
		
		for(int i=0; i<8; i++	) {
			nx = x +dx[i];
			ny = y +dy[i];
			if(inrage(nx,ny)&&!visit[nx][ny])go(nx,ny);
			int nnx = nx+dx[i];
			int nny = ny+dy[i];
			
			if(inrage(nnx,nny)&&!visit[nnx][nny])go(nnx,nny);
			
		}
	}
	private static boolean inrage(int nx, int ny) {
		// TODO Auto-generated method stub
		if(nx>=0 && ny>=0 && nx<n && ny<n)return true;
		else return false;
	}
 
	 

}//class
 