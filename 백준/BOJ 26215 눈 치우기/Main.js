let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().split('\n')

// const [r] = input[0].trim();
let arr = input.slice(1, input.length)[0].split(' ').map(v => Number(v)).sort((a, b) => b - a)
//1분에 1만큼 두집 || 한집 눈 1만큼 치움

let ans = 0;
while (arr.some(v => v !== 0) && ans <= 1440) {
    let cnt = 0, newArr;
    ans += 1;

    newArr = arr.map(v => {
        if (0 < v && cnt < 2) {
            cnt += 1;
            return v - 1;
        }
        return v;
    })
    arr = newArr.concat().sort((a, b) => b - a);
}

if (ans > 1440) console.log(-1)
else console.log(ans)


