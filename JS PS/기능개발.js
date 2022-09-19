function solution(progresses, speeds, rst= []) {
    const tmp = progresses.map((v, idx) => Math.ceil((100-v)/speeds[idx]));
    if(tmp.length ===1) return [1];
    let prev=tmp.shift(), cnt=1;

    while(tmp.length) {
        const cur =tmp.shift();

        if(prev >= cur) {
            cnt++;
        } else {
            rst = [...rst, cnt];
            prev = cur;
            cnt=1;
        }
    }
    rst = [...rst, cnt];

    return rst;
}