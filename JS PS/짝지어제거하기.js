function solution(s, rst=0) {
    let stack = [];

    for(let i=0; i<s.length; i++) {
        if(stack.length ==0) {
            stack.push(s[i]);
        } else {
            let top = stack[stack.length-1];
            let cur = s[i];
            (top != cur) ? stack.push(cur) : stack.pop();
        }
    }

    return stack.length ? 0 : 1
}

