import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
	 
		int n = Integer.parseInt(br.readLine());
		
		boolean vis[] = new boolean[n+1];
			vis[n]=true;
		Queue<Node> q = new LinkedList<>();
		ArrayList<Integer> log = new ArrayList<>();
		log.add(n);
		q.add(new Node(n, log));
//		System.out.println(2/2);
		int time =-1;
		boolean flag =false;
		Node rst = null;
		while(!q.isEmpty() && !flag) {
			time++;
			int qsize= q.size();
			for(int size=0; size<qsize; size++) {
				Node cur = q.poll();
				
				if(cur.cnt ==1) {
					rst = cur;
					flag=true;
					break;
				}
				
					if(cur.cnt%3==0 && !vis[cur.cnt/3]&& cur.cnt/3 !=0) {
						ArrayList<Integer> newlog = new ArrayList<>(cur.log);
						vis[cur.cnt/3]=true;
						newlog.add(cur.cnt/3);
						q.add(new Node(cur.cnt/3, newlog));
					}
					if(cur.cnt%2==0  && !vis[cur.cnt/2] && cur.cnt/2 !=0) {
						ArrayList<Integer> newlog = new ArrayList<>(cur.log);
						vis[cur.cnt/2]=true;
						newlog.add(cur.cnt/2);
						q.add(new Node(cur.cnt/2, newlog));
					}
					if(cur.cnt-1>=1 && !vis[cur.cnt-1]){
						ArrayList<Integer> newlog = new ArrayList<>(cur.log);
						vis[cur.cnt-1]=true;
						newlog.add(cur.cnt-1);
						q.add(new Node(cur.cnt-1, newlog));
					}
				
			}
		}
	  
		System.out.println(time);
		for(int i=0; i<rst.log.size(); i++) {
			System.out.print(rst.log.get(i)+" ");
		}
		
	}// main
	 
}// class
 
class Node{
	int cnt;
	ArrayList<Integer> log;
	public Node(int cnt, ArrayList<Integer> log) {
		super();
		this.cnt = cnt;
		this.log = log;
	}

	
	
}