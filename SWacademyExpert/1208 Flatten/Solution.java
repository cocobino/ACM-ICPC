 
import java.util.Scanner;
 
 
class Solution {
    static int Answer;
 
    public static void main(String args[]) throws Exception {
         
         
        Scanner sc = new Scanner(System.in);
         
        for(int T=1; T <=10; T++) {
             
            // dump 횟수
            int dumpCount = sc.nextInt();
            sc.nextLine();
             
            // 숫자 리스트
            String[] strNumList = sc.nextLine().trim().split(" ");
            int[] countArr = new int[101]; // 0 ~ 100
             
            // 각각의 숫자들을 카운팅
            int min=101, max=0;
            for(String strNum : strNumList) {
                int height = Integer.parseInt(strNum);
                countArr[height]++;
            }
             
             
            for(int j=0; j<=dumpCount; j++) {
                // 최대값 스캔
                for(int k=100; k>=0; k--) {
                    if(countArr[k] != 0) {
                        max = k;
                        break;
                    }
                }
                 
                // 최소값 스캔
                for(int k=0; k<=100; k++) {
                    if(countArr[k] != 0) {
                        min = k;
                        break;
                    }
                }
                 
                if(j!=dumpCount) { 
                    // 블록옴기기 ( 0 ~ dumpCount-1 까지)
                    countArr[max]--;
                    countArr[max-1]++;
                    countArr[min]--;
                    countArr[min+1]++;
                }
            }
             
             
            // 높이차 출력
            System.out.println(String.format("#%d %d", T, max-min) );
             
        }
         
    }
}
 