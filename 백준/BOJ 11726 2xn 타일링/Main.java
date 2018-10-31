import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Scanner;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
    
   static int n;
   static int dp[];
   
    public static void main(String[] args) throws IOException {
       n =Integer.parseInt(br.readLine());
       
    	dp = new int[n+1];
    	
    	dp[0]=1;
    	dp[1]=1;
    	
    	for(int i=2; i<=n; i++) {
    		dp[i] = (dp[i-1] + dp[i-2])%10007;
    	}
    
    	bw.write(String.valueOf(dp[n]%10007));
    	bw.flush();
    	
	}//main
} //class

