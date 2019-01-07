import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static int n,h;
   static int maxhp=1;
   
   public static void main(String[] args) throws IOException {
	   st =new StringTokenizer(br.readLine());
	   n = Integer.parseInt(st.nextToken()); //과일의 개수 N
	   h = Integer.parseInt(st.nextToken()); //스네이크 버드 초기 길이 정수 L
	   
	   st = new StringTokenizer(br.readLine());
	   int tree[] = new int[n];
	   for(int i=0; i<n; i++) {
		   tree[i] = Integer.parseInt(st.nextToken());
	   }//insert
	   Arrays.sort(tree);
	   
	   for(int i=0; i<n; i++)if(tree[i]<=h)h++;
	   
	   bw.write(String.valueOf(h));
	   bw.flush();
	
	    
	}// main
 
}//class 
 