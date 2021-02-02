import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int n = Integer.parseInt(br.readLine());
        
        for(int loop =1; loop<=n; loop++) {
        	for(int blank=0; blank<n-loop; blank++) {
        		System.out.print(" ");
        	}
        	if(loop==1)System.out.println("*");
        	if(1<loop && loop<n) {
        		System.out.print("*");
        		for(int blank=0; blank<2*(loop-1)-1; blank++) {
        			System.out.print(" ");
        		}
        		System.out.println("*");
        	}
        	if(loop==n && n!=1) {
        		for(int star=0; star<2*n-1; star++) {
        			System.out.print("*");	
        		}
        	}
        }//for-loop
	}

}
