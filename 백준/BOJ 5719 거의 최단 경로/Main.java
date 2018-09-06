import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.StringTokenizer;

 

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            if (N == 0 && M == 0) break;
            st = new StringTokenizer(br.readLine());
            int S = Integer.parseInt(st.nextToken());
            int D = Integer.parseInt(st.nextToken());
            ArrayList<ArrayList<Graph>> map = new ArrayList<>();
            ArrayList<ArrayList<Graph>> reverseMap = new ArrayList<>();
            for (int i=0; i<N; i++) {
                map.add(new ArrayList<>());
                reverseMap.add(new ArrayList<>());
            }
            for (int i=0; i<M; i++) {
                st = new StringTokenizer(br.readLine());
                int U = Integer.parseInt(st.nextToken());
                int V = Integer.parseInt(st.nextToken());
                int P = Integer.parseInt(st.nextToken());
                map.get(U).add(new Graph(V, P));
                reverseMap.get(V).add(new Graph(U, P));
            }
            Navigation navigation = new Navigation(map, reverseMap, N, S, D);
            bw.write(String.valueOf(navigation.getAlmostShortestPath()+"\n"));
        }
        bw.flush();
        br.close();
    }
 
    static class Navigation {
        private ArrayList<ArrayList<Graph>> map;
        private ArrayList<ArrayList<Graph>> reverseMap;
        private int[] distance;
        private boolean[][] visited;
        private int start, end;
 
 
        public Navigation(ArrayList<ArrayList<Graph>> map, ArrayList<ArrayList<Graph>> reverseMap, int N, int start, int end) {
            this.map = map;
            this.reverseMap = reverseMap;
            this.distance = new int[N];
            this.visited = new boolean[N][N];
            this.start = start;
            this.end = end;
        }
 
        public int getAlmostShortestPath() {
            getShortestPath();
            removeShortestPath();
            getShortestPath();
            return (distance[end] >= Integer.MAX_VALUE) ? -1 : distance[end];
        }
 
        private void getShortestPath() {
            Arrays.fill(distance, Integer.MAX_VALUE);
            PriorityQueue<Graph> pq = new PriorityQueue<>();
            distance[start] = 0;
            pq.offer(new Graph(start, distance[start]));
 
            while (!pq.isEmpty()) {
                Graph g = pq.poll();
                int v = g.getV();
                int p = g.getP();
                if (distance[v] >= p) {
                    for (Graph graph : map.get(v)) {
                        int adj_v = graph.getV();
                        int adj_p = graph.getP();
                        if (distance[adj_v] > distance[v] + adj_p && !visited[v][adj_v]) {
                            distance[adj_v] = distance[v] + adj_p;
                            pq.offer(new Graph(adj_v, distance[adj_v]));
                        }
                    }
                }
            }
        }
 
        private void removeShortestPath() {
            Queue<Integer> queue = new LinkedList<>();
            queue.offer(end);
            while (!queue.isEmpty()) {
                int now = queue.poll();
                if (now != start) {
                    for (Graph g : reverseMap.get(now)) {
                        if (distance[now] == distance[g.getV()] + g.getP()) {
                            visited[g.getV()][now] = true;
                            queue.offer(g.getV());
                        }
                    }
                }
            }
        }
    }
 
    static class Graph implements Comparable<Graph> {
        private int v, p;
 
        public Graph(int v, int p) {
            this.v = v;
            this.p = p;
        }
 
        public int getV() {
            return v;
        }
 
        public int getP() {
            return p;
        }

        @Override
        public int compareTo(Graph o) {
            return this.p >= o.p ? 1 : -1;

		}
    }
}