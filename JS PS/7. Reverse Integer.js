/**
 * @param {number} x
 * @return {number}
 */
var reverse = function(x) {
    let ans =0, num =0, IntegerMax = Math.pow(2, 31)-1, IntegerMin = Math.pow(-2, 31);

    while(x!== 0) {
        num = x%10;
        x=parseInt(x/10);

        if(ans > IntegerMax/10 || ans === IntegerMax && num > 7) return 0;

        if(ans < IntegerMin/10 || ans === IntegerMin && num <=8) return 0;

        ans = (ans*10) + num;
    }

    return ans
};