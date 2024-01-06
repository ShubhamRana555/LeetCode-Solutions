/**
 * @param {string} val
 * @return {Object}
 */
var expect = function(val1) {
    // var result = {
    //     toBe: function(val2){
    //         if(val1 === val2){
    //             return true;
    //         }
    //         else{
    //             console.error("Not Equal");
    //             return "Not Equal";
    //         }
    //     },
    //     notToBe: function(val3){
    //         if(val1 !== val3){
    //             return true;
    //         }
    //         else{
    //             console.error("Equal")
    //             return "Error"
    //         }
    //     }
    // }
    // return result;
    var result = {
        toBe: function (val2) {
            if (val1 === val2) {
                return true;
            } else {
                throw new Error("Not Equal");
            }
        },
        notToBe: function (val3) {
            if (val1 !== val3) {
                return true;
            } else {
                throw new Error("Equal");
            }
        }
    };

    return result;
};

/**
 * expect(5).toBe(5); // true
 * expect(5).notToBe(5); // throws "Equal"
 */