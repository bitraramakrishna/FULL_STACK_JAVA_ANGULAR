/* -------EXERCISE 2 double the array elements
const doubleNumbers = (numbers) => {
  return numbers.map(number => number * 2);
};
const inputNumbers = [1, 2, 3, 4];
const doubledResult = doubleNumbers(inputNumbers);
console.log(`Original array: ${inputNumbers}`);    
console.log(`Doubled array: ${doubledResult}`);   */

/*EXERCISE 3--------*/
/*class Util {
  getDate() {
    const today = new Date();
    const day = String(today.getDate()).padStart(2, '0');
    const month = String(today.getMonth() + 1).padStart(2, '0');
    const year = today.getFullYear();

    return `${day}-${month}-${year}`;
  }

  getPIValue() {
    return Math.PI;
  }

  convertC2F(celsius) {
    if (typeof celsius !== 'number') {
      console.error("Input for convertC2F must be a number.");
      return null;
    }
    return (celsius * 9 / 5) + 32;
  }

  getFibonacci(n) {
    if (typeof n < 0 ) {
      console.error("Input must be non-negative ");
      return [];
    }

    if (n === 1) {
      return [0];
    } else {
      const series = [0, 1];
      for (let i = 2; i < n; i++) {
        const nextFib = series[i - 1] + series[i - 2];
        series.push(nextFib);
      }
      return series;
    }
  }
}

const util = new Util();
const todayDate = util.getDate();
console.log(`Today's Date: ${todayDate}`);

const piValue = util.getPIValue();
console.log(`Value of PI: ${piValue}`);


const tempFahrenheit = util.convertC2F(25);
console.log(`${tempCelsius}°C is ${tempFahrenheit}°F`);

const fibonacciSeries1 = util.getFibonacci(5);
console.log(`Fib ${n1}`)
*/

/*----------EXERCISE4------*/
/*
class BankAccount {
  constructor(accountNumber, balance) {
    this.accountNumber = accountNumber;
    this.balance = balance;
  }

  deposit(amount) {
    if (amount > 0) {
      this.balance += amount;
      console.log(`Deposited: ${amount}. New balance: ${this.balance}`);
    } else {
      console.log("Deposit amount must be positive.");
    }
  }

  withdraw(amount) {
    if (amount > 0) {
      if (this.balance >= amount) {
        this.balance -= amount;
        console.log(`Withdrew: ${amount}. New balance: ${this.balance}`);
      } else {
        console.log(`Insufficient balance. Current balance: ${this.balance}`);
      }
    } else {
      console.log("Withdrawal amount must be positive.");
    }
  }
}

const myAccount = new BankAccount("123456789", 1000);
myAccount.deposit(500);
myAccount.withdraw(5000);
 */

/*---------EXERCISE 5---------*/
/*class Vehicle {
  constructor(make, model, year) {
    this.make = make;
    this.model = model;
    this.year = year;
  }

  getInfo() {
    return `${this.year} ${this.make} ${this.model}`;
  }
}

class Car extends Vehicle {
  constructor(make, model, year, numDoors) {
    super(make, model, year);
    this.numDoors = numDoors;
  }

  getInfo() {
    return `${super.getInfo()} with ${this.numDoors} doors`;
  }
}

const myCar = new Car("TATA NANO", "TATA", 2024,4);
console.log(`Car Info: ${myCar.getInfo()}`);
*/


/*-----EXERCISE 6 -----------*/

const movie = {
  movieName: "WAR 2",
  movieLanguage: "TELUGU/HINDI",
  imdbRating: 9.8
};

const { movieName, movieLanguage, imdbRating } = movie;

console.log(`Movie Name: ${movieName},Movie Language: ${movieLanguage},IMDb Rating: ${imdbRating}`);

