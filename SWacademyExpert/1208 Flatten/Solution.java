 
import java.util.Scanner;
 
 
class Solution {
    static int Answer;
 
    public static void main(String args[]) throws Exception {
         
         
        Scanner sc = new Scanner(System.in);
         
        for(int T=1; T <=10; T++) {
             
            // dump Ƚ��
            int dumpCount = sc.nextInt();
            sc.nextLine();
             
            // ���� ����Ʈ
            String[] strNumList = sc.nextLine().trim().split(" ");
            int[] countArr = new int[101]; // 0 ~ 100
             
            // ������ ���ڵ��� ī����
            int min=101, max=0;
            for(String strNum : strNumList) {
                int height = Integer.parseInt(strNum);
                countArr[height]++;
            }
             
             
            for(int j=0; j<=dumpCount; j++) {
                // �ִ밪 ��ĵ
                for(int k=100; k>=0; k--) {
                    if(countArr[k] != 0) {
                        max = k;
                        break;
                    }
                }
                 
                // �ּҰ� ��ĵ
                for(int k=0; k<=100; k++) {
                    if(countArr[k] != 0) {
                        min = k;
                        break;
                    }
                }
                 
                if(j!=dumpCount) { 
                    // ��Ͽȱ�� ( 0 ~ dumpCount-1 ����)
                    countArr[max]--;
                    countArr[max-1]++;
                    countArr[min]--;
                    countArr[min+1]++;
                }
            }
             
             
            // ������ ���
            System.out.println(String.format("#%d %d", T, max-min) );
             
        }
         
    }
}
 