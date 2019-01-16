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
	 
	
	static int r,c;
	static char map[][];
	static int rst[][];
	static boolean visit[][];
	
	
	static int dx[] = {0,0,1,-1}; //우,좌,하,상
	static int dy[] = {1,-1,0,0};
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		//사진 틀 개수
	 int n = Integer.parseInt(br.readLine());
	 	//총 추천 횟수
	 int k = Integer.parseInt(br.readLine());
	 
	ArrayList<Node> photo = new ArrayList<Node>();
	 
	st = new StringTokenizer(br.readLine());
	for(int i=0; i<k; i++) {
		//추천학생
		int num = Integer.parseInt(st.nextToken());
		 
		//사진이 n개 이하로 걸렸으면
		if(photo.size()<n) {
			//중복검사
			boolean flag= false;
			for(int j=0; j<photo.size(); j++) {
				if(photo.get(j).num == num) {
					photo.get(j).cnt++;
					flag=true;
					break;
				}
			}
			
			if(flag)continue;
			//중복 안되면 더해주기
			photo.add(new Node(num,1));

		}
		//사진 n개 이상으로 걸렸으면
		else if(photo.size()>=n) {
			// 1. 이미 있다면 추천수 올려주기
			boolean flag=false;
			for(int j=0; j<photo.size(); j++) {
				if(photo.get(j).num == num) {
					photo.get(j).cnt+=1;
					flag=true;
					break;
				}
			}
			if(flag)continue;
			
			//2. 사진이 없다면 추천순이 제일낮고, 인덱스 제일 빠른것 제거하기
			int min=Integer.MAX_VALUE,cnt=0;
			for(int j=0; j<photo.size(); j++) {
				min = Math.min(min, photo.get(j).cnt);
			}
			for(int j=0; j<photo.size(); j++) {
				if(min == photo.get(j).cnt) {
					photo.remove(j);
					photo.add(new Node(num,1));
					flag=true;
					break;
				}
			}
			if(flag)continue;
			
		}
		
		
	}// loop : 학생 
	
	Collections.sort(photo);
	
	
	for(int i=0; i<photo.size(); i++) {
		bw.write(String.valueOf(photo.get(i).num +" "	));
	}
	bw.flush();
	}//main 
 
}// classg
 
class Node implements Comparable<Node>{
	int num,cnt;
	public Node(int num, int cnt) {
		// TODO Auto-generated constructor stub
		this.num = num;
		this.cnt = cnt;
	}
	
	@Override
	public int compareTo(Node o) {
		// TODO Auto-generated method stub
		if(this.num == o.num)return 0;
		return this.num < o.num ? -1 : 1;
	}
}