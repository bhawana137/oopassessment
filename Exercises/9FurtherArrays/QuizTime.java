/*
 Quiz Time
Define a class called Quiz that manages a set of up to 25 Question objects. Define the add method of the Quiz class to add a question to the quiz. 
Define the giveQuiz method of the Quiz class to present each question in turn to the user, accept an answer for each one, and keep track of the
results. Define a class called QuizTime with a main method that populates a quiz , presents it , and prints the final results
*/

package week9;
import java.util.Scanner;

// Class that represents a single Question
class Question {
    private String questionText;
    private String correctAnswer;

    // Constructor
    public Question(String questionText, String correctAnswer) {
        this.questionText = questionText;
        this.correctAnswer = correctAnswer.trim().toLowerCase();
    }

    public String getQuestionText() {
        return questionText;
    }

    public String getCorrectAnswer() {
        return correctAnswer;
    }

    // Checks if the user's answer is correct
    public boolean checkAnswer(String userAnswer) {
        return userAnswer.trim().toLowerCase().equals(correctAnswer);
    }
}

// Class that manages a quiz with up to 25 questions
class Quiz {
    private Question[] questions = new Question[25];
    private int questionCount = 0;

    // Add a new question to the quiz
    public void add(Question q) {
        if (questionCount < 25) {
            questions[questionCount] = q;
            questionCount++;
        } else {
            System.out.println("Quiz is full. Cannot add more questions.");
        }
    }

    // Presents the quiz to the user and tracks the score
    public void giveQuiz() {
        Scanner scanner = new Scanner(System.in);
        int correctAnswers = 0;

     
        System.out.println("Let's Start the Quiz! ");
       

        for (int i = 0; i < questionCount; i++) {
            System.out.println("Question " + (i + 1) + ": " + questions[i].getQuestionText());
            System.out.print("Your Answer: ");
            String userAnswer = scanner.nextLine();

            if (questions[i].checkAnswer(userAnswer)) {
                System.out.println("Correct!\n");
                correctAnswers++;
            } else {
                System.out.println("Wrong! The correct answer is: " + questions[i].getCorrectAnswer() + "\n");
            }
        }

        // Show final result
        System.out.println("Quiz Complete!");
        System.out.println("You got " + correctAnswers + " out of " + questionCount + " correct.");
        scanner.close();
    }
}

// Main class that runs the quiz
public class QuizTime {
    public static void main(String[] args) {
        Quiz quiz = new Quiz();

        // Add sample questions 
        quiz.add(new Question("What is the capital city of Nepal?", "Kathmandu"));
        quiz.add(new Question("What is the national bird of Nepal?", "Daphne"));
        quiz.add(new Question("What is the currency of Nepal?", "Rupee"));
        quiz.add(new Question("Who is considered the founder of Buddhism born in Nepal?", "Buddha"));
        quiz.add(new Question("Which country lies to the south of Nepal?", "India"));
        quiz.add(new Question("What is the national flower of Nepal?", "Rhododendron"));
        quiz.add(new Question("How many provinces does Nepal have?", "7"));
        // Run the quiz
        quiz.giveQuiz();
    }
}
