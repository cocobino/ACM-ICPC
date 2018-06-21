import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;


public class Main{
		public static LinkedList<Integer> arr[]; //인접리스트 그래프
		public static int n, indegree[];
		
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
			
		StringTokenizer st= new StringTokenizer(br.readLine());
		int i, from, to, m;
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		
		indegree = new int[n];
		arr = new LinkedList[n];
		
		for( i=0; i<n; i++)arr[i] = new LinkedList<>();
		for(i=0; i<m; i++) {
			st= new StringTokenizer(br.readLine());
			
			from = Integer.parseInt(st.nextToken())-1;
			to = Integer.parseInt(st.nextToken())-1;
			
			arr[from].add(to);
			indegree[to]++;
		}
		
		topologicalSort();
	}


	private static void topologicalSort() throws IOException {
		// TODO Auto-generated method stub
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Queue<Integer> searchQ = new LinkedList<>();
		Queue<Integer> resultQ = new LinkedList<>();
		
		for(int i=0; i<n; i++) {
			if(indegree[i]==0)
				searchQ.offer(i);
		}
		
		while(!searchQ.isEmpty()) {
			// 진입노드가 0인ㄷ 노드와 연결된 노트 탐색
			int zeroIndegreeNode = searchQ.poll();
			resultQ.offer(zeroIndegreeNode);
			for( int linkedNode : arr[zeroIndegreeNode]) { //진입노드 0 정렬완료->결과큐 삽입
				
				// 진입노드가 0인 노드들을 제거하므로 연결되어있던 노드들의 차수 -1
				indegree[linkedNode]--;
				
				if(indegree[linkedNode]==0)//연결된 노드 진입차수 수정결과 0
					searchQ.offer(linkedNode);//추후 탐색을 위해 탐색큐 삽입
			}
		}
		while(!resultQ.isEmpty()) {
			bw.write(String.valueOf(((resultQ.poll()+1)+" ")));
		}
		bw.flush();
	}
}
