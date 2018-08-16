import java.util.Scanner;

public class Main {
  public static void main(String args[]){
    Scanner scan = new Scanner(System.in);
    int n = scan.nextInt();
    int[] arr = new int[n];
    int[] dp = new int[n];
    for(int i = 0; i < n; i++){
      arr[i] = scan.nextInt();
    }

    for(int i = 1; i < n; i++){
      for(int j = 0; j < i; j++){
        if(arr[i] < arr[j]){ // ---- 1
          if(dp[j] + 1 > dp[i]){ // ---- 2
            dp[i] = dp[j] + 1;
          }
        }
      }
    }

    int max = dp[0];
    for(int i = 1; i < n; i++){
      if(max < dp[i]){
        max = dp[i];
      }
    }

    System.out.println(max + 1);
  }
}