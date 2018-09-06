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
		int index =0; //배열 포인터
		
		
		int input = Integer.parseInt(br.readLine());
		int inarr[] = new int[input];
		
		for(int i=0; i<input; i++) { //테스트케이스 입력값 받기
		inarr[i] =Integer.parseInt(br.readLine()); 	 
		}
		
		for(int i=1; i<=input; i++) { // 오름차순으로 stack, list 에  수열, +,- 값 저장
			s.add(i);
			arr.add('+');
			
			while(!s.isEmpty() && inarr[index] == (int)s.peek()) { //스택이 비어있지않고 스택 최상위값과
																	// 인덱스가 가르키는 배열값과 스텍 피크 값이 같을때까지 for문에서 오름차순 반복
				index++; // 다음 인덱스 넘어감
				s.pop(); // 스택 제거
				arr.add('-'); // 제거하면서 - 출력
			}
		}
		
		if(!s.isEmpty()) {
			System.out.println("NO");
		}else
			for(int i =0; i<arr.size();i++) 
				System.out.println(arr.get(i));
			
		}
	}
	