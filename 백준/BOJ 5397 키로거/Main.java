import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
	
	static String input;
	static char crypto[];
	static LinkedList<Character> cryp;
	static int Pointer=0;
	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int test_case = Integer.parseInt(br.readLine());
		
		for(int T=0; T<test_case; T++) {
		cryp =new LinkedList<Character>();
		input = br.readLine();
		crypto = input.toCharArray();
		Pointer =0;
		
		for(int i=0; i<input.length(); i++) {
			switch(crypto[i]) {
			case '-':
				backspace();
				break;
			case '<':
				moveback();
				break;
			case '>':
				movefront();
				break;
			}
			if(crypto[i] =='<' || crypto[i] =='>' || crypto[i] =='-') continue;
			//문자열, 숫자이면 crype 리스트에 너헝줌
				cryp.add(Pointer, crypto[i]);
				Pointer++;
		}
		
		for(int i=0; i<cryp.size(); i++) {
			if(!cryp.isEmpty())bw.write(String.valueOf(cryp.get(i)));
		}
		bw.write(String.valueOf("\n"));
		bw.flush();
		
			
		}// test_case loop
		bw.close();
		br.close();
		
	}
	private static void movefront() {
		// TODO Auto-generated method stub
		if(cryp.isEmpty())return;
		if(Pointer+1<=cryp.size() && !cryp.isEmpty())Pointer++;
	}
	
	private static void moveback() {
		// TODO Auto-generated method stub
		if(cryp.isEmpty())return;
		if(Pointer-1>=0 && !cryp.isEmpty())Pointer--;
	}
	
	private static void backspace() {
		// TODO Auto-generated method stub
		if(cryp.isEmpty())return;
		if(Pointer-1>=0 && !cryp.isEmpty()) { // 리스트가 비지않고, Pointer-1 이 0이 아니라면 뒷글자 제거
			cryp.remove(Pointer-1);
			Pointer--;
		}
	}
}