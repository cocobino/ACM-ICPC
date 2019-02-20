import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static char map[][];
	static int n;
	
					//우,우하,하,하좌
	static int dx[] = {0,1,1,1 , 0,-1,-1,-1};
	static int dy[] = {1,1,0,-1,-1,-1, 0, 1};
								//좌,좌상,상,상우
	static boolean flag =false;
	static int stx,sty;
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 
		map = new char[10][10];
		
		 for(int i=0; i<10; i++) {
			 String input = br.readLine();
			 for(int j=0; j<input.length(); j++) {
				 stx=i;sty=j;
				 map[i][j] = input.charAt(j);
			 }
		 }///insert
		 
		 //sol
		 // x 가 1번둬서 이길수 있는지 ??
		 
		 for(int i=0; i<10 &&!flag; i++) { 
			 for(int j=0; j<10 && !flag; j++) {
				 //4방향으로 탐색하기
				 for(int k=0; k<4; k++) {
					 if(map[i][j]=='X') {
						 stx=i; sty=j;
						 count(i,j,k,0,false);
					 }
				 }
			 }
		 }
		 
		 if(flag)bw.write(String.valueOf(1));
		 else bw.write(String.valueOf(0));
		 bw.flush();
		 
		}//main


	private static void count(int x, int y, int dir, int depth, boolean blank) {
		// TODO Auto-generated method stub
		//연속된 4개인경우
		if(depth==3 && !blank) {
			int nx = x +dx[dir];
			int ny = y +dy[dir];
			
			int sx = stx+dx[dir+4];
			int sy = sty+dy[dir+4];
			//연속된 4개일경우 -> 마지막과 시작전이 빈칸일경우 가능
			if(inrage(nx,ny) && map[nx][ny]=='.') {
				flag=true;
				return;
			}
			else if(inrage(sx,sy) && map[sx][sy]=='.') {
				flag=true;
				return;
			}
		}
		//빈칸이 1개인경우
		if(depth ==3 && blank) {
			flag=true;
			return;
		}
		
		
		
		int nx = x +dx[dir];
		int ny = y +dy[dir];
		
		//범위 안
		if(inrage(nx,ny)) {
			//1. 다음칸이 벽돌인경우
			if(map[nx][ny]=='X') {
				count(nx,ny,dir,depth+1,blank);
			}
			//2. 다음칸이 빈칸이고 그전까지 빈칸을 만나지 않은경우
			if(map[nx][ny]=='.' && !blank) {
				int nnx = nx+dx[dir];
				int nny = ny+dy[dir];
				
				if(inrage(nnx,nny) && map[nnx][nny]=='X') {
					count(nnx,nny,dir,depth+1,true);
				}
			}
		}//다음칸이 벽돌인경우
		
		 
		
	}//func : count
 

	private static boolean inrage(int nx, int ny) {
		// TODO Auto-generated method stub
		if(nx>=0 && ny>=0 && nx<10 && ny<10)return true;
		else return false;
	}//func : count
  
}//class
		
