import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

		static int N,cost;
		static int arr[] = new int[21];
		static int cnt=0;
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	StringTokenizer st= new StringTokenizer(br.readLine());
	
	 N = Integer.parseInt(st.nextToken());
	 cost = Integer.parseInt(st.nextToken());
	
	
	 st= new StringTokenizer(br.readLine());
	for(int i=0; i<N; i++) {
	arr[i] = Integer.parseInt(st.nextToken());
	}
	
	dfs(0,0);
	if(cost ==0) {
		cnt= cnt-1;
	}
	bw.write(String.valueOf(cnt));
	bw.flush();
	}

	private static void dfs(int sum, int step) {
		// TODO Auto-generated method stub
		
		if(step==N) {
			if(sum ==cost)cnt++;
			return;
		}
		dfs(sum+arr[step], step+1);
		dfs(sum, step+1);
		
	}
}
