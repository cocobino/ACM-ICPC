function solution(gems) {
    const target = new Set(gems);

    let stIdx=0;
    let edIdx=0;
    let cache = [];
    let result = [];
    for(let i=edIdx; i<gems.length; i++) {
        cache.push(gems[i]);
        if(new Set(cache).size === target.size) {
            result.push({stIdx, edIdx: i, len:i-stIdx});

            for(let j=stIdx; j<=i; j++) {
                if(new Set(cache).size === target.size) {
                    result.push({stIdx:j, edIdx:i, len: i - j});
                }
                cache.shift();
            }
        }
    }

    result.sort((a, b) =>{
        if(b.len > a.len)return -1;
        else if(b.len < a.len) return 1;
        else if(b.stIdx > a.stIdx) return -1;
        else if(b.stIdx < a.stIdx) return 1;
        else return 0
    });

    return [result[0].stIdx+1, result[0].edIdx+1];
}

solution(["DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"])