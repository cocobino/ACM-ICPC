import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthSpinnerUI;


public class Main {
	static int N;
	static char arr [][];
	//static int rst[];
	static boolean visit[][];
	static int cnt=0;
	static int dx[] = {1,-1,0,0};
	static int dy[] = {0,0,-1,1};
	static char rst[] = {'R', 'G', 'B'};
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        //StringTokenizer st = new StringTokenizer(br.readLine());
        	
       N = Integer.parseInt(br.readLine());
       arr = new char[N][N];
       visit = new boolean[N][N];
       
       for(int i=0; i<N; i++) {
    	   String a = br.readLine();
    	   for(int j=0; j<N; j++) {
    		   arr[i]=a.toCharArray();
    	   }
       }
       int rgb =0;
       int rb=0;
       for(int r=0; r<3; r++) {	   
       for(int i=0; i<N; i++) {
    	   for(int j=0; j<N; j++) {
    		   if(!visit[i][j] && arr[i][j] == rst[r]) {
    			   dfs(i,j,rst[r]);
    			   rgb++;
    		   }
    		   
    	   }
       }
      }
       	for(int i=0; i<N; i++) {
       		for(int j=0; j<N; j++) {
       			if(arr[i][j] == 'R')arr[i][j]='G';
       		}
       	}
       	
        visit = new boolean[N][N];
       	for(int r=0; r<3; r++) {	   
            for(int i=0; i<N; i++) {
         	   for(int j=0; j<N; j++) {
         		   if(!visit[i][j] && arr[i][j] == rst[r]) {
         			   dfs(i,j,rst[r]);
         			   rb++;
         		   }
         		   
         	   }
            }
           }
       	
       	
       bw.write(String.valueOf(rgb+" "+rb));
       bw.flush();
       
	}
	private static void dfs(int x, int y, char rst) {
		// TODO Auto-generated method stub
		if(visit[x][y])return;
		visit[x][y]=true;
		
		for(int i=0; i<4; i++) {
			int nextX = x+dx[i];
			int nextY = y+dy[i];
			
			if(nextX<0 || nextY<0 || nextX>=N || nextY >= N )continue;
			if(visit[nextX][nextY] || arr[nextX][nextY] != rst)continue;
			
			dfs(nextX,nextY,rst);
			
		}
		
	}
        
        
}