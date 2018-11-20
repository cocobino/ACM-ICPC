import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;
 
public class Main {


    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	
    	int test =Integer.parseInt(br.readLine());
    	
    	for(int T = 0 ; T<test; T++) {
    	
    		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
    		// a/
    		int k = Integer.parseInt(st.nextToken());
    		int n = Integer.parseInt(st.nextToken());
     
    		int[][] list = new int[1001][1001];
    		
            //int result = fascal(n,k);
            
            list[1][1] = list[1][0] = 1;
            
            for(int i=2; i<=n;i++) {
            	for(int j=0; j<=i;j++) {
            		if( j==i || j==0) list [i][j] =1;
            		else
            			list[i][j] = list[i-1][j-1] + list[i-1][j];
            		
            		
            	}
            }
            bw.write(String.valueOf(list[n][k]+"\n"));
            bw.flush();
    	
	}
}
}
