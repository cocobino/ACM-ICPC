import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;
 
public class Solution {
    static int x_start;
    public static void main(String args[]) throws FileNotFoundException{
        int [][]data = new int[100][100];
        //System.setIn(new FileInputStream("input.txt"));
        Scanner sc = new Scanner(System.in);
        for (int i = 1; i < 11; i++){
            int x_target = 0;
            int y_target = 99;
            int test_case = sc.nextInt();
            for (int y = 0; y < 100; y++){
                for (int x = 0; x < 100; x++){
                    data[y][x] = sc.nextInt();
                    if (data[y][x] == 2){
                        x_target = x;
                        y_target = y;
                    }
                }
            }
            goroute(data, y_target, x_target);
            System.out.println("#" + test_case + " " + x_start);
        }
    }
    public static void goroute(int [][]data, int y, int x){
        //Go left
        if ( x >= 1 && data[y][x - 1] == 1){
            x--;
            data[y][x] = -1;
            goroute(data, y, x);
        }
        //Go right
        if ( x < 99 && data[y][x + 1] == 1){
            x++;
            data[y][x] = -1;
            goroute(data, y, x);
        }
        //Go up
        if ( y > 0 && data[y - 1][x] == 1){
            y--;
            data[y][x] = -1;
            goroute(data, y, x);
        }
        if ( y <= 0 ){
            x_start = x;
            return;
        }
    }
}