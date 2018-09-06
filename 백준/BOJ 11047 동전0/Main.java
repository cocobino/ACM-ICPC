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
	
	StringTokenizer st= new StringTokenizer(br.readLine());
	
	int n = Integer.parseInt(st.nextToken());
	int cost = Integer.parseInt(st.nextToken());
	int sum=0;
	int rst=0;
	int arr [] = new int[n];
	int tmp=0;
	for(int i=0; i<n; i++) {
	arr[i] = Integer.parseInt(br.readLine());	
	}
	sum =cost;
	for(int i=n-1; i>=0; i--) {
		if(sum/arr[i] !=0) {
			rst = sum/arr[i];
			tmp = rst+tmp;
			sum = sum - arr[i]*rst; 
		}
	}
	bw.write(String.valueOf(tmp));
	bw.flush();
	}
}
