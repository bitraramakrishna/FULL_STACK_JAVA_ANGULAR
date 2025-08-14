
interface Employee {
  empId: number;
  empName: string;
  salary: number;
}
let employees: Employee[] = [
  { empId: 1, empName: "RamakrishnaPrasad", salary: 75000 },
  { empId: 2, empName: "Bob", salary: 60000 },
  { empId: 3, empName: "Charlie", salary: 90000 }
];


function processEmployees(employeesList: Employee[]): number {

  employeesList.forEach(employee => {
    console.log(`Employee ID: ${employee.empId}, Name: ${employee.empName}, Salary: ${employee.salary}`);
  });
  
  return employeesList.length;
}

let employeeCount: number = processEmployees(employees);

console.log(`Total number of employees: ${employeeCount}`);