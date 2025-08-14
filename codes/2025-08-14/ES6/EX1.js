const sumArray = (numbers) => {
  return numbers.reduce((accumulator, currentValue) => accumulator + currentValue, 0);
};

myNumbers = [1, 2, 3, 4, 5];
totalSum = sumArray(myNumbers);
console.log(`The sum of the numbers ${myNumbers} is: ${totalSum}`);
