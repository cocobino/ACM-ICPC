import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

class Main {

	static int min = Integer.MAX_VALUE;
	static int cnt= 0;
	public static void main(String[] args) throws IOException {
	 BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	 StringTokenizer st;
	  
	 st = new StringTokenizer(br.readLine());
	 int n = Integer.parseInt(st.nextToken());
	 int m = Integer.parseInt(st.nextToken());
	 
	 Node card[] = new Node[n];
	 
	 for(int i=0; i<n; i++) {
		 st = new StringTokenizer(br.readLine());
		 int front = Integer.parseInt(st.nextToken());
		 int back = Integer.parseInt(st.nextToken());
		 
		 card[i] = new Node(front, back, false);
		
	 }//insert
	 
	 for(int i=0; i<m; i++) {
		 int com = Integer.parseInt(br.readLine());
		 
		 for(int j=0; j<n; j++) {
			 if(!card[j].flag && card[j].front <=com) {
				 card[j].flag = true;
			 }
			 else if(card[j].flag && card[j].back <= com) {
				 card[j].flag =false;
			 }
		 }
		 
	 }

	 int sum =0 ;
	 for(int i=0; i<n; i++) {
		 if(card[i].flag)sum += card[i].back;
		 else if(!card[i].flag) sum +=card[i].front;
	 }
	 
	 System.out.println(sum);
	}//main
	 
 
}// class

class Node implements Comparable<Node>{
	int front,back;
	boolean	flag;
	public Node(int front, int back, boolean flag) {
		super();
		this.front = front;
		this.back = back;
		this.flag = flag;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.flag) {
		if(this.front > o.front)return 1;
		else if(this.front < o.front)return -1;
		else return 0;
		}
		else {
			if(this.back > o.back)return 1;
			else if(this.back < o.back)return -1;
			else return 0;
		}
	}
	
}
