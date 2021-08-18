function solution(rows, columns, queries, ans = []) {
    let arr = [];

    // 숫자 채우기
    for (let i = 1; i <= rows; i++) {
        arr[i] = [];
        for (let j = 1; j <= columns; j++) {
            arr[i][j] = (i - 1) * columns + j;
        }
    }

    for (let i = 0; i < queries.length; i++) {
        const [r1, c1, r2, c2] = queries[i];
        const stack = [];
        for (let i = c1; i < c2; i++) stack.push(arr[r1][i]); // >
        for (let i = r1; i < r2; i++) stack.push(arr[i][c2]); // v
        for (let i = c2; i > c1; i--) stack.push(arr[r2][i]); // <
        for (let i = r2; i > r1; i--) stack.push(arr[i][c1]); // ^

        // 정답 찾기
        ans.push(Math.min(...stack));
        const temp = stack.pop();
        stack.unshift(temp);

        for (let i = c1; i < c2; i++) arr[r1][i] = stack.shift();
        for (let i = r1; i < r2; i++) arr[i][c2] = stack.shift();
        for (let i = c2; i > c1; i--) arr[r2][i] = stack.shift();
        for (let i = r2; i > r1; i--) arr[i][c1] = stack.shift();
    }

    return ans;
}

console.log(solution(3, 3, [[1,1,2,2],[1,2,2,3],[2,1,3,2],[2,2,3,3]]));