import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

class Main{
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		int length = Integer.parseInt(br.readLine());
		if(length<=5)bw.write(String.valueOf(1));
		
		else {
		int rst = length/5;
		if(length%5 != 0) rst++;
		bw.write(String.valueOf(rst));
		
		}
		
		bw.flush();
		
		
	}
	
}
