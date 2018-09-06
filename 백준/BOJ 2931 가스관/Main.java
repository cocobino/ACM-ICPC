import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    static final int BLANK = 10;
    static final int START = 11;
    static final int END = 12;

    static final int BLOCK_1 = 1;
    static final int BLOCK_2 = 2;
    static final int BLOCK_3 = 3;
    static final int BLOCK_4 = 4;
    static final int BLOCK_C = 5;
    static final int BLOCK_V = 6;
    static final int BLOCK_H = 7;

    static final int WEST = 0;
    static final int NORTH = 1;
    static final int EAST = 2;
    static final int SOUTH = 3;
    static final int FALSE = 5;

    static final int[] dRow = {0, -1, 0, 1};
    static final int[] dCol = {-1, 0, 1, 0};
    static final char[] pipeArr = {'.', '1', '2', '3', '4', '+', '|', '-'};

    static int R, C;
    static int[][] map = new int[26][26];

    public static void main(String[] args) throws IOException {

        int sRow = 0, sCol = 0;
        int eRow = 0, eCol = 0;

        // input
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        R = Integer.parseInt(st.nextToken());
        C = Integer.parseInt(st.nextToken());

        for (int i = 0; i < R; i++) {

            String s = br.readLine();
            for (int j = 0; j < C; j++) {

                char c = s.charAt(j);

                switch (c) {

                    case '.':
                        map[i][j] = BLANK;
                        break;

                    case 'M':
                        map[i][j] = START;
                        sRow = i;
                        sCol = j;
                        break;

                    case 'Z':
                        map[i][j] = END;
                        eRow = i;
                        eCol = j;
                        break;

                    case '|':
                        map[i][j] = BLOCK_V;
                        break;

                    case '-':
                        map[i][j] = BLOCK_H;
                        break;

                    case '+':
                        map[i][j] = BLOCK_C;
                        break;

                    default:
                        map[i][j] = c - '0';
                        break;
                }

            }
        }

        // solve
        // M�������� ������ ������ �����Ѵ�. return ������ ���, ���Ա� ����
        Node M = null;
        for (int dir = 0; dir < 4; dir++) {

            int nextRow = sRow + dRow[dir];
            int nextCol = sCol + dCol[dir];

            if (nextRow < 0 || nextRow >= R || nextCol < 0 || nextCol >= C) continue;

            // ����� ���� ������ ���� �� ��ȿ�� ���(������)�� ã�´�.
            if (getStartNode(nextRow, nextCol, dir)) {

                M = traceRoute(nextRow, nextCol, dir);
            }
        }

        // Z�������� ������ ������ �����Ѵ�. return ������ ���, ���Ա� ����
        Node Z = null;
        for (int dir = 0; dir < 4; dir++) {

            int nextRow = eRow + dRow[dir];
            int nextCol = eCol + dCol[dir];

            if (nextRow < 0 || nextRow >= R || nextCol < 0 || nextCol >= C) continue;

            // ����� ���� ������ ���� �� ��ȿ�� ���(������)�� ã�´�.
            if (getStartNode(nextRow, nextCol, dir)) {

                Z = traceRoute(nextRow, nextCol, dir);
            }
        }

        // ã�Ƴ� ������ ��� �ֺ��� ��ȿ�h �������� ����� Ȯ��, 3�� �̻��� ��� + �������� ���� �Ѵ�
        int cnt = 0;
        for (int dir = 0; dir < 4; dir++) {

            int nextRow = M.row + dRow[dir];
            int nextCol = M.col + dCol[dir];

            if (nextRow < 0 || nextRow >= R || nextCol < 0 || nextCol >= C) continue;

            if (getStartNode(nextRow, nextCol, dir)) {

                cnt++;
            }
        }

        // ��� ���
        if (cnt >= 3) {

            // + �������� ���
            System.out.println((M.row + 1) + " " + (M.col + 1) + " " + pipeArr[BLOCK_C]);
        } else {

            // + �������� �ƴ� ���, ���Ա� ���� 2���� �̿��Ͽ� �������� ã�´�
            System.out.println((M.row + 1) + " " + (M.col + 1) + " " + getBlock(M.entrance | Z.entrance));
        }
    } // ~main

    // + �������� �ƴ� ���, ���Ա� ���� 2���� �̿��Ͽ� �������� ã�´�
    static char getBlock(int enterance) {

        if ((enterance & (1 << NORTH)) > 0
                && (enterance & (1 << SOUTH)) > 0) {

            return pipeArr[BLOCK_V];
        }

        if ((enterance & (1 << WEST)) > 0
                && (enterance & (1 << EAST)) > 0) {

            return pipeArr[BLOCK_H];
        }

        if ((enterance & (1 << EAST)) > 0
                && (enterance & (1 << SOUTH)) > 0) {

            return pipeArr[BLOCK_1];
        }

        if ((enterance & (1 << NORTH)) > 0
                && (enterance & (1 << EAST)) > 0) {

            return pipeArr[BLOCK_2];
        }

        if ((enterance & (1 << WEST)) > 0
                && (enterance & (1 << NORTH)) > 0) {

            return pipeArr[BLOCK_3];
        } else {

            return pipeArr[BLOCK_4];
        }
    }

    // (row, col) ��尡 ��ȿ����(������� ����� ����������) �Ǵ��Ѵ�.
    static boolean getStartNode(int row, int col, int inlet) {

        if (map[row][col] >= BLOCK_1 && map[row][col] <= BLOCK_H) {

            inlet = (inlet + 2) % 4;

            if (getOutlet(map[row][col], inlet) != FALSE) return true;
        }

        return false;
    }

    // ��� ����
    static Node traceRoute(int row, int col, int inlet) {

        if (map[row][col] >= BLOCK_1 && map[row][col] <= BLOCK_H) {

            inlet = (inlet + 2) % 4;

            int outlet = getOutlet(map[row][col], inlet);

            int nextRow = row + dRow[outlet];
            int nextCol = col + dCol[outlet];

            return traceRoute(nextRow, nextCol, outlet);
        } else if (map[row][col] == BLANK) {

            return new Node(row, col, 1 << ((inlet + 2) % 4));
        }

        return null;
    }

    // �������� �Ա� ��ġ�� �Է¹ް�, �ⱸ ��ġ�� ��ȯ�Ѵ�
    static int getOutlet(int pipe, int inlet) {

        int outlet = 0;

        switch (pipe) {

            case BLOCK_1:
                outlet = inlet == SOUTH ? EAST : inlet == EAST ? SOUTH : FALSE;
                break;

            case BLOCK_2:
                outlet = inlet == NORTH ? EAST : inlet == EAST ? NORTH : FALSE;
                break;

            case BLOCK_3:
                outlet = inlet == WEST ? NORTH : inlet == NORTH ? WEST : FALSE;
                break;

            case BLOCK_4:
                outlet = inlet == WEST ? SOUTH : inlet == SOUTH ? WEST : FALSE;
                break;

            case BLOCK_C:
                outlet = inlet == WEST ? EAST : inlet == NORTH ? SOUTH : inlet == EAST ? WEST : NORTH;
                break;

            case BLOCK_V:
                outlet = inlet == NORTH ? SOUTH : inlet == SOUTH ? NORTH : FALSE;
                break;

            case BLOCK_H:
                outlet = inlet == WEST ? EAST : inlet == EAST ? WEST : FALSE;
                break;
        }

        return outlet;
    }
}

class Node {

    int row, col;
    int entrance;

    Node(int row, int col, int entrance) {

        this.row = row;
        this.col = col;
        this.entrance = entrance;
    }
}


