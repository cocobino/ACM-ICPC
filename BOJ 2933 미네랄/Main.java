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
	static int dx[] = {0,0,-1,1}; //�����ϳ�
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
		  
		 //���� ������ �з�
		  
		 for(int i=0; i<n; i++) {
			 int bx =-1,by=-1; 
			 int h = r-arrow[i]; //������ ����
			 visit = new boolean[r][c];
			 if(i%2 ==0) { //¦������ ���ʿ��� ����

			for(int j=0; j<c; j++) {
				if(map[h][j]==x) {// �����µ� �̳׶��̳�����
					bx =h; by=j;
					map[h][j]=blank; // �̳׶��� ����
					break;
				}
			}
				 
			 }else { // Ȧ������ �����ʿ��� ����
				for(int j=c-1; j>=0; j--) {
					if(map[h][j]==x) { //�����µ� �̳׶��̳�����
						bx = h; by = j;
						map[h][j]=blank;
						break;
					}
				}
			 }
			 
			 if(bx == -1 && by == -1)continue; //������ �ʾ����� ����â�� ����
			 
			 //â�� ���� �����¿�� Ž�������� move ����Ʈ�� ���
			 //����� �̳׶��� �ٴڿ� ���������� ����Ʈ�� ���� ���������� !
			 for(int k=0; k<4; k++) {
				 int nx = bx+dx[k];
				 int ny = by+dy[k];
				 //����ĭ�� �����ȿ� �ְ� �̳׶��ϰ��
				 if(nx>=0 && ny>=0 && nx<r && ny<c && map[nx][ny] == 1	) {
					 if(!visit[nx][ny]) {
						 flag = false; // ���� ����Ǿ������� true����
					 DFS(nx,ny); //Ž���� �ߴµ� �ٴڰ� ����Ǿ����� ������ 
					 }
					 if(!flag) { //���� ������ ������
						 //move�� ����ִ� ��� ���� ��������
						 boolean loop= true;
						 while(loop	) {//��ĭ ������ �ִ��� �˻�  loop�� false �� �Ǹ� ����������
							 //���������� ��带 ĭ�� ���� ��ĭ�������
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
							 
							 if(loop) {//loop�� true ���  ��ĭ�����������Ƿ�
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
						 continue; //��������Ǿ� ������ ����â�� ����
					 }
					 
				 }
				 
			 }
			 
			 
		 }//â�� ������ Ƚ��
		  
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
		if(visit[x][y])return; //�湮�ߴٸ� return;
		if(x==r-1) {//���� �̳׶��� �ٴ��̶� ����Ǿ��ִٸ�
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