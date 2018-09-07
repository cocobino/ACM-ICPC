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
 
 
public class Solution {
		
	static int n,m;
	static int map[][];
	static boolean visit[][];
	static final int black = 1;
	static final int white = 2;
	
	static int dx[] = {0,1,0,-1, 1,1,-1,-1};
	static int dy[] = {1,0,-1,0,-1,1, 1,-1};
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test_case = Integer.parseInt(br.readLine());

    	for(int T=1; T<=test_case; T++) {
    		
    		StringTokenizer st = new StringTokenizer(br.readLine());
    		n = Integer.parseInt(st.nextToken());
    		m = Integer.parseInt(st.nextToken());
    		//visit = new boolean[n+1][n+1];
    		map = new int[n+1][n+1];
    		//�ʱ� ��� ��ġ 4,6,8
    		int mid = n/2;
    		init(mid,mid,2,0);
    		
    		
    		
    		for(int i=0; i<m ;i++) {
    			 st = new StringTokenizer(br.readLine());
    			 int x = Integer.parseInt(st.nextToken());
    			 int y = Integer.parseInt(st.nextToken());
    			 int color = Integer.parseInt(st.nextToken());
    			 
    			 map[x][y]=color;
    			 search(x,y,color);
    		}
    		int wrst=0;
    		int brst=0;
    		//rst
    		for(int i=1; i<=n; i++) {
    			for(int j=1; j<=n; j++) {
    				if(map[i][j]==white)wrst++;
    				else if(map[i][j]==black)brst++;
    			}
    		}
    		bw.write(String.valueOf("#"+T+" "+brst+" "+wrst+"\n"));
    		bw.flush();
    	}//test-case
    		
    	}//main func

	private static void search(int x, int y, int color) {
		// TODO Auto-generated method stub
		for(int i=0; i<8; i++) {
			visit = new boolean[n+1][n+1];
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(nx>=1 && ny>=1 && nx<=n && ny<=n) {
				if(map[nx][ny] !=0 && map[nx][ny] != color) {
					//���� �а� �ֺ� 8���� Ž���� ���� �ٸ����������� �׹��� Ž��
				
					othercolor(nx,ny,i,map[nx][ny]);
				}
			}
			
		}
	}
	private static void othercolor(int x, int y, int dir, int color) {
		// TODO Auto-generated method stub
		//������ Ž�����Ŀ� �ٽ�  ó���x�� x,y��  �������̳����� Ž���� ������ ������
		visit[x][y]=true;
		
		int nx = x+dx[dir];
		int ny = y+dy[dir];
		
		if(nx>=1 && ny>=1 && nx<=n && ny<=n) {
			//1) �������� ��ӵ� ���
			if(map[nx][ny] ==color) {
				othercolor(nx,ny,dir,color);
			}
			//2) �ٸ����� ������� 
			else if(map[nx][ny] != 0 && map[nx][ny] !=color) {
				change(visit);
			}
			//3) ��ĭ�� ���
			else {
				visit = new boolean[n+1][n+1];
				return;
			}
			
		}
		
	}

	private static void change(boolean[][] visit) {
		// TODO Auto-generated method stub
		for(int i=1; i<=n ;i++) {
			for(int j=1; j<=n; j++) {
				if(visit[i][j]) {
					if(map[i][j] == white)map[i][j]=black;
					else map[i][j] = white;
				}
			}
		}
		visit = new boolean[n+1][n+1];
	}

	private static void init(int x, int y, int color, int dir) {
		// TODO Auto-generated method stub
		if(map[x][y] !=0)return;
		map[x][y] = color;
		if(color ==white) {
			color-=1;
		}
		else if(color ==black) {
			color+=1;
		}
		int nx = x+dx[dir];
		int ny = y+dy[dir];
		
		init(nx,ny,color,dir+1);
	}
 
	}//class

	 
