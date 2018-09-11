import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Solution {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static int T,t;
    
    public static void main(String args[]) throws IOException {
    	T = Integer.parseInt(br.readLine());
    	t=1;
    	while(t++<=T)solution(); 
    }//main

    //declare
    static int map[][];
    static int visit[][];
    static int n,m,c;
    
	private static void solution() throws IOException {
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 n = Integer.parseInt(st.nextToken()); //¹úÅëÅ©±â
	 m = Integer.parseInt(st.nextToken()); //Ã¤ÁýÇÒ ¹úÅë °³¼ö
	 c = Integer.parseInt(st.nextToken()); //ÃÖ´ë ²Ü¾ç
		 
	 map = new int[n][n];
	 visit = new int[n][n];
	 
	 for(int i=0; i<n; i++) {
		 st = new StringTokenizer(br.readLine());
		 for(int j=0; j<n; j++) {
			 map[i][j] =Integer.parseInt(st.nextToken());
		 }
	 }//insert
	 
	 int rst =0;
	 for(int i=0; i<n; i++) {
		 for(int j=0; j<n-m+1; j++) {
			 rst = Math.max(rst, dfs(i,j));
		 }
	 }
	 
	 bw.write(String.valueOf("#"+(t-1)+" "+rst+"\n"));
	 bw.flush();
	}//solution

	static int ans=0;
	private static int dfs(int x, int y) {
		// TODO Auto-generated method stub
		for(int i=0; i<m; i++) {
			visit[x][y+i]=1;
		}
		ans=0;
		getmax(x,y,0,0,0);
		int rsta=ans;
		
		int rstb=0;
		for(int i=0; i<n; i++) {
			for(int j=0; j<n-m+1; j++) {
				if(visit[i][j]==0) {
					ans=0;
					getmax(i,j,0,0,0);
					rstb=Math.max(rstb, ans);
				}
			}
		}
		return rsta+rstb;
	}
	private static void getmax(int x, int y, int a, int sum, int price) {
		// TODO Auto-generated method stub
		if(sum>c)return;
		ans = Math.max(ans, price);
		if(a == m) return;
		
		getmax(x,y+1,a+1,sum+map[x][y],price+map[x][y]*map[x][y]);
		getmax(x,y+1,a+1,sum,price);
	}
	
	 
	 
	}//class


		 
	

