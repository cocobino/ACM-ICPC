import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;


public class Main {

	
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	int T= Integer.parseInt(br.readLine());
	for(int i=0; i<T; i++) {
	String a = br.readLine();
	char arr[] = new char[a.length()];
	arr = a.toCharArray();
	
	bw.write(String.valueOf(arr[0]+arr[2]-96+"\n"));
	bw.flush();
	
	}
	
	
	}
}

		