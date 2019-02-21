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
	// ��,��,��,��
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
		
		
		//��簣�� Ȯ�����ֱ�
		for(int i=0; i<e; i++) {
			Node cur = qp.get(i);
			int curfrom = cur.from;
			int	curto= cur.to;
			
			int a = findSet(curfrom);//������ �����ϰ� �������ϸ� ����Ŭ ����
			int b = findSet(curto); //������ ���ֻ����� ������ �ȵ�
			if(a==b)continue;
			else {
			union(curfrom, curto); //�ΰ���� ��Ʈ���ٸ��� ���ʻ��� �ιǷ� �ٸ������� ����
			rst+=cur.cost;//���õ� ������ ����� �����ָ��
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