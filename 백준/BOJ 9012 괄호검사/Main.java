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
			
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    
	static  int input; //T �Է°�
	static String ps; // ��ȣ �Է°�
	static int cnt[]; // cnt �� �迭����
	
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int input = Integer.parseInt(br.readLine()); //test ���̽� �Է°�
		cnt = new int[input];
		
		for(int i=0; i<input; i++) {
			ps = br.readLine();
			cnt[i] = cal(ps); // �żҵ� ȣ��
		}
		
		for( int i=0; i<input; i++) {
			if(cnt[i] != 0) { //cnt ���� 0�̸� YES, 0�� �ƴϸ� NO
			System.out.println("NO");
			}else System.out.println("YES");
		}
		
		
		
			
		}

	public static int cal(String ps) {
		// TODO Auto-generated method stub
		int cnt =0;
		
		char[] charr = ps.toCharArray();  //��ȣ �Է°��� char �迭�� ���ġ
		
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
	