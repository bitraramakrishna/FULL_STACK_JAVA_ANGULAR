// Ensure the DOM is fully loaded before running the script
document.addEventListener('DOMContentLoaded', () => {
    // Get references to the HTML elements
    const taskInput = document.getElementById('taskInput');
    const addTaskBtn = document.getElementById('addTaskBtn');
    const taskList = document.getElementById('taskList');

    // Add event listener to the "Add" button
    addTaskBtn.addEventListener('click', addTask);

    // Add event listener for the "Enter" key press in the input field
    taskInput.addEventListener('keypress', (e) => {
        // If the pressed key is 'Enter', call the addTask function
        if (e.key === 'Enter') {
            addTask();
        }
    });

    /**
     * Function to add a new task to the list.
     */
    function addTask() {
        // Get the trimmed value from the input field
        const taskText = taskInput.value.trim();

        // Check if the input field is not empty
        if (taskText !== '') {
            // Create a new list item (<li>) element
            const li = document.createElement('li');

            // Create a span element to hold the task text
            const taskSpan = document.createElement('span');
            taskSpan.textContent = taskText; // Set the text content of the span
            li.appendChild(taskSpan); // Append the span to the list item

            // Create a button element for deleting the task
            const deleteBtn = document.createElement('button');
            deleteBtn.textContent = 'Delete'; // Set the text content of the button
            deleteBtn.className = 'deleteBtn'; // Assign a class for styling
            li.appendChild(deleteBtn); // Append the delete button to the list item

            // Add the newly created list item to the unordered list (<ul>)
            taskList.appendChild(li);

            // Clear the input field after adding the task
            taskInput.value = '';

            // Add an event listener to the delete button
            deleteBtn.addEventListener('click', () => {
                // Remove the parent list item when the delete button is clicked
                li.remove();
            });
        }
    }
});
