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
	
	int arr[] = new int[5];
	
	StringTokenizer st= new StringTokenizer(br.readLine());
	for(int i=0; i<5; i++) {
		arr[i]=Integer.parseInt(st.nextToken());
	}
	Arrays.sort(arr);
	int cnt;
	int i;
	for( i=1; ;i++) {
		 cnt =0;
		for(int j=0; j<5; j++) {
			if(i%arr[j]==0)cnt++;
		}
		if(cnt>=3)break;
	}
	bw.write(String.valueOf(i));
	bw.flush();
	
	
	}
}