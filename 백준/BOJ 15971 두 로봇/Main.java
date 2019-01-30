import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	static int dx[] = {-1,1,0,0,1,-1,-1,1}; //상, 하 , 좌 , 우
	static int dy[] = {0,0,-1,1,1,1,-1,-1};
	 						  //오른위(4), 오른아래(5), 왼위(6), 왼아래(7)
	static int map[][], com[];
	static boolean visit[];
	
	static int n,start,end,max=0,cnt=1000,rst=10000;
	static ArrayList<Node>[] arr;
	
		
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		 
		st =new StringTokenizer(br.readLine());
		 n = Integer.parseInt(st.nextToken());
		 start = Integer.parseInt(st.nextToken());
		 end = Integer.parseInt(st.nextToken());
		 
		 
		 visit = new boolean[n+1];
		 arr = new ArrayList[n+1];
		 for(int i=0; i<=n; i++)arr[i] = new ArrayList<Node>();
		 
		  
		 for(int i=0; i<n-1; i++) {
			 st =new StringTokenizer(br.readLine());
			 int from = Integer.parseInt(st.nextToken());
			 int to = Integer.parseInt(st.nextToken());
			 int cost = Integer.parseInt(st.nextToken());
			
			 arr[from].add(new Node(to,cost));
			 arr[to].add(new Node(from,cost));
		 }
		
	
		 dfs(start,0,0);
		 
		 bw.write(String.valueOf(rst));
		 bw.flush();
		 
	}//main


	private static void dfs(int cur, int sum, int curmax) {
		// TODO Auto-generated method stub
		visit[cur]= true;
		
		if(cur == end) {
			rst = sum - curmax;
			return;
		}
		
		for(int i=0; i<arr[cur].size(); i++) {
			if(!visit[arr[cur].get(i).to]) {
				dfs(arr[cur].get(i).to, sum+arr[cur].get(i).cost,
						Math.max(curmax, arr[cur].get(i).cost));
			}
		}
		
		 
	}
  
 
}//class

class Node{
	int to,cost;
	public Node(int to, int cost) {
		this.to = to;
		this.cost = cost;
	}
	public int getTo() {
		return to;
	}
	public void setTo(int to) {
		this.to = to;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	
}
 