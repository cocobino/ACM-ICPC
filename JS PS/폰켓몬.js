function solution(nums, selectCount = parseInt(nums.length/2)) {
    const arr = nums.reduce((acc, cur) => !acc.find(v => v == cur) ? [...acc, cur] : [...acc], []);
    return arr.length <= selectCount ? arr.length : selectCount;
}