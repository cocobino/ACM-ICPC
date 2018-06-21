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

		
		
		
		int arr[][] = new int[2][10];
	
		for(int i=0; i<2; i++) {
			StringTokenizer st= new StringTokenizer(br.readLine());
			for(int j=0; j<10; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		
		int acnt=0;
		int bcnt=0;
		
		for(int i=0; i<10; i++) {
			if(arr[0][i]>arr[1][i])acnt++;
			if(arr[0][i]<arr[1][i])bcnt++; 
		}
			if(acnt == bcnt)bw.write(String.valueOf("D"));
			if(acnt>bcnt)bw.write(String.valueOf("A"));
			if(acnt<bcnt)bw.write(String.valueOf("B"));
			bw.flush();
		}

	}
