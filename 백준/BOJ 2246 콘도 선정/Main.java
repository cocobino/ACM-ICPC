import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	
	static int n,m;
	static char map[][];
	static int rst[][];
	static boolean visit[][];
	
	
	static int dx[] = {0,0,1,-1}; //우,좌,하,상
	static int dy[] = {1,-1,0,0};
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub

	st = new StringTokenizer(br.readLine());
	
	n = Integer.parseInt(st.nextToken()); //콘도 개수
	
	ArrayList<Node> arr = new ArrayList<>();
	
	for(int i=0; i<n; i++) {
		st =new StringTokenizer(br.readLine());
		int d = Integer.parseInt(st.nextToken());//거리
		int p = Integer.parseInt(st.nextToken());//가격
		
		arr.add(new Node(d,p));
	}//insert
	
	int cnt=0;
	
	for(int i=0; i<n; i++) {
		boolean chk=false;
		for(int j=0; j<n; j++) {
			if(i !=j) {
			if(arr.get(i).dist>arr.get(j).dist) {
				if(arr.get(i).price >= arr.get(j).price) {
					chk=true;
					break;
				}
			}
			else if(arr.get(i).price > arr.get(j).price) {
				if(arr.get(i).dist >= arr.get(j).dist) {
					chk=true;
					break;
				}
			}
			}
		}
		if(!chk)cnt++;
	}
	
	bw.write(String.valueOf(cnt));
	bw.flush();
	
	}//main 
 
}// classg

class Node{
	int dist,price;
	public Node(int dist, int price) {
		// TODO Auto-generated constructor stub
		this.dist =dist;
		this.price=price;
	}
}
  