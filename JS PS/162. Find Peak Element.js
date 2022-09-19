/**
 * @param {number[]} nums
 * @return {number}
 */
var findPeakElement = function(nums, l = 0, r = nums.length) {
    let mid = l + Math.floor((r - l) /2);
    let cur = nums[mid];
    let prev = mid-1 < 0 ? -Infinity : nums[mid-1];
    let next = mid+1 > nums.length-1 ? -Infinity : nums[mid+1];

    if(cur > prev && cur > next) {
        return mid;
    }

    if(cur < next) {
        return findPeakElement(nums, mid+1, r);
    }

    if(cur > next) {
        return findPeakElement(nums, l, mid-1);
    }
};

console.log(findPeakElement( [0,1,2,3,4,5,6,7,8,9,1]));