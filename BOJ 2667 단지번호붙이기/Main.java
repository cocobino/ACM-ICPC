import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
 
public class Main {
    
    static int n,cnt,ax,ay;
    static int map[][]=new int[25][25];
    static int dx[]={1,-1,0,0};
    static int dy[]={0,0,1,-1};
    
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> res = new ArrayList();
        n = Integer.parseInt(br.readLine());
        
        for(int i = 0 ; i < n ; i++){
            String s=br.readLine();
            for(int j = 0 ; j < n ; j++){
                map[i][j]=s.charAt(j);
            }
        }
        
        for(int i = 0 ; i < n ; i ++){
            for(int j = 0 ; j < n ; j++){
                if(map[i][j]=='1'){
                    cnt=0;
                    int v = dfs(i,j);
                    res.add(v);
                }
            }
        }
        
        Collections.sort(res);
        System.out.println(res.size());
        for(int vv : res){
            System.out.println(vv+" ");
        }
    }
    public static int dfs(int x,int y){
        map[x][y]='0';
        cnt++;
        for(int i =0 ; i < 4 ; i++){
            ax=x+dx[i];
            ay=y+dy[i];
            if(ax>=0&&ay>=0&&ax<n&&ay<n){
                if(map[ax][ay]=='1')dfs(ax,ay);
            }
        }
        return cnt;
    }
}
