import java.util.Arrays;
import java.util.Scanner;
 
public class Main{
    static int paper[][];
    static int dx[]= {0,0,1,-1};
    static int dy[]= {1,-1,0,0};
    static int m;
    static int n;
    static int result[];
    
    static void paint(int i, int j, int wid_num) {
        paper[i][j] = wid_num;
        result[wid_num]++;
        for(int ar=0;ar<4;ar++) {
            if(i+dx[ar]>=0 && i+dx[ar]<m && j+dy[ar]>=0 && j+dy[ar]<n) {
                if(paper[i+dx[ar]][j+dy[ar]]==0) {
                    paint(i+dx[ar],j+dy[ar],wid_num);
                }
            }
        }
    }
    
    public static void main(String[] args) {
        /* 1. m세로,n가로 의 모눈종이,k개의 직사각형
         * 2. 왼쪽 아래 꼭짓점 x,y좌표값
         * 3. 오른쪽 위 꼭짓점 x,y좌표값
         */        
        Scanner scan = new Scanner(System.in);
        result = new int[3000];
        m = scan.nextInt();
        n = scan.nextInt();
        int k = scan.nextInt();
 
        paper = new int[m][n];
        
        //입력받은 좌표를 -1로 바꾼다
        for(int i=0;i<k;i++) {
            int ld_y = scan.nextInt(); int ld_x = scan.nextInt();
            int rt_y = scan.nextInt(); int rt_x = scan.nextInt();
            for(int x=ld_x;x<rt_x;x++) {
                for(int y=ld_y;y<rt_y;y++) {
                    paper[x][y]=-1;
                }
            }
        }
        
        int wid_num=1;
        for(int i=0;i<m;i++) {
            for(int j=0;j<n;j++) {
                if(paper[i][j]==0) {
                    paint(i,j,wid_num);
                    wid_num++;
                }
            }
        }
        System.out.println(wid_num-1);
        Arrays.sort(result,1,wid_num);
        for(int i=1;i<wid_num;i++) {
            System.out.print(result[i]+" ");
        }
 
        
    }
 
}


