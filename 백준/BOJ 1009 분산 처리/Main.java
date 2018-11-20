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
    	
    		StringTokenizer st= new StringTokenizer(br.readLine());
    		int a = Integer.parseInt(st.nextToken());
    		int b = Integer.parseInt(st.nextToken());
    		int r=1;
    		for(int i=0; i<b; i++) {
    			r = (r*a)%10;
    		}
    		if(r==0)r=10;
    		bw.write(String.valueOf(r+"\n"));
    		bw.flush();
    	
    	
	}
}
}
