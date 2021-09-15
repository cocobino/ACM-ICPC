function solution(new_id) {
    const downcase = `${new_id}`.toLowerCase();
    const exp = '1234567890zxcvbnmasdfghjklqwertyuiop-_.';


    let tmp = '';
    for(let i=0; i<downcase.length; i++) {
        if(exp.indexOf(downcase[i]) !== -1) {
            tmp+=`${downcase[i]}`;
        }
    }
    const removeDot = (target) => {
        let step3 = '';
        for(let i=0; i<target.length; i++) {
            if(target[i] === '.') {
                let cnt=0;
                for(let j=i+1; j<target.length; j++) {
                    if(target[j] === '.') {
                        cnt++;
                    }else break;
                }
                i+=cnt;
            }
            step3 += target[i];
        }
        target ='';
        for(let i=0; i<step3.length; i++) {
            if(i===0 && step3[i] ==='.') {
                continue;
            }
            if(i === step3.length-1 && step3[i] ==='.') {
                continue;
            }
            target += step3[i];
        }
        return target;
    }

    let step3 = removeDot(tmp);

    if(step3.length===0) step3 = 'a';

    let step5 ='';
    for(let i=0; i<step3.length; i++) {
        if(i >14) break;
        step5 += step3[i];
    }
    step5 = removeDot(step5);

    const add = step5[step5.length-1];
    if(step5.length <=2) {
        while(step5.length<=2) {
            step5+=add;
        }
    }
    return step5;
}

console.log(solution("=.="))