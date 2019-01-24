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
	 
	static int dx[] = {-1,1,0,0};
	static int dy[] = {0,0,-1,1};
	 
	static int n;
	static int map[], rst[], stack[];
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		n = Integer.parseInt(br.readLine());
		 Node list[] = new Node[n];
		 
		 for(int i=0; i<n; i++) {
			st = new StringTokenizer(br.readLine());
			int year = Integer.parseInt(st.nextToken());
			String name = st.nextToken();
			
			list[i] = new Node(i, year, name);
		 }
		 Arrays.sort(list);
		 
		 for(int i=0; i<n; i++) {
			 bw.write(String.valueOf(list[i].year+" "+list[i].name+"\n"));
		 	}
		 bw.flush();
	}//main

}//class
 
class Node implements Comparable<Node>{
	int cnt,year; String name;
	public Node(int cnt, int year, String name) {
		// TODO Auto-generated constructor stub
		this.cnt =cnt;
		this.year=year;
		this.name =name;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.year < o.year)return -1;
		else if(this.year > o.year)return 1;
		else if(this.year == o.year) {
			if(this.cnt <o.cnt)return -1;
			else if(this.cnt > o.cnt)return 1;
			else return 0;
		}
		return 0;
	}
}