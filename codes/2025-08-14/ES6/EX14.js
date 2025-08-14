const userIdInput = document.getElementById('userIdInput');
const passwordInput = document.getElementById('passwordInput');
const loginButton = document.getElementById('loginButton');
const logoutButton = document.getElementById('logoutButton');
const statusMessage = document.getElementById('statusMessage');
const loggedInUserDisplay = document.getElementById('loggedInUserDisplay');
const currentUserIdSpan = document.getElementById('currentUserId');

const USER_ID_KEY = 'loggedInUserId';

function displayStatus(message, type) {
    statusMessage.textContent = message;
    statusMessage.classList.remove('hidden', 'status-success', 'status-error');
    if (type === 'success') {
        statusMessage.classList.add('status-success');
    } else if (type === 'error') {
        statusMessage.classList.add('status-error');
    }
    setTimeout(() => {
        statusMessage.classList.add('hidden');
    }, 3000);
}

function updateUI(userId) {
    if (userId) {
        userIdInput.value = userId;
        userIdInput.disabled = true;
        passwordInput.value = '';
        passwordInput.disabled = true;
        loginButton.disabled = true;
        logoutButton.disabled = false;
        currentUserIdSpan.textContent = userId;
        loggedInUserDisplay.classList.remove('hidden');
        displayStatus(`Welcome, ${userId}!`, 'success');
    } else {
        userIdInput.value = '';
        userIdInput.disabled = false;
        passwordInput.value = '';
        passwordInput.disabled = false;
        loginButton.disabled = false;
        logoutButton.disabled = true;
        loggedInUserDisplay.classList.add('hidden'); // This line was added.
    }
}

loginButton.addEventListener('click', () => {
    const userId = userIdInput.value.trim();
    if (userId) {
        localStorage.setItem(USER_ID_KEY, userId);
        updateUI(userId);
    } else {
        displayStatus("Please enter a User ID.", "error");
    }
});

logoutButton.addEventListener('click', () => {
    localStorage.removeItem(USER_ID_KEY);
    updateUI(null);
    displayStatus("You have been logged out.", "success");
});

document.addEventListener('DOMContentLoaded', () => {
    const storedUserId = localStorage.getItem(USER_ID_KEY);
    updateUI(storedUserId);
});
