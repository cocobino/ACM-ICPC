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
	
			static int N,M;
			static int arr[][];
			static boolean visit[][][];
			static int dx[] = {1,-1,0,0};
			static int dy[] = {0,0,-1,1};
			static final int Yes=1;
			static final int No=0;
			
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st= new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        
        arr= new int[N][M];
        visit = new boolean[N][M][2];
        
        for(int i=0; i<N; i++) {
        	String a =br.readLine();
        	for(int j=0; j<M; j++) {
        	  arr[i][j] = a.charAt(j)-'0';
        	}
        }// ÀÔ·ÂºÎ
        
        Queue<Node> q = new LinkedList<Node>();
        
        q.add(new Node(0,0,0));
        visit[0][0][No] = true;
        visit[0][0][Yes] = true;
        
        boolean isSuccess = false;
        int cnt =0;
        while(!q.isEmpty() && !isSuccess){
        	cnt++;
        	int size = q.size();
        	for(int j=0; j<size; j++) {
        	Node curNode = q.poll();
        	if(curNode.x == N-1 && curNode.y ==M-1) {
        		isSuccess =true;
        		break;
        	}
        	for(int i=0; i<4; i++) {
        		int nextX = curNode.x+dx[i];
        		int nextY = curNode.y+dy[i];
        		
        		if(nextX<0||nextY<0||nextX>=N||nextY>=M)continue;
        		
        		//if(arr[nextX][nextY]==1)continue;
        		
        		if(arr[nextX][nextY] == 1) {
        			if(curNode.destroy < Yes && !visit[nextX][nextY][1]) {
        				q.add(new Node(nextX,nextY,Yes));
        				visit[nextX][nextY][Yes]=true;
        			}
        		}else {
        			if(!visit[nextX][nextY][curNode.destroy]) {
        				q.add(new Node(nextX,nextY,curNode.destroy));
        				visit[nextX][nextY][curNode.destroy]=true;
        			}
        		}
        	}
       	}	
    }
        
        
        bw.write(String.valueOf(isSuccess ? cnt : -1));
        bw.flush();
        
        
    }	
}

 	class Node {
	int x,y,destroy;
	public Node(int x, int y, int destroy) {
		// TODO Auto-generated constructor stub
		this.x =x;
		this.y =y;
		this.destroy=destroy;
	}

}