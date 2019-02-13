import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static boolean visit[];
	 
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		 //10
		//1 4 1 6 6 10 5 7 3 8 5 9 3 5 8 11 2 13 12 14
		//가장 많은 회의를 열때 회의 개수
		
		int n = Integer.parseInt(br.readLine());
		
		Node list[] = new Node[n];
		
		
		for(int i=0; i<n; i++) {
			st= new StringTokenizer(br.readLine());
			int from = Integer.parseInt(st.nextToken());
			int to = Integer.parseInt(st.nextToken());
			list[i]=new Node(from,to);
		}
		
		Arrays.sort(list);
		
		int cnt=0;
		int tmp=0;
		
		for(int i=0; i<list.length; i++) {
			if(tmp<=list[i].from) {
				tmp = list[i].to;
				cnt++;
			}
			
		}
		bw.write(String.valueOf(cnt));
		bw.flush();
	}//main
 
 
	
	
}//class

class Node implements Comparable<Node>{
	int from,to;

	public Node(int from, int to) {
		this.from = from;
		this.to = to;
	}

	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.to > o.to)return 1;
		else if(this.to <o.to)return -1;
		else if(this.to == o.to) {
			if(this.from > o.from)return 1;
			else if(this.from < o.from)return -1;
			else return 0;
		}
		return 0;
	}
	
	
}