import java.awt.Point;
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
import java.util.Scanner;
import java.util.StringTokenizer;
	import java.util.concurrent.SynchronousQueue; 
	
	
	public class Main {

		
		
		static char arr[][];
		static boolean fourchk[][];
		static boolean chk[][];
		
		static int dx[] = {0,0,-1,1};
		static int dy[] = {1,-1,0,0};

		
		
		 public static void main(String[] args) throws IOException {
			 	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
			 	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			 	
			 	arr= new char[12][6];
			 	fourchk = new boolean[12][6];
			 	chk = new boolean[12][6];
			 	
			 	for(int i=0; i<12;i ++) {
			 		String a =br.readLine();
			 		for(int j=0; j<6; j++){
			 			arr[i][j] = a.charAt(j);
			 		}
			 	}
			 	
			 	int cnt=0;
			 	while(true) {
			 		for(int i=0; i<12; i++) {
			 			Arrays.fill(fourchk[i], false);
			 			Arrays.fill(chk[i], false);
			 		}
			 		
			 		int nblock = bfs();
			 		if(nblock>=4) {
			 			cnt++;
			 			updatest();
			 		}else if(nblock ==0) {
			 			break;
			 		}
			 		
			 	}
			 	
			 	bw.write(String.valueOf(cnt));
			 	bw.flush();
		}



		private static void updatest() { 
			// TODO Auto-generated method stub
			Queue<Character> q = new LinkedList<Character>();
			
			for(int i=0; i<6; i++) {
				for(int j=11; j>=0; j--) {

					if(!fourchk[j][i])q.add(arr[j][i]); //해당줄 방문하지않은 칸 .을q에 저장
					// i가 0일때 끝에 true가 2개이므로 9개만 . 저장
					
				}
				for(int j=11; j>=0; j--) {
					if(!q.isEmpty())arr[j][i] = q.poll(); // i가 0일때 11번째 부터 .을 붙여줌 R 제거됨
					else arr[j][i]='.'; //
				}
			}
		}



		private static int bfs() {
			// TODO Auto-generated method stub
			int nblocks =0;
			for(int i=0; i<12; i++){
				for(int j=0; j<6; j++) {
					
					if(chk[i][j])continue; //방문했었으면 
					if(arr[i][j]=='.')continue; // .이면
					
					int conn = 0; // 연결 개수 카운팅
					Queue<Node> q = new LinkedList<Node>(); 
					Queue<Node> stored = new LinkedList<Node>();
					q.add(new Node(i,j)); 
					stored.add(new Node(i,j));
					
					chk[i][j]=true; // 저장한노드 방문표시
					conn++; // 연결횟수 ++;
					
					while(!q.isEmpty()) {
						Node curNode = q.poll();
						
						for(int k=0; k<4; k++) {
							int nx = curNode.x + dx[k];
							int ny = curNode.y + dy[k];
							
							if(nx<0 || ny<0 || nx>=12 || ny>=6)continue; //배열범위 벗어날시
							if(chk[nx][ny])continue; // 방문할 배열이 이미 방문했을시
							if(arr[nx][ny] != arr[curNode.x][curNode.y])continue;// 연속되는색이아닐시
							
							q.add(new Node(nx,ny)); // 위조건만족하면 다음큐 진행
							stored.add(new Node(nx,ny)); // 연속되는 색상 저장
							chk[nx][ny]=true; // 다음노드 방문표시
							conn++; // 연결개수 ++
						}
					}
					if(conn>=4) { //연결개수가 4개이상넘어가면
						nblocks += conn;
						while(!stored.isEmpty()) { //저장된노드를 다뺴서 
							Node cur = stored.poll();
							fourchk[cur.x][cur.y]=true; //4연속 chklist에 true표시
						}
					}
					
				}
			}
			
			
			return nblocks;
		}
		}
	
	class Node{
		int x,y;
		public Node(int x, int y) {
			// TODO Auto-generated constructor stub
			this.x =x;
			this.y =y;
			
		}
	}
