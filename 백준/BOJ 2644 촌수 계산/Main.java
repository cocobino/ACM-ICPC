import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;




public class Main {
		static int arr[][]; 
		static int n;
		static boolean visit[];
		static ArrayList<Integer> q;
		
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        
        
        n = Integer.parseInt(br.readLine());
        
        visit = new boolean[n];
        arr = new int[n][n];
        q = new ArrayList<Integer>();
        
        
        	StringTokenizer st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken())-1;
        	int b = Integer.parseInt(st.nextToken())-1;
        	
        	int m = Integer.parseInt(br.readLine());
        	
        	for(int j=0; j<m; j++) {
        		st = new StringTokenizer(br.readLine());
        		int x = Integer.parseInt(st.nextToken())-1;
        		int y = Integer.parseInt(st.nextToken())-1;
        		
        		arr[x][y] = 1;
        		arr[y][x] = 1;
        	}
        		bfs(a,b);
        	
        		if(visit[b]==false)bw.write(String.valueOf(-1));
       bw.flush();
   
        	
        
        
    }

	private static void bfs(int a, int b) {
		// TODO Auto-generated method stub
		int lv = 0;
		visit[a]= true;
		q.add(a);
		
		while(!q.isEmpty()) {
			int qsize = q.size();
			
			for(int i=0; i<qsize; i++) {
				int cur = q.get(0);
				q.remove(0);
				
				for(int j=0; j<n; j++) {
					if(arr[cur][j] ==1 && !visit[j]) {
						visit[j]=true;
						q.add(j);
						
						if(j == b) {
							System.out.println(lv+1);
					
						}
						
					}
				}
				
			}//qsize
			lv++;
		}//while
	}


	
}
/*
class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}*/