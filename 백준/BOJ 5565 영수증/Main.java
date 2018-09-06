import java.io.BufferedReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;





public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		
		
		int arr[] =new int[10];
		int rst=0;
		for(int i=0; i<10; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		
		for(int i=1; i<10; i++) {
			arr[0]= arr[0]-arr[i];
		}
		bw.write(String.valueOf(arr[0]));
		bw.flush();
		}
		
}
		
		
}