import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	
	
	static int dx[] = {-1,0,1,0}; //북,동,남,서
	static int dy[] = {0,1,0,-1};
	 
	static int n,l,r;
	static int number[][],map[][];
	
	static int sum,count=0,rst=0;;
	static boolean visitmove[][];
	
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
	 
	st = new StringTokenizer(br.readLine()); 
	n = Integer.parseInt(st.nextToken());
	l = Integer.parseInt(st.nextToken());
	r = Integer.parseInt(st.nextToken());
	
	map = new int[n][n];
	number = new int[n][n];
	visitmove = new boolean[n][n];
	
	for(int i=0; i<n; i++) {
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<n; j++) {
			map[i][j] = Integer.parseInt(st.nextToken());
		}
	}//insert
	
	/*solution*/
	
	int loop=0;
	
	while(loop<2000) {
		boolean flag=false;
		int cnt=0;
		number = new int[n][n];
		visitmove = new boolean[n][n];

	for(int i=0; i<n ; i++) {
		for(int j=0; j<n ; j++) {
			if(number[i][j]==0) {
				cnt++;
				sum=0;
				count=0;
				//국경선 열기
				dfs(i,j,cnt);
				
				//2곳 이상 이동할곳이 있을경우 
				if(count>1) {
					//결과값 +1
					move(i,j,cnt);
					//오늘 국경이동을 했으면 true;
					flag =true;
				}
				
			}
		}
	}
	//오늘하루 이동 했으면 rst++;
	if(flag)rst++;
	loop++;
	}//sol
	
	 bw.write(String.valueOf(rst));
	 bw.flush();
	
	}//main


	private static void move(int x, int y, int cnt) {
		// TODO Auto-generated method stub
		//이전에 탐색했던 곳만 방문하기
		if(number[x][y] != cnt && visitmove[x][y])return;
		//인구이동 방문 했던곳 chk
		visitmove[x][y]=true;
		
		
		//인구이동
		map[x][y] = sum/count;
		
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(nx>=0 && ny >=0 && nx<n && ny<n) {
				if(number[nx][ny]==cnt && !visitmove[nx][ny]) {
					move(nx,ny,cnt);
				}
			}
		}
	}// func move


	private static void dfs(int x, int y, int cnt) {
		// TODO Auto-generated method stub
		if(number[x][y] !=0)return;
		//sum +=현재인구
		sum +=map[x][y];
		// 지역 ++
		count++;
		// numbering 해주기
		number[x][y]=cnt;
		
		//다음칸 이동
		for(int i=0; i<4; i++) {
			int nx= x+dx[i];
			int ny= y+dy[i];
			
			// 범위안
			if(nx>=0 && ny>=0 && nx<n && ny<n) {
				// 인구가 범위안, 아직 방문하지 않은 지역
				int debugL =Math.abs(map[nx][ny]-map[x][y]);
				int debugR= Math.abs(map[nx][ny]-map[x][y]);
				
				if((l<=Math.abs(map[nx][ny]-map[x][y]) && Math.abs(map[nx][ny]-map[x][y]) <=r) && number[nx][ny] ==0) {
					dfs(nx,ny,cnt);
				}
			}
			
		}
	}// func dfs
 
 
	
}//class