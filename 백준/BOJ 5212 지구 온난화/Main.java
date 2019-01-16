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
	static boolean visit[][];
	
	
	static int dx[] = {0,0,1,-1}; //우,좌,하,상
	static int dy[] = {1,-1,0,0};
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	 st =new StringTokenizer(br.readLine());
	 r= Integer.parseInt(st.nextToken());
	 c = Integer.parseInt(st.nextToken());
	 
	 map = new char[r][c];
	 visit = new boolean[r][c];
	 
	 for(int i=0; i<r; i++) {
		 String a = br.readLine();
		 for(int j=0; j<c; j++) {
			 map[i][j] = a.charAt(j);
		 }
	 }//insert
	 
	 for(int i=0; i<r; i++) {
		 for(int j=0; j<c; j++) {
			 if(map[i][j] =='X') {
				 int cnt=0;
				 for(int dir=0; dir<4; dir++) {
					 int nx = i +dx[dir];
					 int ny = j +dy[dir];
					 //범위안일때 , 바다
					 if(nx>=0 && ny>=0 && nx<r && ny<c) {
						 if(map[nx][ny]=='.')cnt++;
					 }else {
						 cnt++;
					 }
				 }
				 if(cnt>=3)visit[i][j]=true;
			 }
		 }
	 }
	 for(int i=0; i<r; i++) {
		 for(int j=0; j<c; j++) {
			 if(visit[i][j])map[i][j]='.';
		 }
	 }
	 
	 int x1=r,x2=0,y1=c,y2=0;
	 
	 for(int i=0; i<r; i++) {
		 for(int j=0; j<c; j++) {
			 if(map[i][j]=='X') {
				 x1 = Math.min(x1, i);
				 x2 = Math.max(x2, i);
				 
				 y1 = Math.min(y1, j);
				 y2 = Math.max(y2, j);
			 }
		 }
	 }
	 
	 for(int i=x1; i<=x2; i++) {
		 for(int j=y1; j<=y2; j++) {
			 bw.write(String.valueOf(map[i][j]));
		 }
		 bw.newLine();
	 }
	 
	 bw.flush();
	}//main 
 
}// classg
 