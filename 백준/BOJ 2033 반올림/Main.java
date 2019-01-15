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
	   
	   int n = Integer.parseInt(br.readLine());
	   
	   int arr[] = new int[8];
	   int i=0, size;
	   while(n>0) {
		   arr[i++] = n %10;
		   n/=10;
	   }
	   
	   size =i-1;
	   i=0;
	   
	   while(i<size) {
		   if(arr[i]>=5) {
			   arr[i+1]++;
		   }
		   arr[i]=0;
		   i++;
	   }
	   if(size<0)size=0;
	   for(i=size; i>=0; i--)System.out.print(arr[i]);
	   }//main
   
   
} //class
