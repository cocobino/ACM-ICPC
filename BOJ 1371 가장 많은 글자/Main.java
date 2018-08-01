import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

	

	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		Scanner sc = new Scanner(System.in);
		int alpha[] = new int[26];
		int max=0;
		
		while(sc.hasNextLine()) {
			String a = sc.nextLine();
			for(int i=0; i<a.length(); i++) {
				if(a.charAt(i) != ' ') {
					alpha[(int)(a.charAt(i)-'a')]++;
					if(max < alpha[(int)(a.charAt(i)-'a')]) {
						max = alpha[(int)(a.charAt(i)-'a')];
					}
				}
			}
		}
		for(int i=0; i<26; i++) {
			if(alpha[i]==max) {
				bw.write(String.valueOf((char)(i+'a')));
				
			}
		}
		bw.flush();
		
		
		
	}
}