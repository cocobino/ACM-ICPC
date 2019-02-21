import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int parent[];
	static boolean visit[];
	static Node edge[];
	static int v,e;
	static ArrayList<Node> qp = new ArrayList<>();
	// 하,상,좌,우
	static int dx[] = { 1, -1, 0, 0 ,  1, 1, -1, -1};
	static int dy[] = { 0, 0, 1, -1 , -1, 1,  1, -1};
	
	 static int rst;
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		st =new StringTokenizer(br.readLine());
		v = Integer.parseInt(st.nextToken());
		e = Integer.parseInt(st.nextToken());
		
		 
		rst=0;
		
		
		for(int i=0; i<e; i++) {
			st= new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			int cost= Integer.parseInt(st.nextToken());
			 
			qp.add(new Node(from,to,cost));
			}//insert
		
		Collections.sort(qp);
		
		//makeset
		parent = new int[v+1];
		for(int i=1; i<=v; i++)parent[i]=i;
		
		
		//모든간선 확인해주기
		for(int i=0; i<e; i++) {
			Node cur = qp.get(i);
			int curfrom = cur.from;
			int	curto= cur.to;
			
			int a = findSet(curfrom);//간선을 선택하고 연결을하면 사이클 방지
			int b = findSet(curto); //양쪽으 ㅣ최상위가 같으면 안됨
			if(a==b)continue;
			else {
			union(curfrom, curto); //두개노드 루트가다르면 한쪽상위 부므롤 다른쪽으로 설정
			rst+=cur.cost;//선택된 간선의 비용을 더해주면됨
			}
		}
		 bw.write(String.valueOf(rst));
		 bw.flush();
	}// main

	private static void union(int curfrom, int curto) {
		// TODO Auto-generated method stub
		curfrom = findSet(curfrom);
		curto = findSet(curto);
		
		if(curfrom != curto) {
			parent[curto]=curfrom;
		}
		else return;
	}

	private static int findSet(int curfrom) {
		// TODO Auto-generated method stub
		 if(parent[curfrom] == curfrom)
	            return curfrom;
	        else
	            return parent[curfrom] = findSet(parent[curfrom]);
	}
 

}// class
  
class Node implements Comparable<Node>{
	int from,to,cost;

	public Node(int from, int to, int cost) {
		this.from = from;
		this.to = to;
		this.cost = cost;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.cost > o.cost)return 1;
		else if(this.cost < o.cost)return -1;
		else return 0;
	}
	
}