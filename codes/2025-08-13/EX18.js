 const num1Input = document.getElementById('num1');
        const num2Input = document.getElementById('num2');
        const addBtn = document.getElementById('add-btn');
        const subtractBtn = document.getElementById('subtract-btn');
        const multiplyBtn = document.getElementById('multiply-btn');
        const divideBtn = document.getElementById('divide-btn');
        const resultDisplay = document.getElementById('result-display');

        function calculate(operation) {
            const num1 = parseFloat(num1Input.value);
            const num2 = parseFloat(num2Input.value);


            let result;
            switch (operation) {
                case 'add':
                    result = num1 + num2;
                    break;
                case 'subtract':
                    result = num1 - num2;
                    break;
                case 'multiply':
                    result = num1 * num2;
                    break;
                case 'divide':
                    if (num2 === 0) {
                        resultDisplay.textContent = 'Result: Cannot Divide by Zero';
                        return;
                    }
                    result = num1 / num2;
                    break;
                default:
                    result = 'Error';
            }
            resultDisplay.textContent = `Result: ${result}`;
        }

        addBtn.addEventListener('click', () => calculate('add'));
        subtractBtn.addEventListener('click', () => calculate('subtract'));
        multiplyBtn.addEventListener('click', () => calculate('multiply'));
        divideBtn.addEventListener('click', () => calculate('divide'));