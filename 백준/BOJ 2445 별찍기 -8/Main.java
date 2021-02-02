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
        
        for(int loop =0; loop<2*n-1; loop++) {
        	if(loop <= (2*n-1)/2) {
        		for(int ls=0; ls<loop+1; ls++) {
        			System.out.print("*");
        		}
        		
        		for(int blank=0; blank<2*(n-loop-1); blank++) {
        			System.out.print(" ");
        		}
        		
        		for(int ls=0; ls<loop+1; ls++) {
        			System.out.print("*");
        		}
         	} else {
         		for(int ls=0; ls<2*n-loop-1; ls++) {
         			System.out.print("*");
         		}
         		
         		for(int blank=0; blank<2*(loop-n+1); blank++) {
         			System.out.print(" ");
         		}
         		
         		for(int ls=0; ls<2*n-loop-1; ls++) {
         			System.out.print("*");
         		}
         	}
        	
        	System.out.println("");
        }
         
	}

}
