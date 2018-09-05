import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
 
 
public class Main {
	
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int n = Integer.parseInt(br.readLine());
    	
    	int dp[] =new int[n+1];
    	
    	for(int i=0; i<n+1; i++) {
    		if(i==0)dp[i]=0;
    		else if(i==1)dp[i]=1;
    		else if(i==2)dp[i]=3;
    		else dp[i] = (dp[i-2]*2)+dp[i-1];
    		dp[i] %=10007;
    	}
    	bw.write(String.valueOf(dp[n]));
    	bw.flush();
	}//main
}