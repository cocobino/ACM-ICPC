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
		
		st = new StringTokenizer(br.readLine());
		int arr[] = new int[20000001];
		for(int i=0; i<n; i++) {
			arr[Integer.parseInt(st.nextToken())+10000000]++;
		}
		
		int m = Integer.parseInt(br.readLine());
		st= new StringTokenizer(br.readLine());
		for(int i=0; i<m; i++) {
			System.out.print(arr[Integer.parseInt(st.nextToken())+10000000]+" ");
		}

	}// main
	 
}// class
