class Calculator {
  
  add(a: number, b: number): number {
    return a + b;
  }

  
  subtract(a: number, b: number): number {
    return a - b;
  }
}


const myCalculator = new Calculator();


let sum = myCalculator.add(10, 5);
console.log("10 + 5 =", sum); 

let difference = myCalculator.subtract(20, 7);
console.log("20 - 7 =", difference); 