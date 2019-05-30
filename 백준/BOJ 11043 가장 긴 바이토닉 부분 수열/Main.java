import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;

		int n = Integer.parseInt(br.readLine());

		int arr[] = new int[n];
		st = new StringTokenizer(br.readLine());

		for (int i = 0; i < n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		} // insert

		int dp[] = new int[n];
		int dp1[] = new int[n];
		
		Arrays.fill(dp, 1);
		Arrays.fill(dp1, 1);

		for (int i = 1; i < n; i++) {
			for (int j = 0; j < i; j++) {
				if (arr[i] > arr[j] && dp[i] < dp[j] + 1) {
					dp[i] = dp[j] + 1;
				}
			}
		}
		
		for(int i= arr.length-2; i>=0; i--) {
			for(int j=arr.length-1; j>i; j--) {
				if(arr[i] > arr[j] && dp1[i] < dp1[j] +1) {
					dp1[i] = dp1[j] +1;
				}
			}
		}
		
		int max=0;
		for(int i=0; i<arr.length; i++) {
			dp[i] +=dp1[i];
			max = Math.max(max, dp[i]);
		}
		System.out.println(max-1);
		
		
	}// main
}// class
