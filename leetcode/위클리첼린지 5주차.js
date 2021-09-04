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

function solution(word) {
    const arr = [781, 156, 31, 6, 1];

    let rst =0;

    for(let i=0; i<word.length; i++) {
        rst += 'AEIOU'.indexOf(word[i]) * arr[i] +1;
    }

    return rst;
}

console.log(solution('AA'));


console.log(solution('I'));
