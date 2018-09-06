
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Deque;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
  
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		 
		int k, len;
		
		char arr[][] = new char[200][200];
		k = Integer.parseInt(br.readLine());
		String crypt = br.readLine();
		len = crypt.length();
		
		for(int i=0; i<len/k; i++) {
			if(i%2 ==0) {
				for(int j=0; j<k; j++) {
					arr[i][j] = crypt.charAt(i*k +j);
				}
			}else {
				for(int j=k-1; j>=0; j--) {
					arr[i][k-1-j] = crypt.charAt(i*k +j);
				}
			}
		}
		for(int i=0; i<k; i++) {
			for(int j=0; j<len/k; j++) {
				bw.write(String.valueOf(arr[j][i]));
			}
		}
		bw.flush();
		
		
	}
 
}
