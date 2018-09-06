import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> s = new Stack<Character>();
		String input = br.readLine().trim(); // 괄호입력
		char[] charr = input.toCharArray(); //입력값 배열로 전환
		int cnt =0, mul=1;
		int a=0,b=0; // a = (  , b = [ 카운트
		
		for(int i=0; i<input.length();i++) {
			
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
	static  int input; //T 입력값
	static String ps; // 괄호 입력값
	static int cnt[]; // cnt 값 배열적립
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine()); //test 케이스 입력값
		cnt = new int[input];
		
		for(int i=0; i<input; i++) {
			ps = br.readLine();
			cnt[i] = cal(ps); // 매소드 호출
		}
		
		for( int i=0; i<input; i++) {
			if(cnt[i] != 0) { //cnt 값이 0이면 YES, 0이 아니면 NO
			System.out.println("NO");
			}else System.out.println("YES");
		}
		
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    		
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		Stack s = new Stack();
		ArrayList arr = new ArrayList();
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {


	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Integer> dq = new ArrayDeque<Integer>();
		
		StringBuilder sb = new StringBuilder("<");
		StringTokenizer st = new StringTokenizer(br.readLine(), " "); //
	
		
		int a = Integer.parseInt(st.nextToken());
		int b = Integer.parseInt(st.nextToken());
		
		for(int i=1; i<=a; i++) {
			dq.addLast(i); //dq 에 입력값 채워넣기
		}
		
		while(!dq.isEmpty()) { // 데큐가 빌때까지 반복
			
			for(int j=0; j<b-1;j++){ // 제거할 index 위치까지 회전
				dq.addLast(dq.removeFirst()); //  끝에값을 앞으로 넣어서 위치
			}
			sb.append(dq.removeFirst()+", "); // 첫번째 index 출력
		}
		System.out.println(sb.toString().substring(0, sb.length()-2) + ">");

	}
	
	}