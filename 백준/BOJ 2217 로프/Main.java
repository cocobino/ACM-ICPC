import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {


	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());
		int arr[] = new int[n+1];
		
		int max = 0;
		 
		
		for(int i=1; i<=n; i++) {
			arr[i] = Integer.parseInt(br.readLine());
		}//insert
		
		Arrays.sort(arr);
		
		for(int i=1; i<=n; i++) {
			//int tmp = arr[i] * (n-i+1);
			max = Math.max( max, arr[i] * (n-i+1));
		}
		
		System.out.println(max);
		
		
	}// main
 
}// class
 