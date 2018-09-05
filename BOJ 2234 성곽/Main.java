import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
 
/**
 * BFS
 */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[][] map = new int[M+1][N+1];
 
        for (int i=1; i<=M; i++) {
            st = new StringTokenizer(br.readLine());
            for (int j=1; j<=N; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
        CastleWall castleWall = new CastleWall(map, N, M);
        System.out.println(castleWall.roomCount());
        System.out.println(castleWall.maxRoomArea());
        System.out.println(castleWall.sumRoomArea());
        br.close();
    }
 
    static class CastleWall {   //³², µ¿, ºÏ, ¼­
        private final int[] Y = {0, 1, 0, -1};
        private final int[] X = {1, 0, -1, 0};
        private final int[] WALL = {8, 4, 2, 1};
        private int[][] map;
        private int[][] room;
        private int N, M;
        private ArrayList<Integer> roomSize = new ArrayList<>();
 
        public CastleWall(int[][] map, int N, int M) {
            this.map = map;
            this.N = N + 1;
            this.M = M + 1;
        }
 
        public int roomCount() {
            boolean[][] visited = new boolean[M][N];
            room = new int[M][N];
            int count = 1;
            for (int i=1; i<M; i++) {
                for (int j=1; j<N; j++) {
                    if (room[i][j] == 0) {
                        roomSize.add(bfs(visited, room, count++, i, j));
                    }
                }
            }
            int max = Integer.MIN_VALUE;
            for (int i=1; i<M; i++) {
                for (int j=1; j<N; j++) {
                    max = Math.max(max, room[i][j]);
                }
            }
            return max;
        }
 
        private int bfs(boolean[][] visited, int[][] room, int count, int x, int y) {
            Queue<Pair> queue = new LinkedList<>();
            queue.offer(new Pair(x, y));
            visited[x][y] = true;
            room[x][y] = count;
            int size = 1;
 
            while (!queue.isEmpty()) {
                Pair pair = queue.poll();
                for (int i=0; i<4; i++) {
                    if (!isWall(map[pair.getX()][pair.getY()], i)) {
                        int adj_x = pair.getX() + X[i];
                        int adj_y = pair.getY() + Y[i];
                        if (adj_x > 0 && adj_y > 0 && adj_x < M && adj_y < N) {
                            if (!visited[adj_x][adj_y]) {
                                visited[adj_x][adj_y] = true;
                                room[adj_x][adj_y] = count;
                                queue.offer(new Pair(adj_x, adj_y));
                                size++;
                            }
                        }
                    }
                }
            }
            return size;
        }
 
        private boolean isWall(int num, int i) {
//            System.out.println(num+", "+WALL[i]+", "+(num & WALL[i]));
            if ((num & WALL[i]) > 0) {
                return true;
            }
            return false;
        }
 
        public int maxRoomArea() {
            return Collections.max(roomSize);
        }
 
        public int sumRoomArea() {
            int max = Integer.MIN_VALUE;
            for (int i=1; i<M; i++) {
                for (int j=1; j<N; j++) {
                    for (int k=0; k<4; k++) {
                        int adj_x = i + X[k];
                        int adj_y = j + Y[k];
                        if (adj_x > 0 && adj_y > 0 && adj_x < M && adj_y < N) {
                            int n1 = room[i][j];
                            int n2 = room[adj_x][adj_y];
                            if (n1 != n2) {
                                int sum = roomSize.get(n1 - 1) + roomSize.get(n2 - 1);
                                max = Math.max(max, sum);
                            }
                        }
                    }
                }
            }
            return max;
        }
    }
 
    static class Pair {
        private int x, y;
 
        public Pair(int x, int y) {
            this.x = x;
            this.y = y;
        }
 
        public int getX() {
            return x;
        }
 
        public int getY() {
            return y;
        }
    }
}
