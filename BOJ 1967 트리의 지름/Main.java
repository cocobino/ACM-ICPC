import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean visit[]; // �湮���� ü��
	public static int n, maxDist; // ��� ����, �ִ밪
	public static Node maxDistNode; // �ִ� ���� ���
	public static LinkedList<Node> tree[]; //Ʈ������
	
	
	
	
    public static void main(String[] args) throws NumberFormatException, IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	int n, prt, chd, dist;
	//String line[];
	
	n = Integer.parseInt(br.readLine());
	tree = new LinkedList[n];
	visit = new boolean[n];
	
	for(int i=0;i<n;i++)tree[i] = new LinkedList<>();
	
	for(int i=1;i <n; i++) {
		//line = br.readLine().split(" ");
		StringTokenizer st= new StringTokenizer(br.readLine());
		prt = Integer.parseInt(st.nextToken())-1;   //�θ�
		chd = Integer.parseInt(st.nextToken())-1;	//�ڽ�
		dist = Integer.parseInt(st.nextToken());	//�θ� - �ڽ� �Ÿ�
		
		tree[prt].add(new Node(chd,dist)); //�θ� => �ڽ�
		tree[chd].add(new Node(prt,dist)); // �ڽ� => �θ�
		
	}
	//�ִ�Ÿ� Ž��
	for(Node root : tree[0]) {
		visit[0]= true;
		dfs(root,root.dist);
		visit[0]=false;
	}
	
	maxDist =0; //�ʱ�ȭ
	//�ִ���̿������� �ִ�Ÿ� ��� Ž��
	dfs(maxDistNode, 0);
	bw.write(String.valueOf(maxDist));
	bw.flush();
	bw.close();
	br.close();
	
    }


	private static void dfs(Node curNode, int dist) {
		// TODO Auto-generated method stub
		//������ ��Ž�� ����(����� �׷���)
		
		visit[curNode.num] =true; //�ش� ��� �湮 ǥ��
		
		for( Node tmp : tree[curNode.num]) { 
			if(!visit[tmp.num]) {
				visit[tmp.num] = true;
				dfs(tmp, dist+tmp.dist);
				visit[tmp.num] = false;
			}
		}
		if(dist > maxDist) {
			maxDistNode = curNode;
			maxDist = dist;
		}
		visit[curNode.num] = false;
	}
    
}
class Node{
	int num, dist; //��� ��ȣ, ��� �Ÿ�
	public Node(int num, int dist) {
		this.num= num;
		this.dist = dist;
	}
}