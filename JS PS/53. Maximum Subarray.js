/**
 * @param {number[]} nums
 * @return {number}
 */
var maxSubArray = function(nums) {

    let max = -Infinity;
    let tmp =0;
    for(let i=0; i<nums.length; i++) {
        tmp = Math.max(0, tmp) + nums[i];
        max = Math.max(tmp, max);
    }

    return max;
};