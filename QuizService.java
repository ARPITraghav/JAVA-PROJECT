import java.util.*;

class QuizService {

    ArrayList<Question> questions = new ArrayList<>();
    int score = 0;

    QuizService() {

        questions.add(new Question(
                "Which language is used for Android development?",
                "Python", "Java", "C++", "Swift", 'B'));

        questions.add(new Question(
                "Which keyword is used for inheritance in Java?",
                "extends", "implements", "inherits", "super", 'A'));

        questions.add(new Question(
                "Which collection is dynamic in Java?",
                "Array", "ArrayList", "Stack", "Queue", 'B'));

        questions.add(new Question(
                "Which company developed Java?",
                "Microsoft", "Sun Microsystems", "Google", "IBM", 'B'));

        questions.add(new Question(
                "Which method starts a thread?",
                "execute()", "run()", "start()", "begin()", 'C'));
    }

    void startQuiz() {

        Scanner sc = new Scanner(System.in);

        for (Question q : questions) {

            q.displayQuestion();

            try {
                System.out.print("Enter your answer: ");
                char ans = sc.next().toUpperCase().charAt(0);

                if (ans == q.correctAnswer) {
                    score++;
                }

            } catch (Exception e) {
                System.out.println("Invalid input!");
            }

            System.out.println();
        }

        System.out.println("Quiz Finished!");
        System.out.println("Your Score: " + score + "/" + questions.size());
    }

    int getScore() {
        return score;
    }
}