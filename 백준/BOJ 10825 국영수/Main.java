import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	 static int r,c,n;
	 static int map[][];
	 
	 static int dx[] = {1,0,-1,0};
	 static int dy[] = {0,1,0,-1};
	 
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = null;
		
		int n = Integer.parseInt(br.readLine());
		
		Node[] node =new Node[n];
		
		for(int i=0; i<n; i++) {
			st =new StringTokenizer(br.readLine());
			String name = st.nextToken();
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			int c = Integer.parseInt(st.nextToken());
			
			node[i] = new Node(name,a,b,c);
		}
		Arrays.sort(node);
		
		for(int i=0; i<n; i++) {
			System.out.println(node[i].name);
		}
		
	}//main
 	 
}// class

class Node implements Comparable<Node>{
	String name;
	int kor,eng,mat;
	public Node(String name, int kor, int eng, int mat) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.mat = mat;
	}
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.kor < o.kor)return 1;
		else if(this.kor> o.kor)return -1;
		else {
			if(this.eng > o.eng)return 1;
			else if(this.eng < o.eng)return -1;
			else {
				if(this.mat < o.mat)return 1;
				else if(this.mat > o.mat)return -1;
				else {
					
					return this.name.compareTo(o.name);
				}
			}
		}
	}
	
	
}