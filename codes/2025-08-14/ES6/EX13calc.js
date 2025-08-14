import { multiply, divide } from './EX13operations.js';

try {
    console.log("Multiply 5 × 3 =", multiply(5, 3));
    console.log("Divide 10 ÷ 2 =", divide(10, 2));
    console.log("Divide 10 ÷ 0 =", divide(10, 0)); 
} catch (error) {
    console.error("Error:", error.message);
}