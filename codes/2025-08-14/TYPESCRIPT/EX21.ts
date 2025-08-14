class Box<T> {
  
  private value: T;

  constructor(value: T) {
    this.value = value;
  }

  getValue(): T {
    return this.value;
  }
}

let stringBox = new Box<string>("Hello, Generics!");
console.log("String Box Content:", stringBox.getValue()); 

