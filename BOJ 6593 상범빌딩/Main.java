import java.util.*;
public class Main {
    static int l, r, c;
    static int[] dx = {-1,1,0,0,0,0}, dy = {0,0,-1,1,0,0}, dz = {0,0,0,0,-1,1};
    static char[][][] a;
    static int[][][] d;
    static Point end = null, start = null;
    public static void go(){
        Queue<Point> q = new LinkedList<>();
        q.add(start);
         
        while(!q.isEmpty()){
            Point now = q.poll();
            int x = now.x;
            int y = now.y;
            int z = now.z;
             
            for(int i=0; i<6; i++){
                int nx = x + dx[i];
                int ny = y + dy[i];
                int nz = z + dz[i];
                if(nx<0 || nx>=r || ny<0 || ny>=c || nz<0 || nz>=l) continue;
                if(a[nz][nx][ny]=='#')continue;
                if(d[nz][nx][ny]!=0) continue;
 
                q.add(new Point(nz,nx,ny));
                d[nz][nx][ny] = d[z][x][y]+1;
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
         
        while(true){
            l = in.nextInt();
            r = in.nextInt();
            c = in.nextInt();
            if(l==0 && r==0 && c==0)
                break;
            a = new char[31][31][31];
            d = new int[31][31][31];
            for(int i=0; i<l; i++){
                for(int j=0; j<r; j++){
                    String temp = in.next();
                    for(int k=0; k<c; k++){
                        a[i][j][k] = temp.charAt(k);
                        if(a[i][j][k]=='S'){
                            start = new Point(i,j,k);
                        }
                        if(a[i][j][k]=='E')
                            end = new Point(i,j,k);
                    }
                }
            }
            go();
             
            int ans = d[end.z][end.x][end.y];
            if(ans==0) System.out.println("Trapped!");
            else System.out.println("Escaped in " + ans + " minute(s).");
        }
        in.close();
    }
    public static class Point{
        int x, y, z;
        public Point(int z, int x, int y){
            this.x = x;
            this.y = y;
            this.z = z;
        }
    }
}


ÃâÃ³: http://suriisurii.tistory.com/7 [surisuri]