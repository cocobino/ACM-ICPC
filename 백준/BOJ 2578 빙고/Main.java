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
	 
	static int dx[] = {-1,1,0,0,1,-1,-1,1}; //상, 하 , 좌 , 우
	static int dy[] = {0,0,-1,1,1,1,-1,-1};
	 						  //오른위(4), 오른아래(5), 왼위(6), 왼아래(7)
	static int map[][], com[];
	static boolean visit[][];
	
	static boolean flag=false;
	static int bingo=0;
	
	static ArrayList<ArrayList<ArrayList<Integer>>> bing = new ArrayList<>();	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		
		map = new int [5][5];
		com = new int[26];
		visit = new boolean[5][5];
		for(int i=0; i<5; i++) {
			bing.add(new ArrayList<>());
			for(int j=0; j<5; j++) {
				bing.get(i).add(new ArrayList<>());
			}
		}
		
		
	for(int i=0; i<5; i++) {
		st = new StringTokenizer(br.readLine());
		for(int j=0; j<5; j++) {
			map[i][j]= Integer.parseInt(st.nextToken());
		}
	}//insert
	
	for(int i=1; i<=25; i++) {
		if(i%5==1)st = new StringTokenizer(br.readLine());
		com[i] = Integer.parseInt(st.nextToken());
	}//insert
	 
	// sol
	//1. 같은위치찾기
	for(int k=1; k<=25; k++) {
		for(int i=0; i<5; i++) {
			for(int j=0; j<5; j++) {
				if(map[i][j] == com[k]) {
					//해당 인덱스 마킹해주기
					visit[i][j]=true;
					
					findbingo();
					if(flag) {
						bw.write(String.valueOf(k));
						bw.flush();
						System.exit(0);
					}
				}
			}
		}
	}
			
	}//main
	private static void findbingo() {
		// TODO Auto-generated method stub
		bingo=0;
		//r
		for(int i=0; i<5; i++) {
			int cnt=0;
			for(int j=0; j<5; j++) {
				if(visit[i][j]) {
					cnt++;
				}
				if(cnt==5) {
					bingo++;
					if(bingo==3) {
						flag=true;
						return;
					}
				}
				
			}
		}
		
		//c
		for(int i=0; i<5; i++) {
			int cnt=0;
			for(int j=0; j<5; j++) {
				if(visit[j][i]) {
					cnt++;
				}
				if(cnt==5) {
					bingo++;
					if(bingo==3) {
						flag=true;
						return;
					}
				}
			}
		}
		//x
		int cnt=0;
		for(int i=0; i<5; i++) {
			if(visit[i][i]) {
				cnt++;
			}
		}
		if(cnt==5) {
			bingo++;
			if(bingo==3) {
				flag=true;
				return;
			}
		}
		
		
		cnt=0;
		for(int i=0; i<5; i++) {
			if(visit[i][4-i]) {
				cnt++;
			}
		}
		if(cnt==5) {
			bingo++;
			if(bingo==3) {
				flag=true;
				return;
			}
		}
	}
 
 
 
 
}//class
 