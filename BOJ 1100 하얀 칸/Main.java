import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {

		
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	char arr[][] = new char[8][8];
	int cnt=0;
	for(int i=0; i<8; i++) {
		String a = br.readLine();
		for(int j=0; j<8; j++) {
			arr[i]=a.toCharArray();
		}
	}
	for(int i=0; i<8; i++) {
		for(int j=0; j<8;j++) {
			if(i%2==0 && j%2==0 && arr[i][j]=='F')cnt++;
			if(i%2!=0 && j%2!=0 && arr[i][j]=='F')cnt++;
		}
	}
	bw.write(String.valueOf(cnt));
	bw.flush();
		
	}
}

		