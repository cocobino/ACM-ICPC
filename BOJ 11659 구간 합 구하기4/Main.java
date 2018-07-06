import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {


	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	StringTokenizer st = new StringTokenizer(br.readLine());
	
	int N = Integer.parseInt(st.nextToken()); // 수개수
	int M = Integer.parseInt(st.nextToken()); // 합 개수
	
	st = new StringTokenizer(br.readLine());
	int arr[] = new int[N+1];
	int sum[] = new int[N+1];
	for(int i=1; i<=N; i++) {
		arr[i]=Integer.parseInt(st.nextToken());
	}
	for(int i=1; i<=N; i++) {
		if(i==1) {
			sum[i] = arr[i];
		}else {
			sum[i] = sum[i-1]+arr[i];
		}
	}
	
	
	for(int i=0; i<M; i++) {
		
		st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		bw.write(String.valueOf(sum[b]-sum[a-1]+"\n"));
			}
	
	bw.flush();
	
	}
}