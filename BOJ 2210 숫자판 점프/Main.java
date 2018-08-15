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
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Scanner;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
		
 	static int map[][] = new int[5][5];
 	static boolean visit[][];
 	 
 	static Set<Integer> rst =  new HashSet<>();
 	static int dx[] = {0,1,0,-1};
 	static int dy[] = {1,0,-1,0};
 	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		for(int i=0; i<5; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			for(int j=0; j<5; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				backtracking(1,i,j,map[i][j]);
			}
		}
		bw.write(String.valueOf(rst.size()));
		bw.flush();
		
	}

	private static void backtracking(int cnt, int x, int y, int num) {
		// TODO Auto-generated method stub
		if(cnt ==6) {
			rst.add(num);
			return;
		}
		for(int i=0; i<4; i++) {
			int nx = x + dx[i];
			int ny = y + dy[i];
			
			if(nx>=0 && ny>=0 && nx<5 && ny<5) {
				backtracking(cnt+1, nx,ny,num*10+map[nx][ny]);
			}
			
		}
	}
 

}
