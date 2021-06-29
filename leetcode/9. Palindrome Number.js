/**
 * @param {number} x
 * @return {boolean}
 */
var isPalindrome = function(x) {
    if(x<0)return false;

    //짝수
    let charset = (x+'');
    if(charset.length%2 === 0) {
        for(let i=parseInt(charset.length/2),j=parseInt((charset.length/2)-1); i<charset.length; i++,j--) {
            if(charset[i] !== charset[j]) {
                return false;
            }
        }
    }
    //홀수
    if(charset.length%2 !== 0) {
        for(let j=i=parseInt(charset.length/2); i<charset.length; i++,j--) {
            if(charset[i] !== charset[j]) {
                return false;
            }
        }
    }

    return true;
};