import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {


	static BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw =new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
 
	static int n,k;
	static int dp[];
	//static LinkedList<Integer> arr = new LinkedList<>();
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
		st =new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		k = Integer.parseInt(st.nextToken());
		
		dp = new int[n+1];
	//	Queue<Integer> q = new LinkedList<>();
		st =new StringTokenizer(br.readLine());
		int sum=0;
		for(int i=1; i<=n; i++) {
			int tmp = Integer.parseInt(st.nextToken());
			sum+=tmp;
			dp[i]=sum;
		}
		
		int s =dp.length;
		
		for(int i=0; i<k; i++) {
			int can = Integer.parseInt(br.readLine());
			int rst = bs(0,s-1,can);
		 
		 bw.write(String.valueOf(rst));
		 bw.newLine();
		 bw.flush();
			
		}
		
		
		
		
	}// main

	private static int bs(int left, int right, int size) {
		// TODO Auto-generated method stub
		while(left<=right) {
			int mid = (left+right)/2;
			if(size < dp[mid]) {
				right = mid -1;
			}else if(size >dp[mid]) {
				left = mid+1;
			}else {
				return mid;
			}
		}
		return right;
	}

	 

}//class
 