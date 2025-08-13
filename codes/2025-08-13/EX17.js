const questions = [
            {
                question: "Which keyword is used to define a class in Java?",
                options: ["class", "Class", "new", "object"],
                correctAnswer: "class"
            },
            {
                question: "What is the entry point for a Java application?",
                options: ["main() method", "start() method", "run() method", "init() method"],
                correctAnswer: "main() method"
            },
            {
                question: "Which of these is not a Java access modifier?",
                options: ["public", "private", "protected", "friend"],
                correctAnswer: "friend"
            },
            {
                question: "Which of these statements is true about Java?",
                options: ["Java is purely object-oriented", "Java supports multiple inheritance", "Java is platform-independent", "Java does not have pointers"],
                correctAnswer: "Java is platform-independent"
            },
            {
                question: "What is the default value of a boolean variable in Java?",
                options: ["true", "false", "null", "0"],
                correctAnswer: "false"
            }
        ];

        let currentQuestionIndex = 0;
        let score = 0;
        let answeredCurrentQuestion = false;

        let questionTextElement = document.getElementById('question-text');
        let optionsContainer = document.getElementById('options-container');
        let feedbackTextElement = document.getElementById('feedback-text');
        const nextButton = document.getElementById('next-button');
        const playAgainButton = document.getElementById('play-again-button');
        const scoreDisplay = document.getElementById('score-display');
        const questionArea = document.getElementById('question-area');

        function displayQuestion() {
            answeredCurrentQuestion = false;
            nextButton.disabled = true;
            nextButton.classList.add('disabled');

            optionsContainer.innerHTML = '';
            feedbackTextElement.textContent = '';

            if (currentQuestionIndex < questions.length) {
                const currentQuestion = questions[currentQuestionIndex];
                questionTextElement.textContent = currentQuestion.question;

                currentQuestion.options.forEach(option => {
                    const button = document.createElement('button');
                    button.textContent = option;
                    button.classList.add('option-button');
                    button.addEventListener('click', () => selectOption(button, option, currentQuestion.correctAnswer));
                    optionsContainer.appendChild(button);
                });
            } else {
                endQuiz();
            }
        }

        function selectOption(selectedButton, selectedAnswer, correctAnswer) {
            if (answeredCurrentQuestion) {
                return;
            }
            answeredCurrentQuestion = true;

            Array.from(optionsContainer.children).forEach(button => {
                button.classList.add('disabled');
                button.disabled = true;
            });

            if (selectedAnswer === correctAnswer) {
                selectedButton.classList.add('correct');
                feedbackTextElement.textContent = "Correct!";
                feedbackTextElement.style.color = '#065f46';
                score++;
            } else {
                selectedButton.classList.add('incorrect');
                feedbackTextElement.textContent = `Wrong! The correct answer was: ${correctAnswer}`;
                feedbackTextElement.style.color = '#991b1b';

                Array.from(optionsContainer.children).forEach(button => {
                    if (button.textContent === correctAnswer) {
                        button.classList.add('correct');
                    }
                });
            }
            updateScoreDisplay();
            nextButton.disabled = false;
            nextButton.classList.remove('disabled');
        }

        function updateScoreDisplay() {
            scoreDisplay.textContent = `Score: ${score}`;
        }

        function nextQuestion() {
            currentQuestionIndex++;
            displayQuestion();
        }

        function endQuiz() {
            questionArea.innerHTML = `<p class="quiz-end-message">Quiz Completed!</p>
                                      <p class="score-display">Your final score is: ${score} out of ${questions.length}</p>`;
            nextButton.classList.add('hidden');
            playAgainButton.classList.remove('hidden');
            scoreDisplay.classList.add('hidden');
        }

        function restartQuiz() {
            currentQuestionIndex = 0;
            score = 0;
            updateScoreDisplay();
            questionArea.innerHTML = `
                <p id="question-text" class="question-text"></p>
                <div id="options-container" class="options-container"></div>
                <p id="feedback-text" class="feedback-text"></p>
            `;
            questionTextElement = document.getElementById('question-text');
            optionsContainer = document.getElementById('options-container');
            feedbackTextElement = document.getElementById('feedback-text');

            nextButton.classList.remove('hidden');
            playAgainButton.classList.add('hidden');
            scoreDisplay.classList.remove('hidden');
            displayQuestion();
        }

        nextButton.addEventListener('click', nextQuestion);
        playAgainButton.addEventListener('click', restartQuiz);

        displayQuestion();
        updateScoreDisplay();