import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Stack<Character> s = new Stack<Character>();
		String input = br.readLine().trim(); // ��ȣ�Է�
		char[] charr = input.toCharArray(); //�Է°� �迭�� ��ȯ
		int cnt =0, mul=1;
		int a=0,b=0; // a = (  , b = [ ī��Ʈ
		
		for(int i=0; i<input.length();i++) {
			
			switch(charr[i]) { //�迭 �ε��������� �ϳ��ϳ� �˻�
			case '(':
				s.push(charr[i]); 
				a++; //���� ī��Ʈ
				mul*=2;
				if(i+1<input.length() && charr[i+1] == ')') cnt += mul; // '(' �������̹ٷ� ')' �̸� 2���ؼ� cnt ���� ����
				break;
			case '[':
				s.push(charr[i]);
				b++; // ���� ī��Ʈ
				mul*=3;
				if(i+1<input.length() && charr[i+1] == ']') cnt += mul; // '[' ���� ���̹ٷ� ']'�̸� 3���ؼ� cnt ���� ���� 
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
			
		} // for �� ��
		
		if( s.size() !=0 || a !=0 || b != 0)System.out.println(0);
		else System.out.println(cnt);
		br.close();
	}
	
	}
	