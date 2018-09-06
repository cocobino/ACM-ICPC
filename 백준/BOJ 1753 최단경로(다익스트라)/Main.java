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
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
		
		
		
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int V = Integer.parseInt(st.nextToken());// 정점의 개수
        int E = Integer.parseInt(st.nextToken()); // 간선의 개수
        int startNode = Integer.parseInt(br.readLine()); // 시작노드
        
        int dist[] = new int[V+1];
        boolean visit[] = new boolean[V+1];
        
        ArrayList<Node> arr[] = new ArrayList[V+1];
        for(int i=0; i<=V; i++) {
        	arr[i] = new ArrayList<>();
        }
        Arrays.fill(dist, Integer.MAX_VALUE);
        
        for(int i=0; i<E; i++) {
        	st = new StringTokenizer(br.readLine());
        	int a = Integer.parseInt(st.nextToken());
        	int b = Integer.parseInt(st.nextToken());
        	int w = Integer.parseInt(st.nextToken());
        	
         arr[a].add(new Node(b,w));
        }
        
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
        pq.add(startNode);
        dist[startNode]=0;
        
        while(!pq.isEmpty()) {
        	int cur = pq.poll();
        	visit[cur]= true;
        	for(int i=0; i<arr[cur].size(); i++) {
        		int next = arr[cur].get(i).end;
        		int value = arr[cur].get(i).value;
        		
        		if(dist[next] > dist[cur] + value) {
        			dist[next]= Math.min(dist[next], value+dist[cur]);
        			pq.add(next);
        		}
        	}
        	
        }
        for(int i=1; i<=V; i++) {
        	if(visit[i]) {
        		bw.write(String.valueOf(dist[i]+"\n"));
        	}else
        		bw.write(String.valueOf("INF"+"\n"));
        }
        
        bw.flush();
    }
}

class Node {
	int end, value;
	public Node(int end, int value) {
		// TODO Auto-generated constructor stub
		this.end = end;
		this.value = value;
		
	}
}