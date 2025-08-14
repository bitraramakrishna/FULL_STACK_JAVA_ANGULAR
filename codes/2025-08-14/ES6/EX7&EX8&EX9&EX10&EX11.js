/*
// Ex7: Use the spread operator to merge two objects

const obj1 = { a: 1, b: 2 };
const obj2 = { b: 3, c: 4 };
const mergedObj = { ...obj1, ...obj2 };
console.log("mergedObj:", mergedObj);
// Ex8: Use the spread operator to combine arrays with additional elements

const arr1 = [1, 2, 3];
const arr2 = [4, 5, 6];
const newArr = [4, 5, ...arr1, 6, 7, ...arr2, 8, 9];
console.log("newArr:", newArr);

// Ex9: Use the spread operator to pass elements of an array as arguments to a function
const numbers = [1, 2, 3];
function sum(a,b,c) {
  return a + b + c;
}
let result =sum(...numbers)
console.log("Sum function result ", result);

*/
// Ex10: Write a function sum of numbers using the rest operator 
function sumNumbers(...numbers) {
return numbers.reduce((total, num) => total + num, 0);
}


console.log("sumNumbers", sumNumbers(1, 2, 3));


// Ex11: Create a function separateFirstRest that takes any number of arguments using the rest operator.

function separateFirstRest(first, ...rest) {
  
  return { first, rest };
}


console.log("separateFirstRest ", separateFirstRest(1, 2, 3, 4, 5));

