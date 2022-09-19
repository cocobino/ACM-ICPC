var romanToInt = function(s) {
    const map = new Map(Object.entries({
        'I' : 1,
        'V' : 5,
        'X' : 10,
        'L' : 50,
        'C' : 100,
        'D' : 500,
        'M' : 1000,
        'IV' : 4,
        'IX' : 9,
        'XL' : 40,
        'XC' : 90,
        'CD' : 400,
        'CM' : 900,
    }));

    let rst =0 ;
    for(let i=0; i<s.length; i++) {
        if(i+1 <s.length && Boolean(map.get(`${s[i]}${s[i+1]}`))) {
            rst += map.get(`${s[i]}${s[i+1]}`);
            i+=1;
        } else {
            rst += map.get(`${s[i]}`);
        }
    }
    return rst;
};