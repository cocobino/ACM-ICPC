import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
	
		public static int arr[][];
		public static boolean visit[][];
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case  = Integer.parseInt(br.readLine());
		
		for(int T=0; T<test_case; T++) {
		
			int N = Integer.parseInt(br.readLine());
			ArrayList<Node> enermy = new ArrayList<>();
			for(int i=0; i<N; i++) {
				StringTokenizer st = new StringTokenizer(br.readLine());
				
				enermy.add(new Node(Integer.parseInt(st.nextToken()),
									Integer.parseInt(st.nextToken()),
									Integer.parseInt(st.nextToken())						
						));
				}
			EGroup gp = new EGroup(enermy);
			bw.write(String.valueOf(gp.getEGroup()+"\n"));
			bw.flush();
		}
	}
	static class EGroup{
		ArrayList<Node> enermy = new ArrayList<>();
		boolean visit[];
		int rst;
		
		public EGroup(ArrayList<Node> enermy) {
			// TODO Auto-generated constructor stub
			this.enermy = enermy;
			this.visit = new boolean[enermy.size()];
			rst=0;
		}
		
		public int getEGroup() {
			int N = enermy.size();
			for(int i=0; i<N; i++) {
				if(!visit[i]) {
					bfs(i);
					rst++;
				}
			}
			return rst;
			
		}

		private void bfs(int curNode) {
			// TODO Auto-generated method stub
			Queue<Node> q = new LinkedList<Node>();
			q.offer(enermy.get(curNode));
			visit[curNode]=true;
			
			while(!q.isEmpty()) {
				Node e = q.poll();
				for(int i=0; i<enermy.size(); i++) {
					if(!visit[i] && isConnected(enermy.get(i), e)) {
						q.offer(enermy.get(i));
						visit[i]=true;
					}
				}
			}
			
		}

		private boolean isConnected(Node e1, Node e2) {
			// TODO Auto-generated method stub
			return Math.pow(e1.getR()+e2.getR(), 2)>=
					Math.pow(e2.getX()-e1.getX(), 2) +
					 Math.pow(e2.getY() - e1.getY(), 2);
		}
	}
	
	static class Node{
		int x,y,r;
		public Node(int x, int y, int r) {
			// TODO Auto-generated constructor stub
			this.x = x;
			this.y = y;
			this.r = r;
		}
		public int getX(){
			return x;
		}
		public int getY(){
			return y;
		}
		public int getR(){
			return r;
		}
		
	}
}
