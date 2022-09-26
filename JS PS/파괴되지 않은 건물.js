const ATTACK = 1;
const RECOVERY = 2;


function solution(board, skillList) {

    const calc = (r1, c1, r2, c2, callback) => {
        for (let i = r1; i <= r2; i++) {
            for (let j = c1; j <= c2; j++) {
                callback(i, j)
            }
        }

    }

    skillList.forEach((skill) => {
        const [Type, r1, c1, r2, c2, degree] = skill

        //공격
        if (Type === ATTACK) {
            calc(r1, c1, r2, c2, (r, c) => {
                board[r][c] -= degree
            })
        }

        //회복
        if (Type == RECOVERY) {
            calc(r1, c1, r2, c2, (r, c) => {
                board[r][c] += degree
            })
        }
    })

    let ans = 0;
    calc(0, 0, board.length-1, board[0].length-1, (r, c) => {
        board[r][c] > 0 && ans++
    })


    return ans
}

solution([[5, 5, 5, 5, 5], [5, 5, 5, 5, 5], [5, 5, 5, 5, 5], [5, 5, 5, 5, 5]], [[1, 0, 0, 3, 4, 4], [1, 2, 0, 2, 3, 2], [2, 1, 0, 3, 1, 2], [1, 0, 1, 3, 3, 1]])