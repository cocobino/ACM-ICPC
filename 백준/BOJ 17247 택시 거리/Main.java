import java.io.BufferedReader;
        import java.io.InputStreamReader;
        import java.util.*;

public class Main {

    static final int INF = 1234567890;

    public static void main(String[] args) throws Exception {
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        st = new StringTokenizer(br.readLine());

        int r = Integer.parseInt(st.nextToken());
        int c = Integer.parseInt(st.nextToken());
        int map[][] = new int[r][c];

        int ax=INF,ay=INF,bx=INF,by=INF;
        for(int i=0; i<r; i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<c; j++){
                map[i][j] = Integer.parseInt(st.nextToken());
                if(map[i][j] == 1 && ax == INF ){
                    ax = i; ay =j;
                }else if(map[i][j] == 1 && ax !=INF){
                    bx = i; by =j;
                }
            }
        }//insert

        System.out.println(Math.abs(ax-bx) + Math.abs(ay-by));


    }
}
