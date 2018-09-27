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

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	static int parent[] = new int[100005];
	
	static int dx[] = {0,0,-1,1};
	static int dy[] = {1,-1,0,0};
	
	static int n,q;
	static int map[][];
	 
	
	 public static void main(String[] args) throws IOException {
		 n = Integer.parseInt(br.readLine());
		 map = new int[n][n];
		 
		 for(int i=0; i<n; i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 for(int j=0; j<n; j++) {
				 map[i][j] = Integer.parseInt(st.nextToken());
			 }
		 }
		 q = Integer.parseInt(br.readLine());
		 for(int i=0; i<q; i++) {
			 StringTokenizer st = new StringTokenizer(br.readLine());
			 int x1 = Integer.parseInt(st.nextToken())-1;
			 int y1 = Integer.parseInt(st.nextToken())-1;
			 int x2 = Integer.parseInt(st.nextToken())-1;
			 int y2 = Integer.parseInt(st.nextToken())-1;
			 
			 bw.write(String.valueOf(count(x1,y1,x2,y2)+"\n"));
			 bw.flush();
			 
		 }
	 
		 
	 }//main


	private static int count(int x1, int y1, int x2, int y2) {
		// TODO Auto-generated method stub
		boolean visit[] = new boolean[10];
		int cnt=0;
		for(int i=x1; i<=x2; i++) {
			for(int j=y1; j<=y2; j++) {
				visit[map[i][j]]=true;
			}
		}
	for(int i=1; i<10; i++)if(visit[i])cnt++;
		
		
		return cnt;
	}
 
}// class
