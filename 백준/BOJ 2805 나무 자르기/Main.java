import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	static int n,k;
	static int tree[];
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken()); // tree count
		k = Integer.parseInt(st.nextToken()); // rst
		
		tree =new int[n];
		st = new StringTokenizer(br.readLine());
		int left=0,right=0;
		
		for(int i=0; i<n; i++) {
			tree[i] = Integer.parseInt(st.nextToken());
			right = Math.max(right, tree[i]);
		}//insert
		
		/*solution
		 * n <=2000000000
		 * BS*/
		
		while(left != right) {
			int mid = (left+right+1)/2;
			
			if(valid(mid)) { // left 올리고 right 내리기
				left=mid;
			}
			else
			{
				right = mid-1;
			}
		} // bs search
		
		bw.write(String.valueOf(left));
		bw.flush();
	}//main
	private static boolean valid(int cur) {
		// TODO Auto-generated method stub
		long tmp=0;
		for(int i=0; i<n; i++) {
			if(tree[i]-cur>=0)tmp+=tree[i]-cur;
		}
		
			// 
		return tmp>=k;
	}

}//class
