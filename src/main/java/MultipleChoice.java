import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] questions = {
                "What is the main function of a router?",
                "Which part of the computer is considered the brain?",
                "What year was Facebook launched?",
                "Who is known as the father of computers?",
                "What was the first programming language?"
        };
        String[][] options = {
                {"A. Storing Files", "B. Encrypting data", "C. Directing internet traffic", "D. Managing passwords"},
                {"A. CPU", "B. Hard Drive", "3. RAM", "4. GPU"},
                {"A. 2000", "B. 2004", "C. 2006", "D. 2010"},
                {"A. Charles Babbage", "B. Alan Turing", "C. John Atanasoff", "D. Tim Berners-Lee"},
                {"A. COBOL", "B. C", "C. Fortran", "D. Assembly"}};


        String[] answers = {"C", "A", "B", "A", "C"};
        String[] responses = {"", "", "", "", ""};
        Boolean[] correct = {false, false, false, false, false};
        int score = 0;

        System.out.println("Welcome to the Multiple Choice Quiz!");
        System.out.println("Select A, B, C, or D for each question.");
        System.out.println("========================================");

        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            for(String option: options[i]) {
                System.out.println(option);
            }
            System.out.print("Your answer: ");
            responses[i] = scanner.next().toUpperCase();
            if(responses[i].equals(answers[i])) {
                correct[i] = true;
                score++;
            }
        }
        System.out.println("========================================");
        System.out.println("RESULTS");
        System.out.println("========================================");
        for(int i = 0; i < questions.length; i++) {
            System.out.println(questions[i]);
            System.out.println("Your answer: " + responses[i]);
            System.out.println("Correct answer: " + answers[i]);
            if(correct[i]) {
                System.out.println("You got it right!");
            } else {
                System.out.println("You got it wrong!");
            }
            System.out.println("========================================");
        }
        System.out.println("Your final score is: " + score + "/" + questions.length);
        scanner.close();
    }
}
