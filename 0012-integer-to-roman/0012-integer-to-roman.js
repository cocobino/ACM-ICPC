/**
 * @param {number} num
 * @return {string}
 */
const  Roman = {
    I: 1,
    IV:4,
    V: 5,
    IX:9,
    X: 10,
    XL:40,
    L: 50,
    XC:90,
    C: 100,
    CD:400,
    D: 500,
    CM:900,
    M: 1000,
}
var intToRoman = function(num, ans='') {
    const keys = Object.keys(Roman);
    let idx = keys.length - 1;

    while(true) {
        if(num === 0) break;
        if(Math.floor(num / Roman[keys[idx]])) {
            ans += keys[idx];
            num -= Roman[keys[idx]];
        } else {
            idx -= 1;
        }
    }

    return ans;
};

console.log(intToRoman(3));