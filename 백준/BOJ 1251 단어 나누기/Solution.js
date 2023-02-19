let fs = require('fs');
let input = fs.readFileSync('dev/stdin').toString().split('\n')

const [testcase] = input

//세단어 나누기

let ans = 'zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz'


const dfs = (cur, acc, depth) => {
    if(depth ===3) {
        const [i,j,k] = acc;

        const a = testcase.substring(i,j).split('').reverse().join('')
        const b = testcase.substring(j,k).split('').reverse().join('')
        const c = testcase.substring(k,testcase.length).split('').reverse().join('')

        ans = ans < a + b + c ? ans : a + b + c;
        return;
    }

    for(let i=cur; i<testcase.length; i++) {
        dfs(i+1, [...acc, cur],depth+1)
    }

}

dfs(0, [], 0)

console.log(ans)
