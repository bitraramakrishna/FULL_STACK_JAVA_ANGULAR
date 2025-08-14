var Box = /** @class */ (function () {
    function Box(value) {
        this.value = value;
    }
    Box.prototype.getValue = function () {
        return this.value;
    };
    return Box;
}());
var stringBox = new Box("Hello, Generics!");
console.log("String Box Content:", stringBox.getValue());
