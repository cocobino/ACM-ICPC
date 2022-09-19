/**
 * @param {string} s
 * @return {boolean}
 */
var isValid = function(s) {
    let stack = [];
    for(let i=0; i<s.length; i++) {
        switch (s[i]) {
            case ')':
                if(stack.pop() !== '(') return false;
                break;
            case ']':
                if(stack.pop() !== '[') return false;
                break;
            case '}':
                if(stack.pop() !== '{') return false;
                break;
            default :
                stack.push(s[i]);
                break;
        }
    }
    return !stack.length;
};