/**
 * @param {string} haystack
 * @param {string} needle
 * @return {number}
 */


var strStr = function(haystack, needle) {
    const getPi = (p) => {
        let len = p.length;
        let table =new Array(len).fill(0);
        let j =0;
        for(let i=1; i<len; i++) {
            while(j>0 && p[i] != p[j]) {
                j = table[j-1];
            }
            if(p[i] == p[j]) {
                table[i] = ++j;
            }
        }
        return table;
    }
    const kmp = (parent, pattern) => {
        let table = getPi(pattern);
        let plen = parent.length;
        let patternlen = pattern.length;
        let j =0;
        for(let i=0; i<plen; i++) {
            while(j>0 && parent[i] !== pattern[j]) {
                j = table[j-1];
            }
            if(parent[i] === pattern[j]) {
                if(j == patternlen-1) {
                    return (i -patternlen +1);
                    j = table[j];
                } else {
                    j++;
                }
            }
        }
    }

    return kmp(haystack, needle);
};

console.log(strStr('ABCDABCDABEE', 'ABCDABE'));