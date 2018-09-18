import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
 
public class Solution {
    static int max;
     
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         
        //int T = sc.nextInt();
         
        for(int test_case = 1; test_case <= 10; test_case++) {
            sc.nextInt();
             
            max = 0;
            char[][] arr = new char[100][100];
             
            for(int i = 0; i < 100; i++) {
                String s = sc.next();
                 
                for(int j = 0; j < 100; j++)
                    arr[i][j] = s.charAt(j);
            }
             
            for(int i = 0; i < 100; i++) {
                char[] buf = new char[100];
                char[] buf2 = new char[100];
                 
                for(int j = 0; j < 100; j++) {
                    buf[j] = arr[i][j];
                    buf2[j] = arr[j][i];
                }
                 
                palindrome(buf);
                palindrome(buf2);
            }
             
            System.out.println("#" + test_case + " " + max);
        }
    }
     
    public static void palindrome(char[] buf) {
        for(int i = 100; i > 0; i--) {
            if(i > max) {
                for(int j = 0; j <= 100 - i; j++) {
                    int end = j + i - 1;
                    boolean flag = true;
                     
                    for(int k = j; k < j + i / 2; k++)
                        if(buf[k] != buf[end--]) {
                            flag = false;
                             
                            break;
                        }
                     
                    if(flag)
                        max = i;
                }
            }
        }
    }
}