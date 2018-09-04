import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Arrays;
import java.util.StringTokenizer;
 
 
public class Main {
 
    
    public static void main(String[] args) throws IOException {
    	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    	//insert
    	int n = Integer.parseInt(br.readLine());
    	int arr[] = new int[n];
    	StringTokenizer st = new StringTokenizer(br.readLine());
    	for(int i=0; i<n; i++) arr[i]=Integer.parseInt(st.nextToken());
    	//solution
    	int idx = n-1;
    	// arr[idx-1]>arr[idx] 되는 부분 찾기
    	while(idx>0 && arr[idx-1]>arr[idx])idx--;
    	if(idx==0) {
    		bw.write(String.valueOf("-1"));
    		bw.flush();
    	}
    	else {
    		int end = n-1;
    		while(end >= idx && arr[idx-1]>arr[end])end--;
    		
    		int search = n -1-end;
    		
    		Arrays.sort(arr, idx-1,arr.length);
    		
    		rightRotate(arr, idx-1, idx+search);
    		
    		for(int i=0;i<n; i++) {
    			bw.write(String.valueOf(arr[i] + " "));
    		}
    		bw.flush();
    		
    	}
	}//main

	private static void rightRotate(int[] arr, int start, int end) {
		// TODO Auto-generated method stub
		int last = arr[end];
		for(int i=end; i>start; i--) {
			arr[i]=arr[i-1];
		}
		arr[start]=last;
	}
}