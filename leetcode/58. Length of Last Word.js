/**
 * @param {string} s
 * @return {number}
 */
var lengthOfLastWord = function(s) {
    let cnt=0;
    let exp = /[a-zA-Z]/g;
    for(let i=s.length-1; i>=0; i--) {
        if(s[i] !== ' ') {
            cnt++;
        } else {
            if(cnt !=0 ) break;
        }
    }

    return cnt;
};