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

		StringTokenizer st = new StringTokenizer(br.readLine());
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[a+1][b+1];
		
		for(int i=1; i<=a; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j=1; j<=b; j++) {
				arr[i][j] = Integer.parseInt(st.nextToken());
			}
		}
		int search = Integer.parseInt(br.readLine());
		for(int i=0; i<search; i++) {
			st = new StringTokenizer(br.readLine());
			int x1 = Integer.parseInt(st.nextToken());
			int y1 = Integer.parseInt(st.nextToken());
			int x2 = Integer.parseInt(st.nextToken());
			int y2 = Integer.parseInt(st.nextToken());
			int rst =0;
			for(int j=x1; j<=x2; j++) {
				for(int k=y1; k<=y2; k++) {
					rst +=arr[j][k];
				}
			}
			bw.write(String.valueOf(rst + "\n"));
			
		}
		bw.flush();
		}

	}
