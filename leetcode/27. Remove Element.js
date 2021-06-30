/**
 * @param {number[]} nums
 * @param {number} val
 * @return {number}
 */
var removeElement = function(nums, val) {
    let rst = 0
    nums.forEach(v => v !== val ? nums[rst++] = v : "");
    return rst
};

console.log(removeElement([0,1,2,2,3,0,4,2], 2));