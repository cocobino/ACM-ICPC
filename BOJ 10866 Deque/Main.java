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
		
		
		int T = Integer.parseInt(br.readLine());
		
		
		for(int i=0; i<T; i++) {
			String input = br.readLine();
		String []strArr = input.split(" ");
			
			switch(strArr[0]) {
			case "push_front":
				dq.addFirst(Integer.parseInt(strArr[1]));
				break;
				
			case "push_back":
				dq.addLast(Integer.parseInt(strArr[1]));
				break;
				
			case "pop_front":
				System.out.println(dq.isEmpty()? -1 : dq.removeFirst());
				break;
				
			case "pop_back":
				System.out.println(dq.isEmpty()? -1 : dq.removeLast());
				break;
				
			case "size":
				System.out.println(dq.size());
				break;
								
			case "empty":
				System.out.println(dq.isEmpty()? 1 : 0);
				break;
				
			case "front":
				System.out.println(dq.isEmpty()? -1 : dq.peekFirst());
				break;
			
			case "back":
				System.out.println(dq.isEmpty()? -1 : dq.peekLast());
				break;
			}
		}
		br.close();
	}
	
	}
	
