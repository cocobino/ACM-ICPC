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
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static StringTokenizer st;

   static int n;
   static int map[][];
   static boolean visit[][];

   static int dx[] = { 0, 0, 1, -1 };
   static int dy[] = { 1, -1, 0, 0 };

   static Node shark;
   static int sharksize = 2;
   static int fishea = 0;

   public static void main(String[] args) throws NumberFormatException, IOException {
      n = Integer.parseInt(br.readLine());

      map = new int[n][n];
      visit = new boolean[n][n];

      for (int i = 0; i < n; i++) {
         st = new StringTokenizer(br.readLine());
         for (int j = 0; j < n; j++) {
            int tmp = Integer.parseInt(st.nextToken());
            if (tmp == 9) {
               shark = new Node(i, j, 2);
            } else if (tmp >= 1 && tmp <= 6) {
               fishea++;
               map[i][j] = tmp;
            } else
               map[i][j] = tmp;
         }
      } // insert

      // sol : bfs

      Queue<Node> q = new LinkedList<>();
      q.add(shark);
      boolean flag = false;
      int time = 0;
      while (!q.isEmpty() || fishea != 0) {

         Node cur = q.poll();
         int x = cur.x;
         int y = cur.y;
         int dist[][] = dist(x, y, cur.size);
         ArrayList<Node> fish[] = new ArrayList[n * n];
         for (int i = 0; i < fish.length; i++)
            fish[i] = new ArrayList<>();

         for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
               if (dist[i][j] == Integer.MAX_VALUE)
                  continue;
               if (map[i][j] < sharksize && map[i][j] != 0 && map[i][j] != 9) {
                  // idx 거리에 먹을수있는 고기가가 있음
                  fish[dist[i][j]].add(new Node(i, j, map[i][j]));
               }
            }
         }

         // 2. fish[0~ 부터 탐색해서 최소 거리있는 고기먹기
         flag=false;
         for (int i = 0; i < fish.length; i++)
            Collections.sort(fish[i]);
         int i;
         for (i = 0; i < fish.length; i++) {
            if (fish[i].size() != 0) {
               time += dist[fish[i].get(0).x][fish[i].get(0).y];
               fishea--;
               flag=true;
               map[fish[i].get(0).x][fish[i].get(0).y]=0;
               
               if(cur.size-1 == 0) {
            	   sharksize++;
            	   q.add(new Node(fish[i].get(0).x, fish[i].get(0).y, sharksize));
            	   flag=true;
               }else {
               q.add(new Node(fish[i].get(0).x, fish[i].get(0).y, cur.size -1));
               flag=true;
               }
               
               break;
            }
         }
         if(!flag)break;
          
         
      } // while loop : bfs

      bw.write(String.valueOf(time));
      bw.flush();
   }// main

   private static int[][] dist(int x, int y, int size) {
      // TODO Auto-generated method stub
      Queue<Node> q = new LinkedList<>();
      int dist[][] = new int[n][n];
      q.add(new Node(x, y, size));
      for (int i = 0; i < n; i++)
         Arrays.fill(dist[i], Integer.MAX_VALUE);
      dist[x][y] = 0;
      while (!q.isEmpty()) {
         Node cur = q.poll();

         for (int i = 0; i < 4; i++) {
            int nx = cur.x + dx[i];
            int ny = cur.y + dy[i];

            if (inrage(nx, ny) && dist[nx][ny] > dist[cur.x][cur.y] + 1) {
               if (map[nx][ny] == 0) {
                  dist[nx][ny] = dist[cur.x][cur.y] + 1;
                  q.add(new Node(nx, ny, cur.size));
               } else if (map[nx][ny] != 0 && map[nx][ny] <= sharksize) {
                  dist[nx][ny] = dist[cur.x][cur.y] + 1;
                  q.add(new Node(nx, ny, cur.size));
               }
            }
         }
      }

      return dist;
   }

   private static boolean inrage(int nx, int ny) {
      // TODO Auto-generated method stub
      if (nx >= 0 && ny >= 0 && nx < n && ny < n)
         return true;
      return false;
   }

}// class

class Node implements Comparable<Node> {
   int x, y, size;

   public Node(int x, int y, int size) {
      this.x = x;
      this.y = y;
      this.size = size; 
   }

   @Override
   public int compareTo(Node o) {
      // TODO Auto-generated method stub
      if (this.x > o.x)
         return 1;
      else if (this.x < o.x)
         return -1;
      else {
         if (this.y > o.y)
            return 1;
         else if (this.y < o.y)
            return -1;
         else
            return 0;
      }
   }

}