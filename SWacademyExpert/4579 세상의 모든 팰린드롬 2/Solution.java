import java.io.IOException;
import java.util.Scanner;
 
public class Solution {
    static int[][] arr;
    static int n;
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int tc = sc.nextInt();
        for(int i=1;i<=tc;i++) {
            String t = sc.next();
            boolean flag = true;
            for(int j=0;j<t.length();j++) {
                if(t.charAt(j)!=t.charAt(t.length()-j-1)) {
                    flag = false;
                    if(t.charAt(j)=='*'||t.charAt(t.length()-j-1)=='*')
                        flag = true;
                }
            }
            if(flag) System.out.println("#"+i+" "+"Exist");
            else System.out.println("#"+i+" "+"Not exist");
        }            
    }
}
