const persons = [
    { name: "Ramakrishna", age: 24, residence: "India" },
    { name: "Bob", age: 17, residence: "London" },
    { name: "Charlie", age: 30, residence: "Paris" },
    { name: "David", age: 19, residence: "USA" },
    { name: "Dhoni", age: 16, residence: "India" },
    { name: "Frank", age: 40, residence: "Sydney" }
];

console.log("Original Persons List:");
for (let i = 0; i < persons.length; i++) {
    console.log(`Name: ${persons[i].name}, Age: ${persons[i].age}, Residence: ${persons[i].residence}`);
}

console.log("\nPersons with Status:");
const personsWithStatus = persons.map(person => ({
    ...person,
    status: person.age >= 18 ? "Adult" : "Minor"
}));

for (let i = 0; i < personsWithStatus.length; i++) {
    console.log(`Name: ${personsWithStatus[i].name}, Age: ${personsWithStatus[i].age}, Residence: ${personsWithStatus[i].residence}, Status: ${personsWithStatus[i].status}`);
}
/*

console.log("Original Persons List:");
persons.map(person => {
    console.log(`Name: ${person.name}, Age: ${person.age}, Residence: ${person.residence}`);
});

console.log("\nPersons with Status:");
persons
    .map(person => ({ ...person, status: person.age >= 18 ? "Adult" : "Minor" }))
    .map(person => {
        console.log(`Name: ${person.name}, Age: ${person.age}, Residence: ${person.residence}, Status: ${person.status}`);
    });

    */
