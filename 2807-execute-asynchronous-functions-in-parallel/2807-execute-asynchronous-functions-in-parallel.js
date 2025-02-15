/**
 * @param {Array<Function>} functions
 * @return {Promise<any>}
 */
var promiseAll = function(functions) {
    return new Promise((resolve, reject) => {
        const output = []
        let count = functions.length
        for(let i = 0; i < functions.length; i++) {
            functions[i]().then((response) => {
                output[i] = response
                count--
                if(count === 0) {
                    return resolve(output)
                }
            }).catch(reject)
        }
    })
};

/**
 * const promise = promiseAll([() => new Promise(res => res(42))])
 * promise.then(console.log); // [42]
 */