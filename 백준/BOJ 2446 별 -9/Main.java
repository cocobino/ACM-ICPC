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
        
        for(int loop=1; loop <=2*n-1; loop ++) {
        	if(loop<=n) {
	        	for(int blank=0; blank < loop-1; blank++) {
	        		System.out.print(" ");
	        	}
	        	
	        	for(int star=0; star<2*(n-loop)+1; star++) {
	        		System.out.print("*");
	        	}
        	} else {
        		for(int blank=0; blank<(2*n-1)-loop; blank++) {
        			System.out.print(" ");
        		}
        		
        		for(int star=0; star<(loop-n)*2+1; star++) {
        			System.out.print("*");
        		}
         	}
        	System.out.println("");
        }
        	
         
	}

}
