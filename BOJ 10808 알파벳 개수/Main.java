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
		 
		 int arr[] = new int[27];
		 
		 String a =br.readLine();
		 
		 for(int i=0; i<a.length();i ++) {
			 arr[a.charAt(i)-'a']++;
		 }
		
		 for(int i=0; i<26;i++)bw.write(String.valueOf(arr[i]+" "));
		 bw.flush();
	}
 
}