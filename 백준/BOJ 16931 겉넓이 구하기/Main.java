import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
   static class Node {
      int r;
      int c;

      public Node(int r, int c) {
         this.r = r;
         this.c = c;
      }
   }

   public static void main(String[] args) throws IOException {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      char[][] map = new char[8][8];

      for (int i = 0; i < 8; i++) {
         String str = br.readLine();
         map[i] = str.toCharArray();
      }
      // 캐릭터 출발 위치 : (7,0), 도착위치: (0,7)
      ans = -1;
      q = new LinkedList<>();
      q2 = new LinkedList<>();
      q.add(new Node(7, 0));
      function(map);
      System.out.println(ans);
   }

   static Queue<Node> q;
   static Queue<Node> q2;
   static int[] dx = { -1, 0, 0, -1, -1 }; // 상,좌,우,오른쪽 대각선,왼쪽대각선
   static int[] dy = { 0, -1, 1, 1, -1 };
   static int ans;

   public static void function(char[][] map) {
      int rx = -1;
      int ry = -1;
      while (!q.isEmpty()) {
    	 int qsize= q.size();
    	  for(int size=0; size<qsize; size++) {
         Node n = q.poll();
         rx = n.r;
         ry = n.c;
         if (map[n.r][n.c] == '#') {
            continue;
         }
         if (rx == 0 && ry == 7) {
            ans = 1;
            return;
         }

         for (int i = 0; i < 5; i++) {
            int x = n.r + dx[i];
            int y = n.c + dy[i];

            if (isRange(x, y) && map[x][y] != '#') {
               q2.add(new Node(x, y));
            }
         }
    	  }
      }
      // 맵이 한칸씩 아래로 이동
      map = wallDown(map);
      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
            System.out.print(map[i][j]);
         }
         System.out.println();
      }
      System.out.println();
      if (!q2.isEmpty()) {
         int len = q2.size();
         for (int i = 0; i < len; i++) {
            q.add(q2.poll());
         }
         function(map);
      }
      if (rx == 0 && ry == 7) {
         ans = 1;
         return;
      } else {
         if (ans != 1)
            ans = 0;
         return;
      }

   }

   public static char[][] wallDown(char[][] map) {
      char[][] newMap = new char[8][8];

      for (int i = 0; i < 8; i++) {
         for (int j = 0; j < 8; j++) {
            if (i == 0)
               newMap[i][j] = '.';
            else {
               newMap[i][j] = map[i - 1][j];
            }
         }
      }
      return newMap;
   }

   public static boolean isRange(int x, int y) {
      return x >= 0 && y >= 0 && x < 8 && y < 8;
   }
}