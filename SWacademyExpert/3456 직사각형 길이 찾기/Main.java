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
 
class Solution {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
 
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int tc = Integer.parseInt(br.readLine());
	 for(int T=1; T<=tc; T++) {
		 int arr[] = new int[3];
	 StringTokenizer st = new StringTokenizer(br.readLine());
	 for(int i=0; i<3; i++)arr[i] = Integer.parseInt(st.nextToken());
	 
	 Arrays.sort(arr);
	 
	 for(int i=1; i<3; i++) {
		 //세변이 다 똑같을 경우
		 if(arr[0] == arr[1] && arr[0] ==arr[2]) {
			 bw.write(String.valueOf("#"+T+" "+arr[0]+"\n"));
			 break;
		 }
	 else if(arr[0] ==arr[1] && arr[1] != arr[2]) {
		 	bw.write(String.valueOf("#"+T+" "+arr[2]+"\n"));
			 break;
	 }
	 else if(arr[0] != arr[1] && arr[1] == arr[2]) {
		 bw.write(String.valueOf("#"+T+" "+arr[0]+"\n"));
		 break;
	 }

		 
	 }
	 
	 	bw.flush();
		 
		 
		 
	 }//test_case
	 
	}//main
 
	 

}//class
  