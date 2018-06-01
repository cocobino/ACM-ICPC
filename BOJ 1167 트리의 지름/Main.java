import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;
 
public class Main {

	public static LinkedList<Node> tree[];
	public static boolean[] visited;
	
    public static void main(String[] args) throws IOException { 
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		
		tree = new LinkedList[n+1];
		
		for(int i=1; i<=n; i++) {
			st = new StringTokenizer(br.readLine());
			int prt = Integer.parseInt(st.nextToken());
			
			tree[prt] = new LinkedList<Node>();
			
			while(st.hasMoreTokens()) {
				int chd = Integer.parseInt(st.nextToken());
				if( chd== -1)break;
				int dist = Integer.parseInt(st.nextToken());
				tree[prt].add(new Node(chd, dist));
			}
		}
		
		visited = new boolean[n+1];
		Node first = dfs(1,0);
		visited = new boolean[n+1];
		bw.write(String.valueOf(dfs(first.num, 0).dist));
		bw.flush();
		br.close();
		bw.close();
		}
    
    
    private static Node dfs(int curNode, int dist) {
		// TODO Auto-generated method stub
    	visited[curNode] = true;
    	Node max = new Node(curNode, dist);
    	
    	for( Node tmp : tree[curNode]) {
    		if(!visited[tmp.num]) {
    			Node ret = dfs(tmp.num, dist+tmp.dist);
    			if(max.dist < ret.dist)max =ret;
    	}
	}
    	return max;
    }
    
    private static class Node{
    	public int num;
    	public int dist;
    	
    	public Node(int num, int dist) {
			// TODO Auto-generated constructor stub
    		this.num = num;
    		this.dist = dist;
    		
		}
    }
    
}
