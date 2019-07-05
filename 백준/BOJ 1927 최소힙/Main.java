import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st;
		
		int n = Integer.parseInt(br.readLine());
		
		int idx=0;
		PriorityQueue<Node> q = new PriorityQueue<>();
		
		
		for(int i=0; i<n; i++) {
			int tmp = Integer.parseInt(br.readLine());
			if(tmp == 0) {
			if(q.isEmpty())System.out.println(0);
			else System.out.println(q.poll().num);
			}
			else {
				q.add(new Node(tmp));
			}
		}
		
		
	}// main
	 
}// class
  
class Node implements Comparable<Node>{
	int num;

	public Node(int num) {
		super();
		this.num = num;
	}
	
	@Override
	public int compareTo(Node o) {
		if(this.num < o.num)return -1;
		else if (this.num > o.num)return 1;
		else return 0;
	}
	
}