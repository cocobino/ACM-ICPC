package com.ssafy.java;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	
	static int n,m;
	static LinkedList<Node> tree[];
	static boolean visit[];
	static boolean flag;
	
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//input
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		
		tree = new LinkedList[n+1];
		for(int i=0; i<=n; i++)tree[i] =new LinkedList<>();
		
		//employee
		for(int man=1; man<=n; man++) {
			if(man==1) {
				int pay =Integer.parseInt(br.readLine());
				tree[man].add(new Node(pay,0));
			}
			// man>1
			else {
				st = new StringTokenizer(br.readLine());
				int pay = Integer.parseInt(st.nextToken());
				int from = Integer.parseInt(st.nextToken());
				tree[man].add(new Node(pay, from));
			}
		} // for loop : employee
		
		//Query
		for(int i=0; i<m; i++) {
			st = new StringTokenizer(br.readLine());
			char a = st.nextToken().charAt(0);
			if(a=='p') {
				int cur = Integer.parseInt(st.nextToken());
				int pay = Integer.parseInt(st.nextToken());
				
				//아래서부터 탐색 -> cur 사람을 만나는지 확인하기
				for(int man=n; man>=1; man--) {
					visit = new boolean[n+1];
					visit[man]=true;
					flag= false;
					
					find(man,cur);
					if(flag) {
						modify(pay);
						break;
					}
				}
				
			}
			else if(a=='u') {
				int cur = Integer.parseInt(st.nextToken());
				
				int debug = tree[cur].get(0).cost;
				
				bw.write(String.valueOf(tree[cur].get(0).cost));
				bw.newLine();
			}
			
			
			
		}// for loop : emplyee
		
		bw.flush();
	} // main
	
	
	private static void modify(int pay) {
		// TODO Auto-generated method stub
		
		for(int i=1; i<=n ;i++) {
		if(visit[i]) { // 방문한 곳은 월급 수정	
			int tmpcost = tree[i].get(0).cost +pay;
			int tmpcur = tree[i].get(0).to;
			
			tree[i].remove();
			tree[i].add(new Node(tmpcost,tmpcur));
			}
		
		
		}
		
		
	}// func : modify ( visit == true -> cost +pay 
	


	private static void find(int man, int des) {
		// TODO Auto-generated method stub
		if(man==des) {
			flag=true;
			return;
		}// 상사를 만나면 visit true 인 값 수정
		
		visit[man]=true;
		for(int i=0; i<tree[man].size(); i++) {	
			if(!visit[tree[man].get(i).to])find(tree[man].get(i).to, des);
		}
		
		
		
	}// func : dfs
 

	 
} //main class


class Node{
	int cost,to;
	public Node(int cost, int to) {
		// TODO Auto-generated constructor stub
		this.cost=cost;
		this.to=to;
	}
}