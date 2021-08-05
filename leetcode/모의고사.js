function solution(answers, rst=[0,0,0]) {
    let a = [1,2,3,4,5];
    let b = [2,1,2,3,2,4,2,5];
    let c = [3,3,1,1,2,2,4,4,5,5];

    let tmp =0, flag = false;
    answers.forEach((v,idx) => {
        (a[idx%a.length] == v) && rst[0]++;
        (b[idx%b.length] == v) && rst[1]++;
        (c[idx%c.length] == v) && rst[2]++;
        tmp = Math.max(rst[0], rst[1], rst[2]);
    });


    let ans = [];
    rst.forEach((v,idx) => v==tmp && ans.push(idx+1));
    ans.sort();

    return ans;
}