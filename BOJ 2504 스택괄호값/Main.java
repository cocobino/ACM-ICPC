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
			
			switch(charr[i]) { //배열 인덱스에따라 하나하나 검사
			case '(':
				s.push(charr[i]); 
				a++; //개수 카운트
				mul*=2;
				if(i+1<input.length() && charr[i+1] == ')') cnt += mul; // '(' 다음값이바로 ')' 이면 2곱해서 cnt 값에 저장
				break;
			case '[':
				s.push(charr[i]);
				b++; // 개수 카운트
				mul*=3;
				if(i+1<input.length() && charr[i+1] == ']') cnt += mul; // '[' 다음 값이바로 ']'이면 3곱해서 cnt 값에 저장 
				break;
			case ')':
				s.pop();
				a--;
				mul /=2;
				break;
			case ']':
				s.pop();
				b--;
				mul/=3;
				break;
			}
			
		} // for 문 끝
		
		if( s.size() !=0 || a !=0 || b != 0)System.out.println(0);
		else System.out.println(cnt);
		br.close();
	}
	
	}
	