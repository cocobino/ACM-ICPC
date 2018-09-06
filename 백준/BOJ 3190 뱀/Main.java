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
	static int N/*보드크기*/, K/*사과개수*/,L/*뱀의 방향변환*/;
	
	static int headx=0,heady=0,headdir=0,taildir=0, tailx=0,taily=0; //머리처음위치, 꼬리 처음위치
	static int ans=0; //뱀길이
	
	//머리방향 ,꼬리방향 생각
	static int dx[] = {0,-1,0,1};
	static int dy[] = {1,0,-1,0}; //오 , 위, 좌, 하
	
	static final int Apple = 10;
	static final int Snake = 11;
	static final int turnLeft =9;
	static final int turnRight = 8;
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		N = Integer.parseInt(br.readLine());
		K = Integer.parseInt(br.readLine());
			map[headx][heady]= Snake; //뱀초기위치
			
		for(int i=0; i<K; i++) { //사과위치
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
							//cnt칸 이동후 turn(dir)
	private static void turnL(int cnt, char dir, int movecount) { 
		// TODO Auto-generated method stub
		if(movecount ==cnt) {//명령횟수를 다 채우면
			headdir++;
			if(headdir==4)headdir=0;
			dirmap[headx][heady]=turnLeft;//방향 위치알려주는 배열에 꼬리가 turn할지점 표시
			return;//머리방향바꿔주고 함수종료
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
			
			//다음위치가 보드크기안에있고, 뱀이아닐때
		if(nheadx>=0 && nheady>=0 && nheadx<N && nheady<N && map[nheadx][nheady] != Snake) {
			//다음위치가 사과라면 머리만확장
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
	 
		
	

							//cnt칸 이동후 turn(dir)
	private static void turnR(int cnt, char dir, int movecount) {
		// TODO Auto-generated method stub
		if(movecount ==cnt) {//명령횟수를 다 채우면
			headdir--;
			if(headdir==-1)headdir=3;
			dirmap[headx][heady]=turnRight;//방향 위치알려주는 배열에 꼬리가 turn할지점 표시
			return;//머리방향바꿔주고 함수종료
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
		//다음위치가 보드크기안에있고, 뱀이아닐때
		if(nheadx>=0 && nheady>=0 && nheadx<N && nheady<N && map[nheadx][nheady] != Snake) {
			//다음위치가 사과라면 머리만확장
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
 
