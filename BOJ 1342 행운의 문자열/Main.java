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
	    // i는 증가하지 않은 가장 긴 접미사 인덱스
	    // 1234 => 3 1243 => 2 1324 => 3 1342 => 2 1423 => 3 1432 => 1
	    // 1243 43 증가하고 있지 않음으로 4의 인덱스. 1432 432 증가하고 있지 않으므로 4의 인덱스.
	    // 현재 i는 접미사의 헤드 인덱스.
	 
	    // 마지막 변경이 되었을 때 4321일 경우 i는 위의 접미사 인덱스를 구하는 과정에서 -1이 됨.
	    if (i <= 0)
	        return false;
	 
	    // array[i - 1] 요소를 피벗으로 정함.
	    // 위의 피벗과 스왑할 피벗을 초과한 가장 오른쪽 요소를 찾음.
	    int j = array.length - 1;
	    while (array[j] <= array[i - 1]) {
	        j--;
	    }
	    // array[j] <= array[i - 1] 조건인 이유는.
	    // array[j]는 array[i - 1]보다 항상 커야하기 때문이다.
	    // => 사전 순으로 모든 경우의 수를 들려야하기 때문.
	    // array[i - 1] 와 array[j]를 이용하여 새로운 피벗 구함.
	    // array[j] 요소가 새로운 피벗이 된다.
	    // Assertion: j >= i
	 
	    // 피벗 2개는 서로 스왑에 이용하기 위해 사용됨.
	    // 새로운 피벗을 이용하여 스왑.
	    char temp = array[i - 1];
	    array[i - 1] = array[j];
	    array[j] = temp;
	 
	    // 위의 과정이 일어나더라도 사전순으로 되지 않음.
	    // 접미사 인덱스를 활용하여 반대로 만들어준다.
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