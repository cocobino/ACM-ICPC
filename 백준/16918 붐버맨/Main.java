import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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
	 
	 static int dx[] = {1,0,-1,0};
	 static int dy[] = {0,1,0,-1};
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st= new StringTokenizer(br.readLine());
		r = Integer.parseInt(st.nextToken());
		c = Integer.parseInt(st.nextToken());
		n = Integer.parseInt(st.nextToken());
		map =new int[r][c];
		for(int i=0; i<r; i++) {
			String a =br.readLine();
			for(int j=0; j<a.length(); j++) {
				if(a.charAt(j)=='.')map[i][j]=0;
				else if(a.charAt(j)=='O')map[i][j]=3;
			}
		}
		
		boolean stop=false;
		for(int T=0; T<n; T++) {
			//1초식 줄이기
			boolean vis[][] = new boolean[r][c];
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
					if(map[i][j]>=1) {
						map[i][j]--;
						if(map[i][j]==0) {
							for(int dir=0; dir<4; dir++) {
								int nx = i +dx[dir];
								int ny = j +dy[dir];
								if(nx>=0 && ny>=0 && nx<r && ny<c)vis[nx][ny]=true;
							}
						}
					}
				}
			}
			
			for(int i=0; i<r; i++) {
				for(int j=0; j<c; j++) {
					if(vis[i][j])map[i][j]=0;
				}
			}
			
			//쉬지않았다면 쉬기
			if(!stop) {
				stop=true;
				continue;
			}
			//쉬었으면 폭탄설치
			else {
				for(int i=0; i<r; i++) {
					for(int j=0; j<c; j++) {
						if(map[i][j] ==0)map[i][j]=3;
					}
				}
				
				stop=false;
			}
			
			
		}
		for(int i=0; i<r; i++) {
			for(int j=0; j<c; j++) {
				if(map[i][j]>0)System.out.print("O");
				else if(map[i][j]==0)System.out.print(".");
			}
			System.out.println();
		}
				
	}//main
 	 
}// class
