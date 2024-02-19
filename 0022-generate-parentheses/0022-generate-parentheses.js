/**
 * @param {number} n
 * @return {string[]}
 */
var generateParenthesis = function(n, ans = []) {

    const backtrack = (str, open, close) => {
        if(close > open || open > n ) return;
        if(open === n && close === n) {
            return ans.push(str);
        }

        backtrack(str + '(', open + 1, close);
        backtrack(str + ')', open, close + 1);
    }
    backtrack('', 0, 0)

    return ans;
};