
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

public class Main {

	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringTokenizer st;
	 
	 
	 
	public static void main(String[] args) throws NumberFormatException, IOException {
		// TODO Auto-generated method stub
	int w[] = new int[10];
	int k[] = new int[10];
	
	for(int i=0; i<10; i++) {
		w[i] = Integer.parseInt(br.readLine());
	}
	
	for(int i=0; i<10; i++) {
		k[i] = Integer.parseInt(br.readLine());
	}
	
	Arrays.sort(w);
	Arrays.sort(k);
	
	int wrst=0,krst=0;
	for(int i=9; i>=7; i--) {
		wrst+=w[i];
		krst+=k[i];
	}
	
	bw.write(String.valueOf(wrst+" "+krst));
	bw.flush();
	
	}// main
 
	

 
 
}// class

   