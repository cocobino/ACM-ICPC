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
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static int n,r;
   static String map[][], rst[][];   
   static boolean visit[][],wrvisit[][];
   
   
   
   static int dx[] = {0,1,0,-1}; //��, ��, �� , ��
   static int dy[] = {1,0,-1,0}; // �ݽð� 
   
   static int udx[] = {1,0,-1,0}; //�� �� �� ��
   static int udy[] = {0,1,0,-1}; // �� ��
   
   static LinkedList<String> q;
   	
    public static void main(String[] args) throws IOException {
       st = new StringTokenizer(br.readLine());
       
       n = Integer.parseInt(st.nextToken()); // �迭ũ��
       r = Integer.parseInt(st.nextToken()); // ȸ����
       
       map = new String[n][n];
       visit = new boolean[n][n];
       rst = new String[n][n];
       wrvisit = new boolean[n][n];
       
       for(int i=0; i<n; i++)Arrays.fill(rst[i], ".");
       
       for(int i=0; i<n; i++) {
          st = new StringTokenizer(br.readLine());
          for(int j=0; j<n; j++) {
             map[i][j] = st.nextToken();
          }
       }//insert
       
       
       //r�� ����ϰ�� �ٱ� �ð� ȸ��
       if(r>=0) {
          for(int i=0; i<n/2; i=i+2) {
               q = new LinkedList<>();
               //1. �ݽð�������� Ž������ LinkedList�� ����ֱ� 
               dfs(i,i,0);
               //2. LinkedList r��ŭ ȸ��
               for(int j=0; j<r; j++) {
                  q.addFirst(q.removeLast());
               }
               //3. ���������� �ٽ� �ѷ��ֱ�
               write(i,i,0);
            }
          
          for(int i=1; i<=n/2; i=i+2) {
               q = new LinkedList<>();
               // 1. �ð���� Ž��
               undfs(i,i,0);
               //2. r��ŭ �ݴ�� ȸ��
               for(int j=0; j<r; j++)q.addFirst(q.removeLast());
               //3. ������ �ٽ� �Ѹ���
               unwrite(i,i,0);
       }
          
          
       }
       else if(r<0) {
         r *=-1; 
         
          
          for(int i=0; i<n/2; i=i+2) {
               q = new LinkedList<>();
               // 1. �ð���� Ž��
               undfs(i,i,0);
               //2. r��ŭ �ݴ�� ȸ��
               for(int j=0; j<r; j++)q.addFirst(q.removeLast());
               //3. ������ �ٽ� �Ѹ���
               unwrite(i,i,0);
       }
          
          for(int i=1; i<=n/2; i=i+2) {
               q = new LinkedList<>();
               //1. �ݽð�������� Ž������ LinkedList�� ����ֱ� 
               dfs(i,i,0);
               //2. LinkedList r��ŭ ȸ��
               for(int j=0; j<r; j++) {
                  q.addFirst(q.removeLast());
               }
               //3. ���������� �ٽ� �ѷ��ֱ�
               write(i,i,0);
            }
          
         
       }
              
       for(int i=0; i<n; i++) {
          for(int j=0; j<n; j++) {
             bw.write(String.valueOf(rst[i][j] +" "));
          }
          bw.write("\n");
       }
       
       bw.flush();
    }//main

    
    private static void unwrite(int x, int y, int dir) {
      // TODO Auto-generated method stub
       if(dir==4)return;

         wrvisit[x][y] = true;
         if(rst[x][y].equals(".")) {
            rst[x][y]=q.poll();
         }
         int nx = x +udx[dir];
         int ny = y +udy[dir];
         
         if(nx <0 || ny<0 || nx>=n || ny>=n || wrvisit[nx][ny]) {
            unwrite(x,y,dir+1);
         }else unwrite(nx,ny,dir);
   }


   //�ð���� Ž��
    private static void undfs(int x, int y, int dir) {
      // TODO Auto-generated method stub
       if(dir==4)return;
         visit[x][y]=true;;
         if(!q.contains(map[x][y]))q.add(map[x][y]);
         
         int nx = x +udx[dir];
         int ny = y +udy[dir];
         
         if(nx<0 || ny < 0 || nx>=n || ny>=n || visit[nx][ny]) {
            
            undfs(x,y,dir+1);
         }
         else undfs(nx,ny,dir);
         
   }

    
    //�ݽð�� ����
   private static void write(int x, int y, int dir) {
      // TODO Auto-generated method stub
      if(dir==4)return;
      //if(wrvisit[x][y])return;
      wrvisit[x][y] = true;
      if(rst[x][y].equals(".")) {
         rst[x][y]=q.poll();
      }
      int nx = x +dx[dir];
      int ny = y +dy[dir];
      
      if(nx <0 || ny<0 || nx>=n || ny>=n || wrvisit[nx][ny]) {
         write(x,y,dir+1);
      }else write(nx,ny,dir);
   }

   //�ݽð� Ž��
   private static void dfs(int x, int y, int dir) {
      // TODO Auto-generated method stub
      if(dir==4)return;
      visit[x][y]=true;;
      if(!q.contains(map[x][y]))q.add(map[x][y]);
      
      int nx = x +dx[dir];
      int ny = y +dy[dir];
      
      if(nx<0 || ny < 0 || nx>=n || ny>=n || visit[nx][ny]) {
         
         dfs(x,y,dir+1);
      }
      else dfs(nx,ny,dir);
      
   }
   
}// class
 