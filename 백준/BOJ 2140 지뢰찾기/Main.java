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
	 
	
	static int n,m;
	static int map[][];
	static boolean visit[][],leg[][];
	
	
	static int dx[] = {0,1,0,-1,1,1,-1,-1}; //우,하,좌,상 
	static int dy[] = {1,0,-1,0,1,-1,1,-1};
 
	static final int bomb =-1;
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 
		n = Integer.parseInt(br.readLine());
		
		map = new int[n][n];
		visit = new boolean[n][n];
		
		if(n<3) {
		bw.write(String.valueOf(0));
		bw.flush();
		return;
		}
		
		for(int i=0; i<n; i++) {
			String a = br.readLine();
			for(int j=0; j<n; j++) {
				map[i][j] = a.charAt(j);
			}
		}//insert
		
		int rst = (int) Math.pow(n-2,2);
		for(int i=1; i<n-1; i++) {
			for(int j=1; j<n-1; j++) {
				boolean flag=false;
				for(int k=0; k<8; k++) {
					int nx = i +dx[k];
					int ny = j +dy[k];
					
					if(map[nx][ny] == '#') continue; // 해당칸이 열어보지않은 칸일 경우 continue
	                if(map[nx][ny] =='0') flag=true;
				}
				if(flag)rst--;
				else {
					for(int k=0; k<8; k++) {
						int nx = i +dx[k];
						int ny = j +dy[k];
						if(map[nx][ny] =='#' || map[nx][ny] == '0')continue;
						map[nx][ny]-=1;
					}
				}
			}
		}
	
		bw.write(String.valueOf(rst));
		bw.flush();
		
 
	}//main
	 
	 
	
}//class
 