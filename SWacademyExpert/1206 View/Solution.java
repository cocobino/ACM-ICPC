import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int T,t;
    
    public static void main(String args[]) throws IOException {
    	//T = Integer.parseInt(br.readLine());
    	
    	for(int tc=1; tc<=10; tc++)solution(tc); 
    }//main

    //declare
    static int n;
    static int map[];
    static int building[][];
    
    static int dx[] = {0,0};
    static int dy[] = {-1,1};
    
	private static void solution(int tc) throws IOException {
	  
	  n = Integer.parseInt(br.readLine());
	  map = new int[n];
	  
	  int max=0;
	  StringTokenizer st = new StringTokenizer(br.readLine());
	 for(int i=0; i<n; i++) {
		map[i] = Integer.parseInt(st.nextToken());
		if(max<map[i])max=map[i];
	 }// insert
	 building = new int[max][n];
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<map[i]; j++) {
			 building[j][i] = 1;
		 }
	 }
	 
	 int rst=0;
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<max; j++) {
			 if(building[j][i]==1 && search(j,i))rst++;
		 }
	 }
		
	 bw.write(String.valueOf("#"+tc+" "+rst+"\n"));
	 bw.flush();
	 	}//solution
	private static boolean search(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=0; i<2; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			int nnx = nx+dx[i];
			int nny = ny+dy[i];
				
			if(nx<0 || ny<0 || nx>=255 || ny>=n)return false;
			if(building[nx][ny] !=0 || building[nnx][nny] !=0)return false;
		}
		return true;
	}

  
	
	}//class
  
 