import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;





public class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		
		String a = br.readLine();
		int mid =0;
		char arr[] = new char[a.length()];
		
		arr = a.toCharArray();
		
		if(a.length() %2 !=0) { //望檜陛 �汝�
		 mid = a.length()/2;
		 
		 String b="";
		 String c="";
		for(int i=mid-1; 0<=i; i--) {
			b+=arr[i];
		}
		for(int i=mid+1; i<a.length(); i++) {
			c+=arr[i];
		}
		if(b.equals(c))bw.write(String.valueOf("1"));
		else String.valueOf("0");
		bw.flush();
		}
		
		if(a.length() %2 ==0) { //望檜陛 礎熱
			 mid = a.length()/2;
			 
			 String b="";
			 String c="";
			for(int i=mid-1; 0<=i; i--) {
				b+=arr[i];
			}
			for(int i=mid; i<a.length(); i++) {
				c+=arr[i];
			}
			if(b.equals(c))bw.write(String.valueOf("1"));
			else bw.write(String.valueOf("0"));
			bw.flush();
			}
			
	
		}
		
}
		
		