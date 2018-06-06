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
		
		char arr[] = new char[a.length()];
		
		arr = a.toCharArray();
		int cnt=0;
		for(int i=0; i<a.length(); i++) {
			if(arr[i]=='a' ||arr[i]=='e'||arr[i]=='i'|| arr[i]=='o'||arr[i]=='u')cnt++;
		}
		
	bw.write(String.valueOf(cnt));
	bw.flush();
		}
		
}
		