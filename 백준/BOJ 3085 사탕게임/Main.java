import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static char map[][];
	//static char tmp[][];
	
	static int n;
	static int startx, starty;
					//��,��,��,��
	static int dx[] = {0,0,1,-1};
	static int dy[] = {1,-1,0,0};
	static int cnt=0,max=0;
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		n = Integer.parseInt(br.readLine());
		
		map = new char[n][n];
//		tmp = new char[n][n];
		
		for(int i=0; i<n ;i++) {
			String a = br.readLine();
			for(int j=0; j<n; j++) {
			 map[i][j]= a.charAt(j);
			}
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				startx=i;starty=j;
				change(i,j,map);
			}
		}
		if(max==0)bw.write(String.valueOf(0));
		else bw.write(String.valueOf(max+1));
		bw.flush();
	}

	private static void change(int x, int y, char[][] map) {
		// TODO Auto-generated method stub
		for(int i=0; i<4; i++) {
			char tmp[][] = new char[n][n];
			for(int j=0; j<n; j++)tmp[j] = Arrays.copyOf(map[j], n);
			
			//������ ����
			int nx = x +dx[i];
			int ny = y +dy[i];
			
			if(inRange(nx,ny)) {
				char temp;
				temp = tmp[x][y];
				tmp[x][y] = tmp[nx][ny];
				tmp[nx][ny]=temp;
				//�����¿� �����ؼ� ��������ִ��� �˾ƺ���
				cnt=0;
				horizondfs(x,y,0,tmp);
				if(cnt>max)max=cnt;
				
				cnt=0;
				verticaldfs(x,y,2,tmp);
				if(cnt>max)max=cnt;
			}
		}
	}

	private static void verticaldfs(int x, int y, int dir, char[][] tmp) {
		// TODO Auto-generated method stub
		if(dir==4)return;
		int nx = x+dx[dir];
		int ny = y+dy[dir];
		
		if(inRange(nx,ny) && tmp[startx][starty] ==tmp[nx][ny]) {
			cnt++;
			verticaldfs(nx,ny,dir,tmp);
		}else {
			verticaldfs(startx,starty,dir+1,tmp);
		}
	}

	private static void horizondfs(int x, int y, int dir, char[][] tmp) {
		// TODO Auto-generated method stub
		if(dir==2)return;
		
		int nx = x+dx[dir];
		int ny = y+dy[dir];
		//�������̰� ������ġ�� ������ġ�� ���ٸ�
		if(inRange(nx,ny) && tmp[startx][starty]==tmp[nx][ny]) {
			cnt++; //���ӵǴ°��� ++; 
			horizondfs(nx,ny,dir,tmp);//������Ž��
		}else {
			horizondfs(startx,starty,dir+1,tmp);//����Ž��
		}
	}

	private static boolean inRange(int nx, int ny) {
		// TODO Auto-generated method stub
		if(nx>=0 && ny>=0 && nx<n && ny<n)return true;
		return false;
	}
}