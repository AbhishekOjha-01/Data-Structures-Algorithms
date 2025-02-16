/**
 * @param {Array} arr
 * @param {Function} fn
 * @return {Array}
 */
var sortBy = function(arr, fn) {
    const newArr = arr.map((e) => {
        return{
            v : fn(e),
            o : e
        }
    })
    return newArr.sort((a,b) => a.v - b.v).map((e) => e.o)
};