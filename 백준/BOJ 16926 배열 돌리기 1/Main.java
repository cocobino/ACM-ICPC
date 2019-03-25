import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	 static int r,c,n;
	 static int map[][];
	 static boolean readvis[][];
	 static boolean writevis[][];
	 static int dx[] = {1,0,-1,0}; //го , ©Л, ╩С, аб
	 static int dy[] = {0,1,0,-1};
	 static ArrayList<Integer> log;
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = null;
		
		
		st =new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		
		map = new int[r][c];
		readvis = new boolean[r][c];
		writevis = new boolean[r][c];
		
		for(int i=0; i<r; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=0; j<c; j++) {
				map[i][j] =Integer.parseInt(st.nextToken());
			}
		}//insert
		for(int i=0; i<r; i++) {
		for(int j=0; j<c; j++) {
			if(!readvis[i][j]) {
				 log = new ArrayList<>();
				read(0,i,j);
				rotate();
				write(0,i,j);
			}
		}
		
		}
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				System.out.print(map[i][j] +" ");
			}
			System.out.println();
		}
	
	}//main

	private static void write(int dir, int x, int y) {
		// TODO Auto-generated method stub
		map[x][y]=log.remove(0);
		writevis[x][y]=true;
		int nx = x + dx[dir];
		int ny = y + dy[dir];
		
		if(inrage(nx,ny) && !writevis[nx][ny]) {
			write(dir,nx,ny);
		}
		else if(!inrage(nx,ny) || writevis[nx][ny]){
			if(dir+1<4) {
			nx = x +dx[dir+1];
			ny = y +dy[dir+1];
			if(!writevis[nx][ny])
			write(dir+1,nx,ny);
			
			}
		}
		
	}

	private static void rotate() {
		// TODO Auto-generated method stub
		for(int i=0; i<n; i++)
			log.add(0, log.remove(log.size()-1));
	}

	private static void read( int dir, int x, int y) {
		// TODO Auto-generated method stub
		log.add(map[x][y]);
		readvis[x][y]=true;
		
		int nx = x + dx[dir];
		int ny = y + dy[dir];
		
		if(inrage(nx,ny) && !readvis[nx][ny]) {
			read(dir,nx,ny);
		}
		else if(!inrage(nx,ny) || readvis[nx][ny]){
			if(dir+1<4) {
			nx = x +dx[dir+1];
			ny = y +dy[dir+1];
			if(!readvis[nx][ny])
			read(dir+1,nx,ny);
			
			}
		}
	}

	private static boolean inrage(int nx, int ny) {
		// TODO Auto-generated method stub
		if(nx>=0 && ny>=0 && nx<r && ny<c)return true;
		return false;
	}
 	 
}// class