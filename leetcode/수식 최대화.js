function solution(expression, calc=[]) {
    const order = [
        ["+", "-", "*"],
        ["+", "*", "-"],
        ["-", "+", "*"],
        ["-", "*", "+"],
        ["*", "+", "-"],
        ["*", "-", "+"],
    ];
    for(let i=0; i<expression.length; i++) {
        (expression[i] == '+' || expression[i] =='*' || expression[i] =='-') && calc.push(expression[i]);
    }

    let arr = expression.split(/[^0-9]/);
    arr = arr.map(v => parseInt(v));

    let rst =0;
    for(let i=0; i<order.length; i++) {
        let newArr = [...arr];
        let newCalc = [...calc];

        for(let j=0; j<order[i].length; j++) {
            for(let k=0; k<newCalc.length; k++) {
                if(order[i][j] === newCalc[k]) {
                    if(newCalc[k] === '*') {
                        newArr[k] = newArr[k]*newArr[k+1];
                        newArr.splice(k+1, 1);
                        newCalc.splice(k, 1);
                    }else if(newCalc[k] === '+') {
                        newArr[k] = newArr[k]+newArr[k+1];
                        newArr.splice(k+1, 1);
                        newCalc.splice(k, 1);
                    }else {
                        newArr[k] = newArr[k]-newArr[k+1];
                        newArr.splice(k+1, 1);
                        newCalc.splice(k, 1);
                    }
                    k--;
                }
            }
        }

        if(Math.abs(newArr[0]) >= rst) {
            rst = Math.abs(newArr[0]);
        }
    }
    return rst;



}