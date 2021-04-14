import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	
	static StringTokenizer st;
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		int n = Integer.parseInt(br.readLine());
		
		String arr[] = new String[n];
		 for(int i=0; i<n; i++) {
			 arr[i] = br.readLine();
//			 System.out.println(arr[i].substring(0,1));
		 }
		 int i=0;
		 for(i=arr[0].length()-1; i>=0; i--) {
			 boolean flag=false, end=false;
			 ArrayList<String> tmp = new ArrayList<String>();
			 for(int j=0; j<n; j++) {
				 String t= arr[j].substring(i, arr[j].length());
				 tmp.add(t);
			 }
			 
			 for(int j=0; j<tmp.size(); j++) {
				 String temp = tmp.remove(0);
				 //same
				 if(tmp.indexOf(temp) != -1) {
					 flag =true;
				 }
				 tmp.add(temp);
			 }
			 if(!flag) break;
		 }
		 System.out.println(arr[0].length()-i);
		 
 
	}
}