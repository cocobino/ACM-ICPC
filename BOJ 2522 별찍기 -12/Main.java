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
	
	for(int i=1; i<=T; i++) {
		
		for(int j=1; j<=T-i;j++ ) {
			bw.write(String.valueOf(" "));
		}
		for(int k=1; k<=i;k++ ) {
			bw.write(String.valueOf("*"));
		}
		bw.write(String.valueOf("\n"));
	}
	for(int i=1; i<=T; i++) {
		for(int j=1; j<=i; j++) {
			bw.write(String.valueOf(" "));
		}
		for(int j=1; j<=T-i;j++ ) {
			bw.write(String.valueOf("*"));
		}
		bw.write(String.valueOf("\n"));
	}
	
	
	bw.flush();
	}
}

		