import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
	

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		Main main = new Main();
		main.solve();
 
 }
	static int[][] road;
	static int[] height;
	static int n, l;
	 
	private void solve() {
		Scanner sc = new Scanner(System.in);
	    n = sc.nextInt();
	    l = sc.nextInt();
	    road = new int[n * 2][n];
	    int ans = n * 2;
	 
	    for (int i = 0; i < n; i++) {
	        for (int j = 0; j < n; j++) {
	            road[i][j] = sc.nextInt();
	        }
	    }
	 
	    for (int i = n; i < n * 2; i++) {
	        for (int j = 0; j < n; j++) {
	            road[i][j] = road[j][i - n];
	        }
	    }
	 
	    // 높은 칸을 만났을 경우 => 지나온 길을 통해 경사로 배치 판단 가능.
	    // 낮은 칸을 만났을 경우 => 낮은 칸부터 길을 지나가면서 경사로를 배치할 수 있는 지 판단해야함.
	 
	    for (int i = 0; i < n * 2; i++) {
	        int target = road[i][0];
	        height = new int[11];
	        height[target] = 1;
	        int j = 1;
	        while (j < n) {
	            int next = road[i][j];
	            if (!vaildHeight(target, next)) {
	                // 높이 차가 1보다 크면 경사로 배치 불가능
	                --ans;
	                break;
	            }
	            if (target != next) {
	                if (target < next) {
	                    // 높은 칸 만났을 경우
	                    if (!high(target, next)) {
	                        --ans;
	                        break;
	                    }
	                } else {
	                    // 낮은 칸 만났을 경우
	                    if (!low(i, j, target, next)) {
	                        --ans;
	                        break;
	                    }
	                    j += l - 1;
	                }
	                // 기준이 되는 칸 갱신
	                target = next;
	            } else {
	                // 같은 높이의 칸을 뜻하기 때문에, L의 길이를 갖는 경사로 배치 판단을 위한 카운터 증가
	                height[target]++;
	            }
	            j++;
	        }
	    }
	    System.out.println(ans);
	}
	 
	public static boolean low(int i, int j, int target, int next) {
	    // 길이가 L인 경사로를 놓을 수 있는지만 판단하면 되기에 l 만큼 돌린다.
	    for (int k = 0; k < l; k++) {
	        if (j + k == n) {
	            break;
	        }
	        if (road[i][j + k] == next) {
	            height[next]++;
	        }
	    }
	    if (height[next] < l) {
	        return false;
	    }
	    height[next] -= l;
	    return true;
	}
	 
	public static boolean high(int target, int next) {
	    if (height[target] < l) {
	        return false;
	    }
	    // 다음을 위해 카운터 배열 갱신
	    height[target] = 0;
	    height[next] = 1;
	    return true;
	}
	 
	public static boolean vaildHeight(int a, int b) {
	    int gap = Math.abs(a - b);
	    if (gap > 1) {
	        return false;
	    }
	    return true;
	}    



}