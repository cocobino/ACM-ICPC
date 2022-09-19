const dx = [0, 0, 1, -1];//우, 하
const dy = [1, -1, 0, 0];
const WALL = 1;

function solution(board, ans = Infinity) {
    const dist = [];

    for (let i = 0; i < board.length; i++) {
        dist.push([])
        for (let j = 0; j < board.length; j++) {
            dist[i].push([])

            for (let k = 0; k < 4; k++) {
                dist[i][j].push(Infinity)
            }
        }
    }

    const q = [];
    q.push(new Node(0, 0, 0, 2)); //하
    q.push(new Node(0, 0, 0, 0)); //우

    for (let i = 0; i < 4; i++) {
        dist[0][0][i] = 0;
    }

    while (q.length) {
        const {x, y, v, dir} = q.shift();

        if(dist[x][y][dir] < v) {
            continue;
        }

        if(x === board.length-1 && y === board.length-1) {
            ans = Math.min(ans, v);
        }


        for (let i = 0; i < 4; i++) {
            const nx = x + dx[i];
            const ny = y + dy[i];
            const cost = i === dir ? 100 : 600;

            if (isRange(nx, ny, board.length) && board[nx][ny] !== WALL) {
                if(dist[nx][ny][i] > v + cost) {
                    dist[nx][ny][i] = v + cost;
                    q.push(new Node(nx, ny, v + cost, i));
                }

            }
        }
    }


    return ans
}

const isRange = (nx, ny, n) => {
    if (nx >= 0 && ny >= 0 && nx < n && ny < n) {
        return true
    }
    return false
}

function Node(x, y, v, dir) {
    this.x = x;
    this.y = y;
    this.v = v;
    this.dir = dir;
}