import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.StringTokenizer;
 
class Solution {
    static int n,m;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i=1;i<=tc;i++) {
            List<ArrayList<Integer>> list = new ArrayList<>();
            StringTokenizer st = new StringTokenizer(br.readLine());
            n = Integer.parseInt(st.nextToken());
            m = Integer.parseInt(st.nextToken());
            for(int j=0;j<=n;j++)
                list.add(new ArrayList<>());
            
            for(int j=0;j<m;j++) {
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                list.get(a).add(b);
                list.get(b).add(a);
            }
            result = -1;
            solve(list);
            sb.append("#"+i+" "+result+"\n");
        }
        System.out.print(sb);
    }
    
    static int result;
    private static void solve(List<ArrayList<Integer>> list) {
        boolean[] visited = new boolean[n+1];
        Queue<Pair> queue = new LinkedList<>();
        visited[1] = true;
        queue.add(new Pair(1,1));
        while(!queue.isEmpty()) {
            Pair t = queue.poll();
            if(t.cnt>=4)
                break;
            result++;
            for(int i=0;i<list.get(t.n).size();i++) {
                if(visited[list.get(t.n).get(i)]) continue;
                queue.add(new Pair(list.get(t.n).get(i),t.cnt+1));
                visited[list.get(t.n).get(i)] = true;
            }
        }
    }
    
    static class Pair{
        private int n;
        private int cnt;        
        public Pair(int n,int cnt) {
            this.n = n;
            this.cnt = cnt;
        }
    }
}
