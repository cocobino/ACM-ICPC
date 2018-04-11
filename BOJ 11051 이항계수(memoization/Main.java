import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
    	/*
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		
		int n = Integer.parseInt(st.nextToken());
		int k = Integer.parseInt(st.nextToken());
 */
    	Scanner sc = new Scanner(System.in);
    	long n = sc.nextLong();
    	long k = sc.nextLong();
		int[][] list = new int[40000001][40000001];
		
        //int result = fascal(n,k);
        
        list[1][1] = list[1][0] = 1;
        
        for(int i=2; i<=n;i++) {
        	for(int j=0; j<=i;j++) {
        		if( j==i || j==0) list [i][j] =1;
        		else
        			list[i][j] = list[i-1][j-1] + list[i-1][j];
        		
        		list[i][j] %= 1000000007;
        	}
        }
        
        System.out.println(list[(int) n][(int) k]);
        sc.close();
        
       
        
    }
/*
	private static int fascal(int n, int k) {
		// TODO Auto-generated method stub
		
		if( n==k || k==0) return 1;
		else
		return fascal(n-1,k-1)+fascal(n-1,k);
		
	}

	
*/
}


