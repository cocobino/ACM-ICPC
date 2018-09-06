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
	
	int test =Integer.parseInt(br.readLine());
	
	for(int T=0; T<test; T++) {
	int input = Integer.parseInt(br.readLine());
	
	int [] arr =new int[12];
	arr[1]=1;arr[2]=2;arr[3]=4;
	
	for(int i=4; i<=arr.length-1; i++) {
		arr[i] = arr[i-1] + arr[i-2]+arr[i-3];
	}
	
	bw.write(String.valueOf(arr[input]+"\n"));
	}
	bw.flush();
	
	}
}