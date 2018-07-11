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

	int a = Integer.parseInt(br.readLine());
	int b = Integer.parseInt(br.readLine());
	int arr[] = new int[3];
	int tmp =b;
	for(int i=0; i<3; i++) {
		arr[i]= b%10;
		b/=10;
	}
	
	bw.write(String.valueOf(a*arr[0]+"\n"));
	bw.write(String.valueOf(a*arr[1]+"\n"));
	bw.write(String.valueOf(a*arr[2]+"\n"));
	bw.write(String.valueOf(a*tmp));
	bw.flush();
	}
}