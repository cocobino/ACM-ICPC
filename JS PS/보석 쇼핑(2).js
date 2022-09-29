function solution(gems) {
    const treasure = new Set(gems);
    const buy = new Map();

    let start = 0, end = 0;
    let ans = [0, gems.length - 1];

    while (end < gems.length && start <= end) {
        debugger

        if (treasure.size === buy.size) {
            if (end - start < ans[1] - ans[0]) {
                ans = [start, end];
            }
            if( end - start === ans[1] - ans[0]) {
                if(start < ans[0]) {
                    ans = [start, end];
                }
            }

            if(buy.get(gems[start]) > 1) {
                buy.set(gems[start], buy.get(gems[start] -1));
            }
        }else {
            end += 1;
            buy.set(gems[end], 1 + (buy.get(gems[end]) || 0));
        }
    }

    return ans;
}

solution(["DIA", "RUBY", "RUBY", "DIA", "DIA", "EMERALD", "SAPPHIRE", "DIA"])