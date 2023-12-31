/**
 * @param {number} n
 * @return {Function} counter
 */
var createCounter = function(n) {
    var sum = n;
    return function() {
        return sum++;
    };
};

/** 
 * const counter = createCounter(10)
 * counter() // 10
 * counter() // 11
 * counter() // 12
 */