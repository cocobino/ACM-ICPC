function solution(word) {
    const dirlist = ['A', 'E', 'I', 'O', 'U'];
    let arr = [];

    const mkdir = (s) => {
        if(s.length === 5) {
            return;
        }

        dirlist.forEach(v => {
            const str = `${s+v}`;
            arr.push(str);
            mkdir(str);
        });
    };

    let rst=0;
    mkdir('');
    arr.sort();
    arr.some((v,idx) => {
        if(v === word) {
            rst = idx+1;
            return true;
        }
    })
    return rst;
}

console.log(solution('I'));
