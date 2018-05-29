import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	public static boolean visit[]; // 방문여부 체그
	public static int n, maxDist; // 노드 개수, 최대값
	public static Node maxDistNode; // 최대 깊이 노드
	public static LinkedList<Node> tree[]; //트리연결
	
	
	
	
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
		prt = Integer.parseInt(st.nextToken())-1;   //부모
		chd = Integer.parseInt(st.nextToken())-1;	//자식
		dist = Integer.parseInt(st.nextToken());	//부모 - 자식 거리
		
		tree[prt].add(new Node(chd,dist)); //부모 => 자식
		tree[chd].add(new Node(prt,dist)); // 자식 => 부모
		
	}
	//최대거리 탐색
	for(Node root : tree[0]) {
		visit[0]= true;
		dfs(root,root.dist);
		visit[0]=false;
	}
	
	maxDist =0; //초기화
	//최대깊이에서부터 최대거리 노드 탐색
	dfs(maxDistNode, 0);
	bw.write(String.valueOf(maxDist));
	bw.flush();
	bw.close();
	br.close();
	
    }


	private static void dfs(Node curNode, int dist) {
		// TODO Auto-generated method stub
		//현재노드 재탐색 방지(양방향 그래프)
		
		visit[curNode.num] =true; //해당 노드 방문 표시
		
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
	int num, dist; //노드 번호, 노드 거리
	public Node(int num, int dist) {
		this.num= num;
		this.dist = dist;
	}
}