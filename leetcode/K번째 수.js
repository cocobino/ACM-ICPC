function solution(array, commands) {
    let answer = [];

    commands.forEach(v => {
        let arr = [...array].slice(v[0]-1, v[1]);
        arr.sort((a,b) => a-b);
        answer.push(arr[v[2]-1]);
    });
    return answer;
}

console.log(solution([1,2], [[1, 2, 1]]))