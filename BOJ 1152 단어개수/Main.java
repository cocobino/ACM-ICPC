import java.util.Scanner;
// ���� �ܾ�
public class Main {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String in;
	
		int cnt=0;
		
		Scanner scn = new Scanner(System.in);
		
		in = scn.nextLine().trim(); // Ʈ�� �Լ� ���۰� �� ���� ����
		scn.close();
		
		if(in.isEmpty()) { // input ���� 0�̸�
			System.out.println("0");
		}else {
			System.out.println(in.split(" ").length); //������ �������� ������ ���� ���
		}
		
	}

}
