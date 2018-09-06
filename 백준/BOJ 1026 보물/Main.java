import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;


public class Main{
	
	
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		int size = Integer.parseInt(br.readLine());
		
		int arr1[] = new int[size];
		int arr2[] = new int[size];
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int i=0; i<size; i++) {
			arr1[i] = Integer.parseInt(st.nextToken());
		}
		
		st = new StringTokenizer(br.readLine());
		for(int i=0; i<size; i++) {
			arr2[i] = Integer.parseInt(st.nextToken());
		}
			
		Arrays.sort(arr1);
		Arrays.sort(arr2);
		
		int sum=0;
		for(int i=0; i<size; i++) {
			sum+= arr1[i]*arr2[size-i-1];
		}
			bw.write(String.valueOf(sum));
			bw.flush();
			}

	}