/////////////////////////////////////////////////////////////////////////////////////////////
// �⺻ �����ڵ�� ���� �����ص� ���� �����ϴ�. ��, ����� ���� ����
// �Ʒ� ǥ�� ����� ���� �ʿ�� �����ϼ���.
// ǥ�� �Է� ����
// int a;
// double b;
// char g;
// String var;
// long AB;
// a = sc.nextInt();                           // int ���� 1�� �Է¹޴� ����
// b = sc.nextDouble();                        // double ���� 1�� �Է¹޴� ����
// g = sc.nextByte();                          // char ���� 1�� �Է¹޴� ����
// var = sc.next();                            // ���ڿ� 1�� �Է¹޴� ����
// AB = sc.nextLong();                         // long ���� 1�� �Է¹޴� ����
/////////////////////////////////////////////////////////////////////////////////////////////
// ǥ�� ��� ����
// int a = 0;                            
// double b = 1.0;               
// char g = 'b';
// String var = "ABCDEFG";
// long AB = 12345678901234567L;
//System.out.println(a);                       // int ���� 1�� ����ϴ� ����
//System.out.println(b);                                     // double ���� 1�� ����ϴ� ����
//System.out.println(g);                                     // char ���� 1�� ����ϴ� ����
//System.out.println(var);                             // ���ڿ� 1�� ����ϴ� ����
//System.out.println(AB);                                // long ���� 1�� ����ϴ� ����
/////////////////////////////////////////////////////////////////////////////////////////////
import java.util.Scanner;
import java.io.FileInputStream;
 
/*
   ����ϴ� Ŭ�������� Solution �̾�� �ϹǷ�, ������ Solution.java �� ����� ���� �����մϴ�.
   �̷��� ��Ȳ������ �����ϰ� java Solution ������� ���α׷��� �����غ� �� �ֽ��ϴ�.
 */
class Solution
{
    public static double answer;
    public static int num;
    public static boolean visit[];
    public static double[][] arr ;
    public static void main(String args[]) throws Exception
    {
        /*
           �Ʒ��� �޼ҵ� ȣ���� ������ ǥ�� �Է�(Ű����) ��� input.txt ���Ϸκ��� �о���ڴٴ� �ǹ��� �ڵ��Դϴ�.
           �������� �ۼ��� �ڵ带 �׽�Ʈ �� ��, ���Ǹ� ���ؼ� input.txt�� �Է��� ������ ��,
           �� �ڵ带 ���α׷��� ó�� �κп� �߰��ϸ� ���� �Է��� ������ �� ǥ�� �Է� ��� ���Ϸκ��� �Է��� �޾ƿ� �� �ֽ��ϴ�.
           ���� �׽�Ʈ�� ������ ������ �Ʒ� �ּ��� ����� �� �޼ҵ带 ����ϼŵ� �����ϴ�.
           ��, ä���� ���� �ڵ带 �����Ͻ� ������ �ݵ�� �� �޼ҵ带 ����ų� �ּ� ó�� �ϼž� �մϴ�.
         */
        //System.setIn(new FileInputStream("res/input.txt"));
 
        /*
           ǥ���Է� System.in ���κ��� ��ĳ�ʸ� ����� �����͸� �о�ɴϴ�.
         */
        Scanner sc = new Scanner(System.in);
        int T;
        T=sc.nextInt();
     
        /*
           ���� ���� �׽�Ʈ ���̽��� �־����Ƿ�, ������ ó���մϴ�.
        */
 
        for(int test_case = 1; test_case <= T; test_case++)
        {       
            num = sc.nextInt();
            answer = 0;
            arr = new double[num][num];
            visit = new boolean[num];
            for(int i=0;i<num;i++) {
                visit[i] = false;
            }
            for(int i=0;i<num;i++) {
                for(int j=0;j<num;j++) {
                    arr[i][j] = sc.nextInt() / (double)100;
                }
            }
            dfs(0, 1);
            answer *= 100;
            System.out.print("#"+test_case+" ");
            System.out.printf("%.6f\n", answer);
        }
    }
 
    private static void dfs(int idx, double value) {
        if(idx == num) {
            if(value> answer) {
                answer = value;
            }
        }
        else {
            for(int i=0;i<num;i++) {
                if((visit[i] == false) &&(value * arr[idx][i]> answer) ) {
                    visit[i] = true;
                    dfs(idx+1, value * arr[idx][i]);
                    visit[i] = false;
                }
            }
        }
    }
}