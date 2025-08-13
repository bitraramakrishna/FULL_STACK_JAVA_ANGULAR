// Define an array of person objects
const persons = [
    { name: "Alice", age: 10, residence: "New York" },
    { name: "Bob", age: 17, residence: "London" },
    { name: "Charlie", age: 30, residence: "Paris" },
    { name: "David", age: 19, residence: "Berlin" },
    { name: "Eve", age: 16, residence: "Tokyo" },
    { name: "Frank", age: 40, residence: "Sydney" }
];

const eligibleVoters = persons.filter(person => person.age > 18);

console.log("Eligible Voters:");
eligibleVoters.forEach(person => {
    console.log(`Name: ${person.name}, Age: ${person.age}, Residence: ${person.residence}`);
});