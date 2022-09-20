function solution(enroll, referral, seller, amount) {
    const map = new Array(enroll.length).fill().map(_ => [])
    const dist = new Array(enroll.length).fill(0)
    const mapping = {};
    enroll.forEach((name, i) => {
        mapping[name] = i;
    })

    referral.forEach((ref, i) => {
        if (ref === '-') return;
        map[i].push(mapping[ref])
    })

    const saleLogic = (cur, total) => {
        //10원미만인경우
        if (total < 10) {
            dist[cur] += total;
        }
        //자식이 없는경우
        else if (!map[cur].length) {
            const other = Math.floor(total * 0.1)
            const me = total - other

            dist[cur] += me;
        } else {
            //자식이있는경우
            const other = Math.floor(total * 0.1)
            const me = total - other

            dist[cur] += me;
            saleLogic(map[cur], other)

        }
    }

    seller.forEach((seller, i) => {
        const cur = mapping[seller]
        saleLogic(cur, amount[i] * 100)
    })

    return dist
}

console.log(solution(["john", "mary", "edward", "sam", "emily", "jaimie", "tod", "young"], ["-", "-", "mary", "edward", "mary", "mary", "jaimie", "edward"], ["young", "john", "tod", "emily", "mary"], [12, 4, 2, 5, 10]))