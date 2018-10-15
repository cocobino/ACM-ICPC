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
    
   static int n;
   static int map[][];
   static boolean visit[];
   
   static int min=1000000;
    public static void main(String[] args) throws IOException {
    	
    n = Integer.parseInt(br.readLine());
    
    map = new int[n][n];
    visit = new boolean[n];
    
    
    for(int i=0; i<n; i++) {
    	st = new StringTokenizer(br.readLine());
    	for(int j=0; j<n; j++) {
    		map[i][j] = Integer.parseInt(st.nextToken());
    	}
    }//insert 
    
    dfs(0,0,0);	
    
    bw.write(String.valueOf(min));
    bw.flush();
   }//main 
	private static void dfs(int count, int a, int b) {
		// TODO Auto-generated method stub
		if(count ==n) {
			if(a==0 || b==0)return;
			
			int teama =0;
			int teamb =0;
			for(int i=0; i<n; i++) {
				for(int j=0; j<n; j++) {
					if(visit[i] && visit[j])teama +=map[i][j];
					if(!visit[i] && !visit[j])teamb +=map[i][j];
				}
			}
			min = Math.min(min, Math.abs(teama-teamb));
			return;
			
		}
		visit[count]=true;
		dfs(count+1,a+1,b);
		
		visit[count]=false;
		dfs(count+1,a,b+1);
	}
 
 
    
}// class
  