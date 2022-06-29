const comb = (arr, num) => {
    const rst= [];

    if(num ===1) {
        return arr.map(v => [v]);
    }

    arr.forEach((fix, index, origin) => {

        const rest = origin.slice(index+1);

        const getComb = comb(rest, num -1);

        const attach = getComb.map(comb => [fix, ...comb]);

        rst.push(...attach)
    })

    return rst
}

const getPermutations = (array, selectNumber) => {
    const results = [];
    if (selectNumber === 1) {
        return array.map((element) => [element]);
    }
    array.forEach((fixed, index, origin) => {
        const rest = [...origin.slice(0, index), ...origin.slice(index + 1)];
        const permutations = getPermutations(rest, selectNumber - 1);
        const attached = permutations.map((permutation) => [fixed, ...permutation]);

        results.push(...attached);
    });
    return results;
};

const solution = (user_id, banned_id) => {

    const user_comb =comb(user_id, banned_id.length)
    let bann_perm = getPermutations(banned_id.map(id => id.replace(/\*/g, '.')), banned_id.length)

    const match = (id, banId) => {
        let valid =true;
        for(let i=0; i<id.length; i++) {
            if(id[i].length === banId[i].length) {
                for(let j=0; j<id[i].length; j++) {
                    if(id[i][j] !== banId[i][j] && banId[i][j] !== '.') {
                        valid = false;
                    }
                }
            } else {
                valid = false;
            }
        }
        return valid;
    }

    return user_comb.filter(id => {
        for(let i=0; i< bann_perm.length; i++) {
            if(match(id, bann_perm[i])) {
                return true
            }
        }
        return false
    }).length;
}


console.log(solution(["frodo", "fradi", "crodo", "abc123", "frodoc"], ["fr*d*", "*rodo", "******", "******"]))