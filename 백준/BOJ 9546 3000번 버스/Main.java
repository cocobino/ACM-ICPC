import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
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


public class Main{
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int test_case = Integer.parseInt(br.readLine());
		int arr[] = new int[31];
		arr[0] =0; arr[1] =1;		
		for(int i=2; i<31; i++) {
		arr[i] = 2*arr[i-1] +1;
		}
		for(int i=0; i<test_case; i++) {
			int a = Integer.parseInt(br.readLine());
			bw.write(String.valueOf(arr[a]+"\n"));
			bw.flush();
		}
		
		
			
		}
	
	}
