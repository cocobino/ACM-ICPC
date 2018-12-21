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
	
	
	
	static int dx[] = {-1,0,1,0}; //��,��,��,��
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
				//���漱 ����
				dfs(i,j,cnt);
				
				//2�� �̻� �̵��Ұ��� ������� 
				if(count>1) {
					//����� +1
					move(i,j,cnt);
					//���� �����̵��� ������ true;
					flag =true;
				}
				
			}
		}
	}
	//�����Ϸ� �̵� ������ rst++;
	if(flag)rst++;
	loop++;
	}//sol
	
	 bw.write(String.valueOf(rst));
	 bw.flush();
	
	}//main


	private static void move(int x, int y, int cnt) {
		// TODO Auto-generated method stub
		//������ Ž���ߴ� ���� �湮�ϱ�
		if(number[x][y] != cnt && visitmove[x][y])return;
		//�α��̵� �湮 �ߴ��� chk
		visitmove[x][y]=true;
		
		
		//�α��̵�
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
		//sum +=�����α�
		sum +=map[x][y];
		// ���� ++
		count++;
		// numbering ���ֱ�
		number[x][y]=cnt;
		
		//����ĭ �̵�
		for(int i=0; i<4; i++) {
			int nx= x+dx[i];
			int ny= y+dy[i];
			
			// ������
			if(nx>=0 && ny>=0 && nx<n && ny<n) {
				// �α��� ������, ���� �湮���� ���� ����
				int debugL =Math.abs(map[nx][ny]-map[x][y]);
				int debugR= Math.abs(map[nx][ny]-map[x][y]);
				
				if((l<=Math.abs(map[nx][ny]-map[x][y]) && Math.abs(map[nx][ny]-map[x][y]) <=r) && number[nx][ny] ==0) {
					dfs(nx,ny,cnt);
				}
			}
			
		}
	}// func dfs
 
 
	
}//class