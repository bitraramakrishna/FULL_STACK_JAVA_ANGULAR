var employees = [
    { empId: 1, empName: "RamakrishnaPrasad", salary: 75000 },
    { empId: 2, empName: "Bob", salary: 60000 },
    { empId: 3, empName: "Charlie", salary: 90000 }
];
function processEmployees(employeesList) {
    console.log("--- Employee List ---");
    employeesList.forEach(function (employee) {
        console.log("Employee ID: ".concat(employee.empId, ", Name: ").concat(employee.empName, ", Salary: ").concat(employee.salary));
    });
    return employeesList.length;
}
var employeeCount = processEmployees(employees);
console.log("Total number of employees: ".concat(employeeCount));
