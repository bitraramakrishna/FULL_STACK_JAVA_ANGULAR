
/*EX1&EX2&EX3*/
function addAndConcatenate(value1, value2) {
    const result = value1 + "" + value2;
    const resultElement = document.getElementById('result');
    if (resultElement) {
        resultElement.innerText = "The concatenated result is: " + result;
    } else {
        console.error("Error: Element with ID 'result' not found.");
    }
}

addAndConcatenate(123, "Hello");

const headingElement = document.getElementById('myHeading');
if (headingElement) {
    headingElement.innerText = "Text Length Application";
}

const inputElement = document.getElementById('myInput');
const buttonElement = document.getElementById('checkLengthBtn');
const resultElement = document.getElementById('result');

if (inputElement && buttonElement && resultElement) {
    buttonElement.addEventListener('click', function() {
        const inputText = inputElement.value;
        const textLength = inputText.length;
        resultElement.innerText = "The length of the text is: " + textLength;
    });
} else {
    console.error("Error: Required elements (input, button, or result div) not found.");
}

