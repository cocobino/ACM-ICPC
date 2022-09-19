/**
 * @param {number[]} nums
 * @return {number}
 */
var removeDuplicates = function(nums) {

    var idx = 1;
    for(let i=0;i<nums.length-1;i++){
        if(nums[i]!=nums[i+1]){
            nums[idx++] = nums[i+1];
        }
    }
    return idx;

};

console.log(removeDuplicates([1,1,2]));