
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	 static int arr[];
	 static boolean visit[];
	 static int n,m;
	 static int pin=21,rst=0;
	 
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
 
		st =new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
	 
		
		arr= new int[n];
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<n; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		for(int i=0; i<n; i++) {
			for(int j=0; j<n; j++) {
				if(i!=j) {
					for(int k=0; k<n; k++) {
						if(i!=j && j!=k && i!=k) {
						int sum = arr[i]+arr[j]+arr[k];
							if(sum<=m) {
								rst = Math.max(sum, rst);
							}
						}
					}
				}
			}
		}
		
		bw.write(String.valueOf(rst));
		bw.flush();
		
	}// main
 
	

 
 
}// class

   