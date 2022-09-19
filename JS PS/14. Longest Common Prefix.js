var longestCommonPrefix = function(strs) {
    let common = '';
    let min = Infinity;
    for(let i=0; i<strs.length; i++) {
        if(strs[i].length < min) {
            min = strs[i].length;
            common = strs[i];
        }
    }
    for(let i=0; i<strs.length; i++) {
        for(let j=0; j<strs[i].length; j++) {
            if(j<common.length && common[j] !== strs[i][j]) {
                common = common.substring(0, j);
            }
        }
    }

    return common;
};
