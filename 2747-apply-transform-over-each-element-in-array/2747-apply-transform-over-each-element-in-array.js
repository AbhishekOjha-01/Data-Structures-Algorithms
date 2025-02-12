/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var map = function(arr, fn) {
    let newArr = [];
    arr.forEach((val, index) => {
        newArr.push(fn(val, index));
    });
    return newArr;
};