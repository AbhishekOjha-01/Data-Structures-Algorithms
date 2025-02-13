/**
 * @param {number[]} arr
 * @param {Function} fn
 * @return {number[]}
 */
var filter = function(arr, fn) {
    let items = []
    arr.forEach((val, index) => {
        if(fn(val, index)) {
            items.push(val)
        }
    })
    return items
};