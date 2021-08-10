function solution(w,h, max=Math.max(w,h), min=Math.min(w,h)) {
    const gcd = (a,b) => {
        if(b ==0) {
            return a;
        }
        return gcd(b, a%b);
    }
    return (max*min) - (max+min-gcd(max,min));
}