document.addEventListener('DOMContentLoaded', () => {
    const loginForm = document.getElementById('loginForm');
    const emailInput = document.getElementById('email');
    const passwordInput = document.getElementById('password');
    const emailError = document.getElementById('emailError');
    const passwordError = document.getElementById('passwordError');
    const messageBox = document.getElementById('messageBox');

    const isValidEmail = (email) => {
        
        const emailRegex = /^[^\s@]+@(gmail\.com|yahoo\.com)$/;
        return emailRegex.test(email);
    };

    const validateField = (inputElement, errorElement, message) => {
        if (inputElement.value.trim() === '') {
            errorElement.textContent = message;
            errorElement.classList.remove('hidden');
            inputElement.classList.add('border-red-500');
            inputElement.classList.remove('focus:ring-blue-500');
            return false;
        } else {
            errorElement.classList.add('hidden');
            inputElement.classList.remove('border-red-500');
            inputElement.classList.add('focus:ring-blue-500');
            return true;
        }
    };

    const validateEmailField = () => {
        const isValid = validateField(emailInput, emailError, 'Email cannot be empty.');
        if (!isValid) {
            return false;
        }

        if (!isValidEmail(emailInput.value.trim())) {
            // Changed this line to a more general message
            emailError.textContent = 'Please enter a valid email address.';
            emailError.classList.remove('hidden');
            emailInput.classList.add('border-red-500');
            emailInput.classList.remove('focus:ring-blue-500');
            return false;
        } else {
            emailError.classList.add('hidden');
            emailInput.classList.remove('border-red-500');
            emailInput.classList.add('focus:ring-blue-500');
            return true;
        }
    };

    emailInput.addEventListener('blur', validateEmailField);
    passwordInput.addEventListener('blur', () => {
        validateField(passwordInput, passwordError, 'Password cannot be empty.');
    });

    loginForm.addEventListener('submit', (event) => {
        event.preventDefault();

        const isEmailValid = validateEmailField();
        const isPasswordValid = validateField(passwordInput, passwordError, 'Password cannot be empty.');

        if (isEmailValid && isPasswordValid) {
            messageBox.classList.remove('hidden');
            setTimeout(() => {
                messageBox.classList.add('hidden');
            }, 3000);
        }
    });
});
