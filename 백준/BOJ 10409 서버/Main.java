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
	   
	   st = new StringTokenizer(br.readLine());
	   int n = Integer.parseInt(st.nextToken());
	   int t = Integer.parseInt(st.nextToken());
	   
	   int arr[] = new int[n];
	   st = new StringTokenizer(br.readLine());
	   for(int i=0; i<n; i++)arr[i] = Integer.parseInt(st.nextToken());
	   
	   int sum=0;
	   int cnt=0;
	   for(int i=0; i<n; i++) {
		   	if(sum+arr[i]>t) {
		   		break;
		   }
		   	sum += arr[i];
		   	cnt++;
	   }
	   bw.write(String.valueOf(cnt));
	   bw.flush();
	   
	    	  
	   }//main
   
   
} //class
