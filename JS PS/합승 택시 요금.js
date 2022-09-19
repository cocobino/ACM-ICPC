function solution(n, s, a, b, fares) {
    const map = new Array(n).fill().map(_ => []);
    fares.forEach(([from, to, dist]) => {
        map[from - 1] = {node: to - 1, dist};
        map[to - 1] = {node: from - 1, dist};
    })

    const dp = new Array(n).fill().map(_ => new Array(n).fill(Infinity));
    for (let i = 0; i < dp.length; i++) dp[i][i] = 0;
    fares.forEach(([from, to, dist]) => {
        dp[from - 1][to - 1] = dist;
        dp[to - 1][from - 1] = dist;
    })

    for (let k = 0; k < n; k++) {
        for (let i = 0; i < n; i++) {
            for (let j = 0; j < n; j++) {
                if (dp[i][k] + dp[k][j] < dp[i][j]) dp[i][j] = dp[i][k] + dp[k][j]
            }
        }
    }

    //sol.
    let ans = dp[s - 1][a - 1] + dp[s - 1][b - 1];
    for (let i = 0; i < n; i++) {
        const min = dp[s-1][i] + dp[i][a-1] + dp[i][b-1]

        ans = Math.min(ans, min)
    }
    return ans;
}

console.log(solution(6, 4, 6, 2, [[4, 1, 10], [3, 5, 24], [5, 6, 2], [3, 1, 41], [5, 1, 24], [4, 6, 50], [2, 4, 66], [2, 3, 22], [1, 6, 25]]));