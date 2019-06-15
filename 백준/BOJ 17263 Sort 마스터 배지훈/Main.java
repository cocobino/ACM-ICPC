import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) throws Exception{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int max = 0;
		
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			if(tmp > max) max = tmp;
		}
		
		System.out.println(max);
	}
}