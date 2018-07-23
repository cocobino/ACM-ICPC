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
		
	static int a ,b, c;
	static boolean visit[][] = new boolean[201][201];
	static boolean ans[] = new boolean[201];
	
		
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        	
        StringTokenizer st= new StringTokenizer(br.readLine());
        a = Integer.parseInt(st.nextToken());
        b = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
      
        
        dfs(0,0,c);
        
        for(int i=0; i<201; i++) {
        	if(ans[i]) {
        		bw.write(String.valueOf(i+" "));
        	}
        }
      

        bw.flush();
	}

    						// 0,       0 ,       10
    public static void dfs(int ca, int cb, int cc) {
        if (visit[ca][cb]) {
            return;
        } 
     
        if (ca == 0) {
            ans[cc] = true;
        }
     
        visit[ca][cb] = true;
     
        // a -> b
        if (ca + cb > b) {
            dfs((ca + cb) - b, b, cc);
        } else {
            dfs(0, ca + cb, cc);
        }
        // b -> a
        if (cb + ca > a) {
            dfs(a, (cb + ca) - a, cc);
        } else {
            dfs(cb + ca, 0, cc);
        }
        // c -> a
        if (cc + ca > a) {
            dfs(a, cb, (cc + ca) - a);
        } else {
            dfs(cc + ca, cb, 0);
        }
        // c -> b
        if (cc + cb > b) {
            dfs(ca, b, (cc + cb) - b);
        } else {
            dfs(ca, cc + cb, 0);
        }
        // b -> c, a -> c
        // a + b = c 이기 때문에, c가 넘칠 일이 없다.
        dfs(ca, 0, cb + cc);
        dfs(0, cb, ca + cc);
    }


    
	
    
}

	

 class Node{
	 int x,y;
	 public Node(int x, int y) {
		// TODO Auto-generated constructor stub
		 this.x =x;
		 this.y =y;
		 
	}
 }
 