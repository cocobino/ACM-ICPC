function solution(numbers, hand) {
    const map = {};
    for(let i=0; i<12; i++) {
        if(i== 11) { map[0] = {r:3,c:1}; }
        map[`${i+1}`] = {r:Math.floor((i)/3),c:(i)%3};
    }
    let rst = '';
    let lpos={r:3,c:0};
    let rpos={r:3,c:2};


    numbers.forEach(num => {
        if('147'.includes(`${num}`)) {
            lpos = map[num];
            rst+='L';
        } else if('369'.includes(`${num}`)) {
            rpos = map[num]
            rst+='R'
        } else {
            const ldist =  Math.abs(map[num].r - lpos.r)+Math.abs(map[num].c - lpos.c);
            const rdist = Math.abs(map[num].r - rpos.r)+Math.abs(map[num].c - rpos.c);

            if(ldist > rdist) {
                rpos = map[num];
                rst+='R';
            } else if(ldist < rdist) {
                lpos = map[num];
                rst+='L';

            } else {
                if(hand === 'right') {rpos = map[num]; rst+='R';} else { lpos = map[num]; rst+='L';}
            }
        }
    });

    return rst;
}