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
    
   static int map[][];
   static boolean visit[][];
   static int r,c,k;
   
   static int dx[] = {-1,0,1,0};
   static int dy[] = {0,1,0,-1};
   static int cnt=1;
   
    public static void main(String[] args) throws IOException {
    st = new StringTokenizer(br.readLine());
    c = Integer.parseInt(st.nextToken());
    r = Integer.parseInt(st.nextToken());
    
    map = new int[r][c];
    
    
    k = Integer.parseInt(br.readLine());
    if(r*c<k) {
    	bw.write(String.valueOf(0));
    	bw.flush();
        System.exit(0);
    }
    
    int cnt=1;
    
    int x = r-1;
	int y = 0;
	int dir= 0;
	while(cnt != k) {
		
		if(cnt==k)break;
		map[x][y]=cnt;
		int nx = x+dx[dir];
		int ny = y+dy[dir];
		
		if(nx<0 || ny<0 || nx>=r || ny>=c || map[nx][ny] !=0) {
			dir++;
			if(dir==4)dir=0;	
			nx = x+dx[dir];
			ny = y+dy[dir];
		}
		
		x=nx;
		y=ny;
		
		cnt++;
    }
	
    bw.write(String.valueOf((y+1)+ " "+(r-x)));
    bw.flush();
    
   }//main

 
}// class
  