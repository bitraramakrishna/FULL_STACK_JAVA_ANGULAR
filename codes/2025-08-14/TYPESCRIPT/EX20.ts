function pair<T, U>(first: T, second: U): [T, U] {
  return [first, second];
}


let stringAndNumber = pair<string, number>("RAMAKRISHNA", 18);
console.log(stringAndNumber); 

let booleanAndString = pair<boolean, string>(true, "is great");
console.log(booleanAndString);