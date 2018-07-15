import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {

    static boolean[][] visited = new boolean[31][31];
    static double[] p = new double[4]; // �� �������� �̵��� Ȯ��
    static int[] dx = {1, -1, 0, 0};
    static int[] dy = {0, 0, 1, -1};

    public static void main(String[] args) throws IOException {

        int N; // �κ��� �ൿ ��, 1 <= N <= 14

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(st.nextToken());

        for (int i = 0; i < 4; i++) {

            p[i] = Integer.parseInt(st.nextToken()) / (double) 100;
        }

        System.out.println(backtracking(N, 15, 15));
    }

    // (x, y) ��ġ���� N��ŭ �� �̵��� �� �ܼ� ��ΰ� �� Ȯ��
    static double backtracking(int N, int x, int y) {

        // ���� �ܰ迡�� 1�� �̵��� �� �ܼ� ��ΰ� �� Ȯ��
        if (visited[y][x]) {

            return 0.0;
        }

        // ���� �ܰ迡�� 1�� �̵��� �� �ܼ� ��ΰ� �� Ȯ��
        if (N == 0) {

            return 1.0;
        }

        visited[y][x] = true;

        double ret = 0.0;
        for (int i = 0; i < 4; i++) {

            ret += p[i] * backtracking(N - 1, x + dx[i], y + dy[i]);
        }

        // �ٸ� ��η� �� �湮�� �� �����Ƿ� false�� �������ش�
        visited[y][x] = false;

        return ret;
    }
}


