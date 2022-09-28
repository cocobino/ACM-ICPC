function solution(stones, k) {
    let left = 1, right = 200000000, ans = 0;

    const simulation = (friend) => {
        let skip = 0;

        for (let i = 0; i < stones.length; i++) {
            if (stones[i] - friend < 0) {
                skip++;
            } else {
                skip = 0;
            }

            if (skip === k) return false;
        }

        return true;
    }

    while (left <= right) {
        let mid = Math.floor((left + right) / 2);
        if (simulation(mid)) {
            left = mid + 1;
            ans = Math.max(ans, mid);
        } else {
            right = mid - 1;
        }
        ;
    }

    return ans;
}

console.log(solution([2, 4, 5, 3, 2, 1, 4, 2, 5, 1], 3))