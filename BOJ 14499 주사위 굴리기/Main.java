import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
		static StringBuilder sb;
		static int n,m,dicex,dicey,command;
		static int map[][]= new int[n][m];;
		static int dx[] = {1,-1,0,0}; //1:悼, 2:辑, 3:合, 4:巢
		static int dy[] = {0,0,-1,1};
		static int dice[]= new int[7];

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		dicex = Integer.parseInt(st.nextToken());
		dicey = Integer.parseInt(st.nextToken());
		command = Integer.parseInt(st.nextToken());
		
		
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<m; j++) {
				map[i][j] =Integer.parseInt(st.nextToken());
			}
		}
		
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<command; i++) {
			int d = Integer.parseInt(st.nextToken());
			
			int nx = dx[d-1]+dicex;
			int ny = dy[d-1]+dicey;
			
			if(0<=nx && 0<= ny && nx<n && ny <m) {
				changeDice(d);
				
				if(map[nx][ny]==0) {
					map[nx][ny]=dice[6];
				}else {
					dice[6]=map[nx][ny];
					map[nx][ny]=0;
				}
				
				dicex = nx;
				dicey = ny;
				
				sb = new StringBuilder();
				sb.append(dice[1]+ "\n");
			}
			
		}
		
		System.out.println(sb.toString());
		
	}

	private static void changeDice(int d) {
		// TODO Auto-generated method stub
		int [] tmp = dice.clone();
		/*
		 * 6 关
		 * 1 拉
		 * 悼 1
		 * 辑 2
		 * 合 3
		 * 巢 4
		 */
		switch(d) {
		case 1:
			dice[1] = tmp[4];
			dice[3] = tmp[1];
			dice[4] = tmp[6];
	        dice[6] = tmp[3];
	        break;
		case 2:
			  dice[1] = tmp[3];
		      dice[3] = tmp[6];
		      dice[4] = tmp[1];
		      dice[6] = tmp[4];
		      break;
		case 3:
			 dice[1] = tmp[5];
		     dice[2] = tmp[1];
		     dice[5] = tmp[6];
		     dice[6] = tmp[2];
		        break;
		case 4:
		   dice[1] = tmp[2];
		   dice[2] = tmp[6];
		   dice[5] = tmp[1];
		   dice[6] = tmp[5];
		  break;
		}
	}



}