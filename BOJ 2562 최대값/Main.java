import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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

		
		int arr[] = new int[9];
		
		for(int i=0; i<9; i++) {
			arr[i]=Integer.parseInt(br.readLine());
		}
		int max=0;
		for(int i=0; i<9;i++) {
			if(max<arr[i])max=arr[i];
		}
		bw.write(String.valueOf(max)+"\n");
		for(int i=0; i<9;i++) {
			if(max==arr[i]) {
				bw.write(String.valueOf(i+1));
				break;
			}
			
		}
		bw.flush();
		}

	}