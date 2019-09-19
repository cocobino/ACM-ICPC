import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        
        st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        
        int ball[] = new int[n+1];
        for(int i=0; i<m; i++) {
        	st = new StringTokenizer(br.readLine());
        	int from = Integer.parseInt(st.nextToken());
        	int to = Integer.parseInt(st.nextToken());
        	int num = Integer.parseInt(st.nextToken());
        	
        	for(int j=from; j<=to; j++) {
        		ball[j]=num;
        	}
        	
        }
        for(int i=1; i<=n; i++) {
        	System.out.print(ball[i] +" ");
        }
        
        
    }// main
	 
     
}// class
   