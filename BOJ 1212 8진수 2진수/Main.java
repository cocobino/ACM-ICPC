import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws Exception {
		// ���۸� ���� �Է��� ����
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String numStr = br.readLine();
		br.close();

		// ���ڿ��� ���̸� ����
		int numStrLen = numStr.length();

		// ���۸� ���� ��� ���� ����
		StringBuilder sb = new StringBuilder();

		// ù°�ڸ� ���� 0���� ���� �� �� �����Ƿ� ����ó��
		switch (numStr.charAt(0)) {
		case '0':
			sb.append("0");
			break;

		case '1':
			sb.append("1");
			break;

		case '2':
			sb.append("10");
			break;

		case '3':
			sb.append("11");
			break;

		case '4':
			sb.append("100");
			break;

		case '5':
			sb.append("101");
			break;

		case '6':
			sb.append("110");
			break;

		case '7':
			sb.append("111");
			break;
		}

		// ������ �ڸ� 2������ ��ȯ
		for (int i = 1; i < numStrLen; i++) {
			switch (numStr.charAt(i)) {
			case '0':
				sb.append("000");
				break;

			case '1':
				sb.append("001");
				break;

			case '2':
				sb.append("010");
				break;

			case '3':
				sb.append("011");
				break;

			case '4':
				sb.append("100");
				break;

			case '5':
				sb.append("101");
				break;

			case '6':
				sb.append("110");
				break;

			case '7':
				sb.append("111");
				break;
			}
		}

		// ��� �� ���
		System.out.println(sb.toString());
	}
}
