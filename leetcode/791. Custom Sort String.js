/**
 * @param {string} order
 * @param {string} str
 * @return {string}
 */
let customSortString = (order, str, m = {}) => {
    order.split('').forEach((x, i) => m[x] = i + 1);
    return str.split('').sort((a, b) => (m[a] || Infinity) - (m[b] || Infinity)).join('');
};