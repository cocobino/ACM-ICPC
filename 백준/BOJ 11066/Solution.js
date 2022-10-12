const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

let input = [];

rl.on('line', function (line) {
    input.push(line)
})
    .on('close', function () {
        // console.log(input);
        solve(input);
        process.exit();
    });


function solve(input) {
    let testcase = Number(input[0]);

    const dp = new Array(501).fill().map(_ => new Array(501).fill(0))
    const sum = new Array(501).fill(0);

    for(let tc=1; tc<=testcase; tc++) {
        const k = Number(input[tc * 2 - 1])
        const cost = [0, ...input[tc*2].split(' ').map(v => Number(v))];


        for (let i = 1; i <= k; i++) {
            sum[i] = sum[i - 1] + cost[i]
        }

        for (let d = 1; d < k; d++) {
            for (let tx = 1; tx + d <= k; tx++) {
                let ty = tx + d;
                dp[tx][ty] = 1234567890;

                for (let mid = tx; mid < ty; mid++) {
                    dp[tx][ty] = Math.min(dp[tx][ty], dp[tx][mid] + dp[mid + 1][ty] + sum[ty] - sum[tx - 1])
                }
            }
        }

        console.log(dp[1][k])
    }
}