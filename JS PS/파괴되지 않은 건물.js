const ATTACK = 1;
const RECOVERY = 2;


function solution(board, skillList) {
    const dp = new Array(board.length + 1).fill().map(_ => new Array(board[0].length + 1).fill(0))

    skillList.forEach((skill) => {
        const [type, r1, c1, r2, c2, degree] = skill

        if (type === ATTACK) {
            dp[r1][c1] -= degree
            dp[r2 + 1][c2 + 1] -= degree
            dp[r1][c2 + 1] += degree
            dp[r2 + 1][c1] += degree
        }

        if (type === RECOVERY) {
            dp[r1][c1] += degree
            dp[r2 + 1][c2 + 1] += degree
            dp[r1][c2 + 1] -= degree
            dp[r2 + 1][c1] -= degree
        }
    })

    //열간 누적합
    for (let i = 0; i < dp[0].length; i++) {
        for (let j = 0; j < dp.length - 1; j++) {
            dp[j + 1][i] += dp[j][i]
        }
    }

    //행간 누적합
    for (let i = 0; i < dp.length; i++) {
        for (let j = 0; j < dp[0].length - 1; j++) {
            dp[i][j + 1] += dp[i][j]
        }
    }

    //계산
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[0].length; j++) {
            board[i][j] += dp[i][j]
        }
    }


    let ans = 0
    for (let i = 0; i < board.length; i++) {
        for (let j = 0; j < board[0].length; j++) {
            if(board[i][j] > 0) {
                ans += 1
            }
        }
    }
    return ans
}

solution([[1, 2, 3], [4, 5, 6], [7, 8, 9]], [[1, 1, 1, 2, 2, 4], [1, 0, 0, 1, 1, 2], [2, 2, 0, 2, 0, 100]])