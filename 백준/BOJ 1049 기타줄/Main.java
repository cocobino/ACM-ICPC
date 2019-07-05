import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static int dp[];
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		
		st =new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		int arr[][] = new int[m][2];
		
		for(int i=0; i<m; i++) {
			st =new StringTokenizer(br.readLine());
			int ea6 = Integer.parseInt(st.nextToken());
			int ea1 = Integer.parseInt(st.nextToken());
			
			arr[i][0]=ea6;
			arr[i][1]=ea1;
		}
		int rst =0;
		while(n>=0) {
			//1. n이 6보다 큰 경우
			int buy=Integer.MAX_VALUE;
			if(n>=6) {
				for(int k=0; k<m; k++) {
					for(int j=0; j<2; j++) {
						if(j==0) {
							buy = Math.min(buy, arr[k][j]);
						}
						else {
							buy = Math.min(buy, arr[k][j]*6);
						}
					}
				}
				int div = n/6;
				n = n-div*6;
				rst+=div*buy;
			}
			else {
				for(int i=0; i<m; i++) {
					buy = Math.min(buy, Math.min(arr[i][0], arr[i][1]*n));
				}
				rst +=buy;
				break;
			}
		}//while loop
		
		System.out.println(rst);
	}// main
 
  }// class
  