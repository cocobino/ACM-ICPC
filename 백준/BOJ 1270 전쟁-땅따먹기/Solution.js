let fs = require('fs');
let std = fs.readFileSync('dev/stdin').toString().split('\n')


for (let tc = 1; tc < std.length; tc++) {
    let ans = 'SYJKGW';
    const testcase = std[tc].split(' ').map(v => v.trim());

    const map = new Map();

    for (let i = 1; i < testcase.length; i++) {
        if (map.get(testcase[i])) {
            map.set(testcase[i], parseInt(map.get(testcase[i])) + 1)
        } else {
            map.set(testcase[i], 1);
        }
    }

    for (const [k, v] of map) {
        if (v > Math.floor(parseInt(testcase[0]) / 2)) {
            ans = k
            break;
        }
    }
    console.log(ans)
}

