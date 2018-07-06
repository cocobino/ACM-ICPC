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

	int n = Integer.parseInt(br.readLine());
	int arr[][] = new int[n+1][10];
	
	for(int i=0; i<10; i++) arr[1][i]=1;
	
	for(int i=2; i<=n; i++) {
		for(int j=0; j<=9; j++) {
			for( int k=0; k<=j; k++) {
				arr[i][j] += arr[i-1][k];
				arr[i][j] %=10007;
			}
		}
	}
	int rst =0;
	for(int i=0; i<=9; i++) {
		rst += arr[n][i];
	}
	
	
	bw.write(String.valueOf(rst %=10007));
	bw.flush();
	
	}
}