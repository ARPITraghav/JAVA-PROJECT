class Question {

    String question;
    String optionA;
    String optionB;
    String optionC;
    String optionD;
    char correctAnswer;

    Question(String question, String a, String b, String c, String d, char correct) {
        this.question = question;
        this.optionA = a;
        this.optionB = b;
        this.optionC = c;
        this.optionD = d;
        this.correctAnswer = correct;
    }

    void displayQuestion() {
        System.out.println(question);
        System.out.println("A. " + optionA);
        System.out.println("B. " + optionB);
        System.out.println("C. " + optionC);
        System.out.println("D. " + optionD);
    }
}