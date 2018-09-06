import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	 long N = Integer.parseInt(br.readLine());
	 long cnt = Integer.parseInt(br.readLine());
	 long n = N - 1;
	 if (cnt > 0) {
		 if (N % 4 == 1) n += 8 * cnt; 
		 else n += cnt / 2 * 8 + cnt % 2 * (8 - (N - 1) * 2); 
		 }
	 bw.write(String.valueOf(n)); 
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Stack;
import java.util.StringTokenizer;


public class Main {
	
	public static void main(String... args) throws IOException {
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	  char[] array = br.readLine().toCharArray();
	    int ans = 0;
	    Arrays.sort(array);
	    while (true) {
	        if (isLuckey(array)) {
	            ++ans;
	        }
	        if (!nextPermutation(array)) {
	            break;
	        }
	    }
	    System.out.println(ans);
	}
	 
	static boolean isLuckey(char[] array) {
	    int len = array.length;
	 
	    for (int i = 0; i < len - 1; i++) {
	        if (array[i] == array[i + 1]) {
	            return false;
	        }
	    }
	    return true;
	}
	 
	static boolean nextPermutation(char[] array) {
	    int i = array.length - 1;
	    while (i > 0 && array[i - 1] >= array[i]) {
	        i--;
	    }
	    // i�� �������� ���� ���� �� ���̻� �ε���
	    // 1234 => 3 1243 => 2 1324 => 3 1342 => 2 1423 => 3 1432 => 1
	    // 1243 43 �����ϰ� ���� �������� 4�� �ε���. 1432 432 �����ϰ� ���� �����Ƿ� 4�� �ε���.
	    // ���� i�� ���̻��� ��� �ε���.
	 
	    // ������ ������ �Ǿ��� �� 4321�� ��� i�� ���� ���̻� �ε����� ���ϴ� �������� -1�� ��.
	    if (i <= 0)
	        return false;
	 
	    // array[i - 1] ��Ҹ� �ǹ����� ����.
	    // ���� �ǹ��� ������ �ǹ��� �ʰ��� ���� ������ ��Ҹ� ã��.
	    int j = array.length - 1;
	    while (array[j] <= array[i - 1]) {
	        j--;
	    }
	    // array[j] <= array[i - 1] ������ ������.
	    // array[j]�� array[i - 1]���� �׻� Ŀ���ϱ� �����̴�.
	    // => ���� ������ ��� ����� ���� ������ϱ� ����.
	    // array[i - 1] �� array[j]�� �̿��Ͽ� ���ο� �ǹ� ����.
	    // array[j] ��Ұ� ���ο� �ǹ��� �ȴ�.
	    // Assertion: j >= i
	 
	    // �ǹ� 2���� ���� ���ҿ� �̿��ϱ� ���� ����.
	    // ���ο� �ǹ��� �̿��Ͽ� ����.
	    char temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	 
	    // ���� ������ �Ͼ���� ���������� ���� ����.
	    // ���̻� �ε����� Ȱ���Ͽ� �ݴ�� ������ش�.
	    j = array.length - 1;
	    while (i < j) {
	        temp = array[i];
	        array[i] = array[j];
	        array[j] = temp;
	        i++;
	        j--;
	    }
	 
	    // Successfully computed the next permutation
	    return true;
	}


}