import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static Scanner sc = new Scanner(System.in);
	static StringTokenizer st;
	
	
	static int map[][] = new int[10][10];
	static boolean visit[][] = new boolean[10][10];
	static int cnt=0;
	static int numberchk[][];
	static int curx,cury;
	
	 public static void main(String[] args) throws IOException {
		 
		for(int i=1; i<=9; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=9; j++) {
				map[i][j] = Integer.parseInt(st.nextToken());
			}
		}//insert
		
		solve();
 
		 for(int i=1; i<=9; i++) {
			 for(int j=1; j<=9; j++) {
				 bw.write(String.valueOf(map[i][j] + " "));
			 }
			 bw.write(String.valueOf("\n"));
		 }
 bw.flush();
	}//main


	private static boolean solve() {
		// TODO Auto-generated method stub
		int r =0;
		int c =0;
		
		if(findempty()) {
			return true;
		}
		r = curx;
		c = cury;
		
		for(int i=1; i<=9; i++) {
			if(ispossible(i,r,c)) {
				map[r][c]=i;
				if(solve()) {
					return true;
				}
				map[r][c]=0;
			}
		}
		
		return false;
	}

		private static boolean ispossible(int i, int r, int c) {
		// TODO Auto-generated method stub
			if(chkrow(r,i) && chkcol(c,i) && chkbox(r,c,i))return true;
			return false;
		
	}


		private static boolean chkbox(int r, int c, int i) {
			// TODO Auto-generated method stub
			int row = (int) ((Math.ceil(r/3.0)-1)*3+1);
			int col = (int) ((Math.ceil(c/3.0)-1)*3+1);
			
			for(int k=0; k<3; k++) {
				for(int j=0; j<3; j++) {
					if(map[row+k][col+j]==i)return false;
				}
			}
			return true;
		}


		private static boolean chkcol(int c, int i) {
			// TODO Auto-generated method stub
			for(int j=1; j<=9; j++) {
				if(map[j][c]==i)return false;
			}
			return true;
		}


		private static boolean chkrow(int r, int i) {
			// TODO Auto-generated method stub
			for(int j=1; j<=9; j++) {
				if(map[r][j]==i)return false;
			}
			return true;
		}


		public static boolean findempty() {
			for(int i=1; i<=9; i++) {
				for(int j=1; j<=9; j++) {
					if(map[i][j] ==0) {
						curx=i;cury=j;
						return false;
					}
				}
			}
			return true;
		}
  
}// class
 