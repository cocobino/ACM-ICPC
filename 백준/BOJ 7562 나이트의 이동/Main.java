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
		
		//static int ches[][];
		//static boolean visit[][];
		static int dx[] = {2,1,-1,-2,2,1,-1,-2};
		static int dy[] = {1,2,2,1,-1,-2,-2,-1};
		
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int test_case = Integer.parseInt(br.readLine());
        for(int T=0; T<test_case; T++) {
        
        int l = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine()); //나이트 현재 위치
        int px = Integer.parseInt(st.nextToken());
        int py = Integer.parseInt(st.nextToken());
        
        Node start = new Node(px,py);
        
        st = new StringTokenizer(br.readLine()); // 이동하려고하는 칸
        int ax = Integer.parseInt(st.nextToken());
        int ay = Integer.parseInt(st.nextToken());
        
        Node end = new Node(ax,ay);
        
       bw.write(String.valueOf(bfs(start, end,l)+"\n")); 
        
        }//test_case end
        
        bw.flush();
	}

	private static int bfs(Node start, Node end, int l) {
		// TODO Auto-generated method stub
		boolean visit[][] = new boolean[l][l];
		boolean goal =false;
		
		int cnt=0;
		
		Queue<Node> q = new LinkedList<Node>();
		q.offer(start);
		visit[start.x][start.y]= true;
		
		while(!q.isEmpty()&& !goal) {
			
			
		for(int i=0, qSize=q.size(); i<qSize; i++) {
		Node curNode = q.poll();
		if(curNode.x == end.x && curNode.y == end.y) {
			goal = true;
			break;
		}
		
		for(int j=0; j<dx.length ; j++) {
			int nextX = curNode.x + dx[j];
			int nextY =curNode.y + dy[j];
			
			if(nextX<0 || nextX>=l || nextY<0 || nextY>=l)continue;
			if(visit[nextX][nextY])continue;
			
			q.offer(new Node(nextX, nextY));
			visit[nextX][nextY]=true;
			
		}
		
		}
		if(goal)break;
		cnt++;
		
		
		}
		return cnt;
		
		
		
	}
	
	
}

class Node{
	int x,y;
	public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		this.x = x;
		this.y = y;
	}
}