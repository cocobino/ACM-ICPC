function solution(numbers, target) {
    let rst =0;
    const dfs = (arr, idx, target) => {
        //end option
        if(idx == arr.length) {
            (target == arr.reduce((acc, cur) => acc+cur, 0)) && rst++;
            return;
        }
        const newArr = arr.concat();
        newArr[idx] = -newArr[idx];

        dfs(arr, idx+1, target);
        dfs(newArr, idx+1, target);
    };

    dfs(numbers, 0, target);

    return rst;
}