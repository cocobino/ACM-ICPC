import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	
		
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

	int N = Integer.parseInt(br.readLine());
	int arr[] = new int[N];
	int rst2=0, rst1=0;
	int max=0;
	for(int i=0; i<N; i++) {
	arr[i] = Integer.parseInt(br.readLine());
	}
	// 1번째줄
	for(int i=0; i<N; i++) {
		if(max <arr[i]) {
			max = arr[i];
			rst1++;
		}
		for(int j=i+1; j<N; j++) {
			if(max < arr[j]) {
				max = arr[j];
				rst1++;
			}
		}
		//if(rst1==N)break;
	}
	
	max=0;
	// 2번째줄
	for(int i=N-1; i>=0; i-- ) {
		if(max < arr[i]) {
			max = arr[i];
			rst2++;
		}
		for(int j=i-1; j>=0;j--) {
			if(max <arr[j]) {
				max = arr[j];
				rst2++;
			}
		}
		//if(rst2==N)break;
	}

	bw.write(String.valueOf(rst1+"\n"));
	bw.write(String.valueOf(rst2));
	bw.flush();
	
	
	}
}