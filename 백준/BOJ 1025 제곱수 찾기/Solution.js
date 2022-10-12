let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().split('\n')

const [r, c] = input[0].trim().split(' ').map(v => Number(v))
const arr = input.slice(1, input.length).map((v, i) => [...v.trim().split('')])

let ans = -1;

const isSqrt = (n) => {
    let root = Math.floor(Math.sqrt(n));
    if (root * root === n) return true;
    return false;
}

for (let i = 0; i < r; i++) {
    for (let j = 0; j < c; j++) {
        for (let x = -r; x < r; x++) {
            for (let y = -c; y < c; y++) {
                if (x === 0 && y === 0) continue;

                let a = i;
                let b = j;
                let now = 0;

                while (0 <= a && a < r && 0 <= b && b < c) {
                    now *= 10;
                    now += Number(arr[a][b]);
                    if (isSqrt(now)) ans = Math.max(ans, now);
                    a += x;
                    b += y;
                }
                if (isSqrt(now)) ans = Math.max(ans, now);
            }
        }
    }
}


console.log(ans)

