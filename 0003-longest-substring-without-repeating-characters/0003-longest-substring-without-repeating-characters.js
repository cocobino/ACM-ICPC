var lengthOfLongestSubstring = function (s) {
    let ans = 0, left = 0;
    const set = new Set();

    for (let i = 0; i < s.length; i++) {
        while (set.has(s[i])) {
            set.delete(s[left]);
            left += 1;
        }

        set.add(s[i]);
        ans = Math.max(ans, set.size);
    }

    return ans;
};