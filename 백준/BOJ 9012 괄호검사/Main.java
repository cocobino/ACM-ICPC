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
		
		
		
			
		}

	public static int cal(String ps) {
		// TODO Auto-generated method stub
		int cnt =0;
		
		char[] charr = ps.toCharArray();  //괄호 입력값을 char 배열로 재배치
		
		for(int i =0 ; i<charr.length; i++) {
			
		if(cnt<0)
			return -1;
		
		if(charr[i] =='(') {
			cnt++;
			continue;
		}
		if(charr[i] == ')') {
			cnt--;
			continue;
		}
		}
		return cnt;
	}
	
	}
	