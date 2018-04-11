import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;
 
public class Main {
 
    public static void main(String[] args) throws IOException {
 
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); 
		StringTokenizer st = new StringTokenizer(br.readLine(), " ");
		// a/
		int n = Integer.parseInt(st.nextToken().trim());
		int k = Integer.parseInt(st.nextToken().trim());
 
        int result = Factorial(n) / (Factorial(n - k) * Factorial(k));
 
        System.out.println(result);
        br.close();
    }
 
    public static int Factorial(int n) {
        if (n == 1 || n == 0)
            return 1;
        else
            return Factorial(n - 1) * n;
    }
}


