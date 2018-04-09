import java.util.Scanner;
// 백준 단어
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String in;
	
		int cnt=0;
		
		Scanner scn = new Scanner(System.in);
		
		in = scn.nextLine().trim(); // 트림 함수 시작과 끝 공백 제거
		scn.close();
		
		if(in.isEmpty()) { // input 값이 0이면
			System.out.println("0");
		}else {
			System.out.println(in.split(" ").length); //공백을 기준으로 나누고 길이 출력
		}
		
	}

}
