/**
 * @param {Array} arr
 * @param {number} depth
 * @return {Array}
 */
var flat = function (arr, n) {
    if(n == 0) {
        return arr
    }
    const output = []
    arr.forEach((element) => {
        if(Array.isArray(element)) {
            output.push(...flat(element, n - 1))
        }else {
            output.push(element)
        }
    })
    return output
};