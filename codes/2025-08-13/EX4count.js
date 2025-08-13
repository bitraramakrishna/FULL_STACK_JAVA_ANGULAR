const MAX_CHARS = 50;

const inputElement = document.getElementById('myInput');
const charCountLabel = document.getElementById('charCountLabel');


const initialLength = inputElement.value.length;
charCountLabel.innerText = `${MAX_CHARS - initialLength} characters remaining`;


inputElement.addEventListener('input', function() {
    const currentLength = inputElement.value.length;
    const remaining = MAX_CHARS - currentLength;
    charCountLabel.innerText = `${remaining} characters remaining`;
});
