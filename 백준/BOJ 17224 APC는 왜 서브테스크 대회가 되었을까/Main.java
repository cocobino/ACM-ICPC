import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
 
	static int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());  //문제수
		int l =  Integer.parseInt(st.nextToken()); //현정이 문제 역량
		int k = Integer.parseInt(st.nextToken()); //문제 최대개수
		
		int rst= 0;
		int cnt= 0;
		
		Node problem[] = new Node[n];
		
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int easy = Integer.parseInt(st.nextToken());
			int hard = Integer.parseInt(st.nextToken());
			
			problem[i] = new Node(easy, hard);
		}
			
		Arrays.sort(problem);
		
		 for(int i=0; i<n; i++) {
			 if(cnt == k) {
				 break;
			 }
			 
			 else if(problem[i].hard <= l) {
				 rst+=140;
				 cnt++;
			 }
			 else if(problem[i].easy <= l) {
				 rst +=100;
				 cnt++;
			 }
			 
		 }
		 	 
		System.out.println(rst);
	}// main
 
}// class

class Node implements Comparable<Node>{
	int easy, hard;

	public Node(int easy, int hard) {
		super();
		this.easy = easy;
		this.hard = hard;
	}
	@Override
	public int compareTo(Node o) {
		if(this.hard>o.hard )return 1;
		else if(this.hard < o.hard)return -1;
		else return 0;
	}
	
}