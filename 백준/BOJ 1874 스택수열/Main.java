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
		int index =0; //�迭 ������
		
		
		int input = Integer.parseInt(br.readLine());
		int inarr[] = new int[input];
		
		for(int i=0; i<input; i++) { //�׽�Ʈ���̽� �Է°� �ޱ�
		inarr[i] =Integer.parseInt(br.readLine()); 	 
		}
		
		for(int i=1; i<=input; i++) { // ������������ stack, list ��  ����, +,- �� ����
			s.add(i);
			arr.add('+');
			
			while(!s.isEmpty() && inarr[index] == (int)s.peek()) { //������ ��������ʰ� ���� �ֻ�������
																	// �ε����� ����Ű�� �迭���� ���� ��ũ ���� ���������� for������ �������� �ݺ�
				index++; // ���� �ε��� �Ѿ
				s.pop(); // ���� ����
				arr.add('-'); // �����ϸ鼭 - ���
			}
		}
		
		if(!s.isEmpty()) {
			System.out.println("NO");
		}else
			for(int i =0; i<arr.size();i++) 
				System.out.println(arr.get(i));
			
		}
	}
	