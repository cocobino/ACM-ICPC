function solution(price, money, count) {
    let rst  =0;
    for(let i=1; i<=count; i++) {
        rst += price*i
    }

    return money-rst < 0 ? -(money-rst) : 0;
}