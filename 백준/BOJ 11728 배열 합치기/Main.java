import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	
	  
	
	public static void main(String[] args) throws IOException {
	// TODO Auto-generated method stub
		st = new StringTokenizer(br.readLine());
		int asize = Integer.parseInt(st.nextToken());
		int bsize = Integer.parseInt(st.nextToken());
		
		int arr[] = new int[asize+bsize];
		st =new StringTokenizer(br.readLine());
		for(int i=0; i<asize;i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		st =new StringTokenizer(br.readLine());
		for(int i=asize; i<bsize+asize; i++) {
			arr[i] = Integer.parseInt(st.nextToken());
		}
		
		Arrays.sort(arr);
		for(int i=0; i<arr.length; i++)bw.write(String.valueOf(arr[i]+" "));
		bw.flush();
		
	}//main
 
}//class
 
