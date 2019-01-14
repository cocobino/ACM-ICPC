import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter; 
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static StringTokenizer st;
     
   
   
   public static void main(String[] args) throws IOException {
	   
	long n = Long.parseLong(br.readLine());
	
	long sum=0;
	long cnt=1;
	
	while(true) {
		sum+=cnt;
		
		if(sum>n) {
			break;
		}else {
		cnt++;
		}
	}
	
	if(n<=2)bw.write(String.valueOf(cnt-1));
	else if(n>2)bw.write(String.valueOf(cnt-1));
	
	bw.flush();
	    	  
	   }//main
   
   
} //class
