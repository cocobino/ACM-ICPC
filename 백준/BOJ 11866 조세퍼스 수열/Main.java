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
			dq.addLast(i); //dq �� �Է°� ä���ֱ�
		}
		
		while(!dq.isEmpty()) { // ��ť�� �������� �ݺ�
			
			for(int j=0; j<b-1;j++){ // ������ index ��ġ���� ȸ��
				dq.addLast(dq.removeFirst()); //  �������� ������ �־ ��ġ
			}
			sb.append(dq.removeFirst()+", "); // ù��° index ���
		}
		System.out.println(sb.toString().substring(0, sb.length()-2) + ">");

	}
	
	}