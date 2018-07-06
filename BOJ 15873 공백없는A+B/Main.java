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
	
	String a = br.readLine();
	char arr[] = new char[4];
	arr = a.toCharArray();
	int rst=0;

	if(a.length()==4)rst=20;
	if(a.length()==3 && arr[0]==49&&arr[1]==48) {
			rst = 10+arr[2]-48;
	}
	if(a.length()==3 && arr[1]==49 && arr[2]==48) {
		rst = 10+arr[0]-48;
	}
	if(a.length()==2) {
		rst = arr[0]+arr[1]-96;
	}
	bw.write(String.valueOf(rst));
	bw.flush();
    }



}