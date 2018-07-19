import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;




public class Main {
		static int d[] = {1000,100,10,1};
		static boolean []isnotprime = new boolean[10000];
		static boolean []find = new boolean[10000];
	
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int test_case = Integer.parseInt(br.readLine());
        
        find();
        
        for(int T=0; T<test_case; T++) {
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        
      int ret=  bfs(a,b);
        bw.write(ret ==-1 ? "Impossible\n" : ret + "\n");
        
        }
        bw.flush();
        
        
	}

	private static void find() {
		// TODO Auto-generated method stub
		for(int i=2; i<10000; i++) {
			if(isnotprime[i])continue;
			for(int j=2; i*j<10000; j++) {
				isnotprime[i*j]= true;
			}
		}
			
	}

	private static int bfs(int a, int b) {
		// TODO Auto-generated method stub
		find = new boolean[10000];
		Queue<Integer> q = new LinkedList<>();
		
		q.add(a);
		find[a]=true;
		
		int st=-1;
		while(!q.isEmpty()) {
			st++;
			int size = q.size();
			for(int i=0; i<size; i++) {
				int curNode = q.poll();
				
				if(curNode ==b)return st; //종료
				
				int divied[] = new int[4];
				
				
				for(int j=0;j<4;j++) { //입력값 자리수 분할
					divied[j] = curNode/d[j];// 현재노드값 자리수별로 입력받기
					curNode %= d[j];
				}
				
				for(int j=0; j<4; j++) {//탐색
					for(int k=0; k<10; k++) {
						divied[j]=divied[j]+1 >9 ? 0 : divied[j]+1;
						
						int nextNum =0;
						for(int l=0; l<4;l++) {
							nextNum +=divied[l]*d[l];
						}
						
						//조건
						if(nextNum <1000)continue;
						if(find[nextNum])continue;
						if(isnotprime[nextNum])continue;
						
						q.add(nextNum);
						find[nextNum]=true;
					}
				}
			}
		}
		return -1;
	}
}
	class Node{
		int start, end;
		public Node(int start, int end) {
			// TODO Auto-generated constructor stub
			this.start = start;
			this.end = end;
		}
	}