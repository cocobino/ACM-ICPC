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
	 
	static int map[][];
	static int tmp[][];
	static int dx[] = {0,0,-1,1}; //동서북남
	static int dy[] = {1,-1,0,0};

	static boolean visit[][];
	static boolean flag = false;
	static int r,c;
	
	static final int x = 1;
	static final int blank = 0;
	static LinkedList<Node> move = new LinkedList<Node>();
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		 r = Integer.parseInt(st.nextToken());
		 c = Integer.parseInt(st.nextToken());
		 map = new int[r][c];
		 
		 for(int i=0; i<r; i++) {
			 String a =br.readLine();
			 for(int j=0; j<c; j++) {
				 switch(a.charAt(j)) {
				 case '.':
					 map[i][j] = blank;
					 break;
				 case 'x':
					 map[i][j] = x;
					 break;
				 }
			 }
		 }
		 int n = Integer.parseInt(br.readLine());
		  st = new StringTokenizer(br.readLine());
		  int arrow[] = new int[n];
		  for(int i=0; i<n; i++)arrow[i] = Integer.parseInt(st.nextToken());
		 //insert
		  
		 //왼쪽 오른쪽 분류
		  
		 for(int i=0; i<n; i++) {
			 int bx =-1,by=-1; 
			 int h = r-arrow[i]; //던지는 높이
			 visit = new boolean[r][c];
			 if(i%2 ==0) { //짝수턴은 왼쪽에서 던짐

			for(int j=0; j<c; j++) {
				if(map[h][j]==x) {// 던졌는데 미네랄이나오면
					bx =h; by=j;
					map[h][j]=blank; // 미네랄을 깨줌
					break;
				}
			}
				 
			 }else { // 홀수턴은 오른쪽에서 던짐
				for(int j=c-1; j>=0; j--) {
					if(map[h][j]==x) { //던졌는데 미네랄이나오면
						bx = h; by = j;
						map[h][j]=blank;
						break;
					}
				}
			 }
			 
			 if(bx == -1 && by == -1)continue; //깨지지 않았으면 다음창을 더짐
			 
			 //창이 깨진 상하좌우로 탐색을한후 move 리스트에 담기
			 //연결된 미네랄이 바닥에 닿지않으면 리스트에 담긴걸 움직여야함 !
			 for(int k=0; k<4; k++) {
				 int nx = bx+dx[k];
				 int ny = by+dy[k];
				 //다음칸이 범위안에 있고 미네랄일경우
				 if(nx>=0 && ny>=0 && nx<r && ny<c && map[nx][ny] == 1	) {
					 if(!visit[nx][ny]) {
						 flag = false; // 땅과 연결되어있으면 true가됨
					 DFS(nx,ny); //탐색을 했는데 바닥과 연결되어있지 않으면 
					 }
					 if(!flag) { //연결 되있지 않으면
						 //move에 담겨있는 노드 전부 내려야함
						 boolean loop= true;
						 while(loop	) {//한칸 내릴수 있는지 검사  loop가 false 가 되면 내릴수없음
							 //움직여야할 노드를 칸을 전부 빈칸만들어줌
							 for(int v=0; v<move.size(); v++) {
								 map[move.get(v).x][move.get(v).y] = blank;
							 }
							 for(int v=0; v<move.size(); v++) {
								 int curNode_x =move.get(v).x;
								 int curNode_y =move.get(v).y;
								 
								 curNode_x +=1;
								 if(curNode_x == r || map[curNode_x][curNode_y]==1	) {
									 loop=false;
									 break;
								 }
							 }
							 
							 if(loop) {//loop가 true 라면  한칸내릴수있으므로
								 for(int v=0; v<move.size(); v++) {
									 move.get(v).x +=1;
									 map[move.get(v).x][move.get(v).y] = 1;
								 }
							 }else {
								 for(int v=0; v<move.size(); v++)
								 map[move.get(v).x][move.get(v).y] = 1;
							 }
							 
						 }
						 
						 
					 }else {
						 continue; //땅과연결되어 있으면 다음창을 던짐
					 }
					 
				 }
				 
			 }
			 
			 
		 }//창을 던지는 횟수
		  
		 for(int i=0; i<r; i++) {
			 for(int j=0; j<c; j++) {
				 switch(map[i][j]) {
				 case x:
					 bw.write(String.valueOf("x"));
					 break;
				 case blank:
					 bw.write(String.valueOf("."));
					 break;
				 }
			 }
			 bw.write(String.valueOf("\n"));
		 }
		  bw.flush();
	}

	private static void DFS(int x, int y) {
		// TODO Auto-generated method stub
		if(visit[x][y])return; //방문했다면 return;
		if(x==r-1) {//만약 미네랄이 바닥이랑 연결되어있다면
			move = new LinkedList<Node>();
			flag = true;
			return;
		}
		visit[x][y]= true;
		move.add(new Node(x,y));
		
		for(int i=0; i<4; i++) {
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(nx>=0 && ny>=0 && nx<r && ny<c ) {
				if(!visit[nx][ny] && map[nx][ny] ==1) {
					DFS(nx,ny);
				}
			}
		}
		
		
	}
}


class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x=x;
		this.y=y;
	}
}