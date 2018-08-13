import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		 
	static int map[][] = new int[10][10]; 
	static int dirmap[][] = new int[10][10];
	static int N/*����ũ��*/, K/*�������*/,L/*���� ���⺯ȯ*/;
	
	static int headx=0,heady=0,headdir=0,taildir=0, tailx=0,taily=0; //�Ӹ�ó����ġ, ���� ó����ġ
	static int ans=0; //�����
	
	//�Ӹ����� ,�������� ����
	static int dx[] = {0,-1,0,1};
	static int dy[] = {1,0,-1,0}; //�� , ��, ��, ��
	
	static final int Apple = 10;
	static final int Snake = 11;
	static final int turnLeft =9;
	static final int turnRight = 8;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
			map[headx][heady]= Snake; //���ʱ���ġ
			
		for(int i=0; i<K; i++) { //�����ġ
			StringTokenizer st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken())-1;
			int y = Integer.parseInt(st.nextToken())-1;
			map[x][y] = Apple;
		}
		
		L = Integer.parseInt(br.readLine());
		for(int i=0; i<L; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int cnt = Integer.parseInt(st.nextToken());
			String a = st.nextToken();
			char dir = a.charAt(0);
			int movecount =0;
			switch(dir) {
			case 'D':
				turnR(cnt,dir,movecount);
				break;
			case 'L':
				turnL(cnt,dir,movecount);
				break;
				
			}
			
		}
		
	}
							//cntĭ �̵��� turn(dir)
	private static void turnL(int cnt, char dir, int movecount) { 
		// TODO Auto-generated method stub
		if(movecount ==cnt) {//���Ƚ���� �� ä���
			headdir++;
			if(headdir==4)headdir=0;
			dirmap[headx][heady]=turnLeft;//���� ��ġ�˷��ִ� �迭�� ������ turn������ ǥ��
			return;//�Ӹ�����ٲ��ְ� �Լ�����
		}
		if(dirmap[tailx][taily]==turnLeft) {
			taildir++;
			if(taildir==4)taildir=0;
		}else if(dirmap[tailx][taily]==turnRight) {
			taildir--;
			if(taildir==-1)taildir=3;
		}
		
		
			int nheadx = headx +dx[headdir];
			int nheady = heady +dy[headdir];
			
			int ntailx = tailx+dx[taildir];
			int ntaily = taily+dy[taildir];
			
			//������ġ�� ����ũ��ȿ��ְ�, ���̾ƴҶ�
		if(nheadx>=0 && nheady>=0 && nheadx<N && nheady<N && map[nheadx][nheady] != Snake) {
			//������ġ�� ������ �Ӹ���Ȯ��
			if(map[nheadx][nheady]==Apple) {
				map[nheadx][nheady]=Snake;
				headx=nheadx;
				heady=nheady;
				movecount++;
				ans++; 
				turnL(cnt,dir,movecount);
			}else {
				map[nheadx][nheady]=Snake;
				map[tailx][taily]=0;
				headx=nheadx;
				heady=nheady;
				tailx = ntailx;
				taily = ntaily;
				movecount++;
				ans++;
				turnL(cnt,dir,movecount);
			}
				
		}else {
			ans++;
			System.out.println(ans);
			System.exit(0);
		}
 	}
	 
		
	

							//cntĭ �̵��� turn(dir)
	private static void turnR(int cnt, char dir, int movecount) {
		// TODO Auto-generated method stub
		if(movecount ==cnt) {//���Ƚ���� �� ä���
			headdir--;
			if(headdir==-1)headdir=3;
			dirmap[headx][heady]=turnRight;//���� ��ġ�˷��ִ� �迭�� ������ turn������ ǥ��
			return;//�Ӹ�����ٲ��ְ� �Լ�����
		}
		if(dirmap[tailx][taily]==turnLeft) {
			taildir++;
			if(taildir==4)taildir=0;
		}else if(dirmap[tailx][taily]==turnRight) {
			taildir--;
			if(taildir==-1)taildir=3;
		}
		
		int nheadx = headx +dx[headdir];
		int nheady = heady +dy[headdir];
		
		int ntailx = tailx+dx[taildir];
		int ntaily = taily+dy[taildir];
		//������ġ�� ����ũ��ȿ��ְ�, ���̾ƴҶ�
		if(nheadx>=0 && nheady>=0 && nheadx<N && nheady<N && map[nheadx][nheady] != Snake) {
			//������ġ�� ������ �Ӹ���Ȯ��
			if(map[nheadx][nheady]==Apple) {
				map[nheadx][nheady]=Snake;
				headx=nheadx;
				heady=nheady;
				movecount++;
				ans++;
				turnR(cnt,dir,movecount);
			}else {
				map[nheadx][nheady]=Snake;
				map[tailx][taily]=0;
				headx=nheadx;
				heady=nheady;
				tailx = ntailx;
				taily = ntaily;
				movecount++;
				ans++;
				turnR(cnt,dir,movecount);
			}
				
		}else {
			ans++;
			System.out.println(ans);
			System.exit(0);
		}
		
		
		
	 	}
	
	
}
 
