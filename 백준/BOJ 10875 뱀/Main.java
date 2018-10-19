import java.awt.Point;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;
import java.util.Stack;
import java.util.StringTokenizer;

class Main {
    
   static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
   static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
   static Scanner sc = new Scanner(System.in);
   static StringTokenizer st;
   
   static final int LEFT = 0;
   static final int UP = 1;
   static final int RIGHT = 2;
   static final int DOWN = 3;

   static final int HORIZON = 0;
   static final int VERTICAL = 1;

   static final int ROTATE_LEFT = -1;
   static final int ROTATE_RIGHT = 1;

   static final int[] dx = {0, -1, 0, 1};
   static final int[] dy = {-1, 0, 1, 0};

   static final int INF = 1_000_000_000;


   
   
    public static void main(String[] args) throws IOException {
    	int L = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());

        int size = 2 * L + 1;

        int curRow = L;
        int curCol = L;
        int curDir = RIGHT;

        // 4���� ��輱 �Է�
        ArrayList<Line> lineList = new ArrayList<>();   // line ���� ����Ʈ
        lineList.add(new Line(-1, size, size, size));           // ������ ��輱
        lineList.add(new Line(size, -1, size, size));           // �Ʒ��� ��輱
        lineList.add(new Line(-1, -1, -1, size));  // ���� ��輱
        lineList.add(new Line(-1, -1, size, -1));  // ���� ��輱

        // input & solve
        int time;
        int rotateDir;
        long collisionTime = 0L;    // �浹 �ð�
        for (int i = 0; i <= N; i++) {
            if (i < N) {

                StringTokenizer st = new StringTokenizer(br.readLine());

                time = Integer.parseInt(st.nextToken());
                rotateDir = st.nextToken().charAt(0) == 'L' ? ROTATE_LEFT : ROTATE_RIGHT;
            } else {

                // �������� �� ������ �ϳ� �߰��Ͽ� ���� ������ �浹�� �� �ְ� ���ش�
                time = INF;
                rotateDir = ROTATE_LEFT;
            }

            int t = INF;

            // ���� ���а� ����� ���е� �浹 �˻�, ���� ª�� �浹�ð��� ã�´�
            //for (Line prevLine : lineList) {
            for (int l = 0; l < lineList.size() - 2; l++) {

                Line prevLine = lineList.get(l);

                switch (curDir) {

                    case LEFT:

                        if ((prevLine.dir == HORIZON && prevLine.row1 == curRow && curCol > prevLine.col2)
                                || (prevLine.dir == VERTICAL && curRow >= prevLine.row1 && curRow <= prevLine.row2 && curCol > prevLine.col2)) {

                            t = Math.min(t, curCol - prevLine.col2);
                        }
                        break;

                    case UP:

                        if ((prevLine.dir == VERTICAL && prevLine.col1 == curCol && curRow > prevLine.row2)
                                || (prevLine.dir == HORIZON && curCol >= prevLine.col1 && curCol <= prevLine.col2 && curRow > prevLine.row2)) {

                            t = Math.min(t, curRow - prevLine.row2);
                        }
                        break;

                    case RIGHT:

                        if ((prevLine.dir == HORIZON && prevLine.row1 == curRow && curCol < prevLine.col1)
                                || (prevLine.dir == VERTICAL && curRow >= prevLine.row1 && curRow <= prevLine.row2 && curCol < prevLine.col1)) {

                            t = Math.min(t, prevLine.col1 - curCol);
                        }
                        break;

                    case DOWN:

                        if ((prevLine.dir == VERTICAL && prevLine.col1 == curCol && curRow < prevLine.row1)
                                || (prevLine.dir == HORIZON && curCol >= prevLine.col1 && curCol <= prevLine.col2 && curRow < prevLine.row1)) {

                            t = Math.min(t, prevLine.row1 - curRow);
                        }
                        break;
                }
            }

            // �浹�� ���
            if (t <= time) {

                collisionTime += t;

                System.out.println(collisionTime);
                return;
            }

            // �浹���� ���� ���
            collisionTime += time;

            // ���� ���� ����
            int nextRow = curRow + dx[curDir] * time;
            int nextCol = curCol + dy[curDir] * time;

            Line curLine = new Line(curRow, curCol, nextRow, nextCol);
            lineList.add(curLine);

            // ���� ���� ����
            curRow = nextRow;
            curCol = nextCol;
            curDir = (curDir + rotateDir + 4) % 4;
        }
    






    	
		}//main 
 
 
     
}// class

class Line {

    int row1, col1, row2, col2;
    int dir;

    Line(int row1, int col1, int row2, int col2) {

        this.row1 = row1;
        this.col1 = col1;
        this.row2 = row2;
        this.col2 = col2;

        setDirection();
        setPoint();
    }
    private void setPoint() {

        if (row1 > row2) {

            row1 ^= row2;
            row2 ^= row1;
            row1 ^= row2;
        }

        if (col1 > col2) {

            col1 ^= col2;
            col2 ^= col1;
            col1 ^= col2;
        }
    }



    private void setDirection() {

        // HORIZON
        if (this.row1 == this.row2) {

            this.dir = 0;
        }
        // VERTICAL
        else {

            this.dir = 1;
        }
    }


}