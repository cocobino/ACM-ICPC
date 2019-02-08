import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;

	static int arr[];
	static int n, s;

	public static void main(String[] args) throws Exception {

		int test_case = Integer.parseInt(br.readLine());
		
		for(int T=0; T<test_case; T++) {
		
		int n =Integer.parseInt(br.readLine());
		ArrayList<Node> arr = new ArrayList<>();
		for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			 String name = st.nextToken();
			 int cost = Integer.parseInt(st.nextToken());
		boolean flag=false;
			 for(int j=0; j<arr.size(); j++) {
				 if(arr.get(j).name.equals(name)) {
					 arr.get(j).cost+=cost;
					 flag=true;
				 }
			 }
			 if(!flag)arr.add(new Node(name,cost));
			 
		}
			 
		Collections.sort(arr);
		bw.write(String.valueOf(arr.get(arr.size()-1).name+"\n"));
		bw.flush();
		
		} // test_case

	}// main

}// class

class Node implements Comparable<Node>{
	String name;
	int cost;
	public Node(String name, int cost) {
		super();
		this.name = name;
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