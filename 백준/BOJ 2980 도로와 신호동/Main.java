import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		 
	static pole[] p;	
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); 
	 	 
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken()); //신호등개수
		int L = Integer.parseInt(st.nextToken()); //도로거리
		p = new pole[1000];
		for(int i=0; i<1000; i++) p[i]=new pole(0,0);
		int way[] = new int[L];
		int light[] = new int[L];
		for(int i=0; i<N; i++) {
		st = new StringTokenizer(br.readLine());
		int D = Integer.parseInt(st.nextToken())-1;
		int R = Integer.parseInt(st.nextToken());
		int G = Integer.parseInt(st.nextToken());
		//신호등 위치저장
		//p[i].D =D;
		p[D].R =R;
		p[D].G =G;
		light[D]=1; //신호등 표시
		}
		int cnt=0;
		move(0,L,way,light,cnt);
		bw.write(String.valueOf(way[L-1]));
		bw.flush();
		
	}	
							// 시작위치,  도로길이, 시간누적값,    신호등 위치, 시간 ++;
	private static void move(int cur, int L, int[] way, int[] light, int cnt) {
		// TODO Auto-generated method stub
		cnt++;
		if(cur==L)return;
		if(light[cur] ==0 && cur<L) {//신호등이 없고 현재위치가 길을벗어나지않으면 이동
			way[cur]=cnt;  
			move(cur+1, L, way, light,cnt);
		}
		else if(light[cur] !=0 && cur<L) {//신호등이 있고 현재위치가 길을 벗어나지 않으면
			boolean lamp[] = new boolean[p[cur].R + p[cur].G];
			for(int i=0; i<p[cur].R; i++) {
				lamp[i]=true; //빨간불
			}
			if(lamp[cnt%(p[cur].R+p[cur].G)]) {//현재 위치의 신호가 빨간불이라면
				way[cur]=cnt;
				move(cur,L,way,light,cnt); //기다려야함
			}else if(!lamp[cnt%(p[cur].R+p[cur].G)]) {//현재 위치 신호가 초록이라면
				way[cur]=cnt;
				move(cur+1,L,way,light,cnt); //이동
			}
		}
		
	}
	 
}
 
class pole{
	int R,G;
	public pole( int R, int G) {
		// TODO Auto-generated constructor stub
		
		this.R=R;
		this.G=G;
	}
}