let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().split('\n')

const [testcase] = input

//세단어 나누기

let ans = 'zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz'

let i = 0, j = 1, k = 2, flag = true

for (i = 0; i < testcase.length && flag; i++) {
    for (j = i + 1; j < k && flag; j++) {
        for (k = j + 1; k < testcase.length && flag; k++) {

            if (i > 0) {
                flag = false;
                break;
            }

            const a = testcase.substring(i, j).split('').reverse().join('')
            const b = testcase.substring(j, k).split('').reverse().join('')
            const c = testcase.substring(k, testcase.length).split('').reverse().join('')

            ans = ans < a + b + c ? ans : a + b + c;
        }
    }
}

console.log(ans)