var Stack = /** @class */ (function () {
    function Stack() {
        this.elements = [];
    }
    Stack.prototype.push = function (item) {
        this.elements.push(item);
    };
    Stack.prototype.pop = function () {
        if (this.isEmpty()) {
            return undefined;
        }
        return this.elements.pop();
    };
    Stack.prototype.peek = function () {
        if (this.isEmpty()) {
            return undefined;
        }
        return this.elements[this.elements.length - 1];
    };
    Stack.prototype.isEmpty = function () {
        return this.elements.length === 0;
    };
    Stack.prototype.size = function () {
        return this.elements.length;
    };
    return Stack;
}());
var numberStack = new Stack();
numberStack.push(10);
numberStack.pop();
numberStack.push(20);
console.log("Top number:", numberStack.peek());
console.log("Popped number:", numberStack.pop());
console.log("Stack empty?", numberStack.isEmpty());
