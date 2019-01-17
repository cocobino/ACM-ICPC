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
	static int[][] dpice,dpjung,dpocean;
	
	
	static int dx[] = {0,1,0,-1,1,1,-1,-1}; //우,하,좌,상 
	static int dy[] = {1,0,-1,0,1,-1,1,-1};
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 
		 st = new StringTokenizer(br.readLine());
		 r = Integer.parseInt(st.nextToken());
		 c = Integer.parseInt(st.nextToken());
		 
		
		map = new char[r+1][c+1];
		
		dpice = new int[r+1][c+1];
		dpjung = new int[r+1][c+1];
		dpocean = new int[r+1][c+1];
		
		int n = Integer.parseInt(br.readLine());
		
		for(int i=1; i<=r; i++) {
			String a =br.readLine();
			for(int j=0; j<a.length(); j++) {
				map[i][j+1] = a.charAt(j);
			}
		}//insert
		
		
		for(int i=1; i<=r; i++) {
			for(int j=1; j<=c; j++) {
				//ice 인경우 합 누적하기
				if(map[i][j]=='I')
				dpice[i][j] = dpice[i-1][j] +dpice[i][j-1]-dpice[i-1][j-1]+1;
				else dpice[i][j] =  dpice[i-1][j] +dpice[i][j-1]-dpice[i-1][j-1];
				
				
				if(map[i][j]=='J')
					dpjung[i][j] = dpjung[i-1][j] + dpjung[i][j-1] - dpjung[i-1][j-1]+1;
				else dpjung[i][j] = dpjung[i-1][j] + dpjung[i][j-1] - dpjung[i-1][j-1];
				
				if(map[i][j]=='O')
					dpocean[i][j] = dpocean[i-1][j] + dpocean[i][j-1] - dpocean[i-1][j-1]+1;
				else dpocean[i][j] = dpocean[i-1][j] + dpocean[i][j-1] - dpocean[i-1][j-1];
			}
		}
		
		
		
		for(int j=0; j<n; j++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			
			//정글 구하기
			int debuga =dpjung[x2][y2];
			int debugb = dpjung[x2][y1-1];
			int debugc =dpjung[x1-1][x2];
			int debugd =dpjung[x1-1][y1-1];
			
			int rstj = dpjung[x2][y2] -dpjung[x2][y1-1]-dpjung[x1-1][y2] +dpjung[x1-1][y1-1]; 
			//바다
			int rsto = dpocean[x2][y2] - dpocean[x2][y1-1]-dpocean[x1-1][y2]+dpocean[x1-1][y1-1];
			//얼음
			int rsti = dpice[x2][y2] - dpice[x2][y1-1]-dpice[x1-1][y2]+dpice[x1-1][y1-1];
			
			bw.write(String.valueOf(rstj +" "+ rsto +" "+rsti+"\n"));
			bw.flush();
		}
		
 
	}//main
	 
	 
	
}//class
 