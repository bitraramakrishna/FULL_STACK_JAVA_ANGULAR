const employees = [
    { name: "ram", role: "manager", empId: "M001", salary: 75000 },
    { name: "Bob Johnson", role: "qa", empId: "QA001", salary: 50000 },
    { name: "Charlie Brown", role: "developer", empId: "DEV001", salary: 65000 },
    { name: "Diana Prince", role: "manager", empId: "M002", salary: 80000 },
    { name: "Frank White", role: "qa", empId: "QA002", salary: 52000 },
    { name: "Grace Lee", role: "manager", empId: "M003", salary: 78000 }
];

console.log("--- All Employees ---");
employees.forEach(emp => {
    console.log(`Name: ${emp.name}, Role: ${emp.role}, Emp ID: ${emp.empId}, Salary: $${emp.salary.toLocaleString()}`);
});


const totalManagerSalary = employees
    .filter(employee => employee.role === "manager") 
    .reduce((total, manager) => total + manager.salary, 0);

console.log("\n--- Total Salary Drawn by Managers ---");
console.log(`$${totalManagerSalary.toLocaleString()}`);
