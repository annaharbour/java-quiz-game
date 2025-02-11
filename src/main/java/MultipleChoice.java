import java.util.Scanner;

public class MultipleChoice {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] responses = {"", "", "", ""};
        String[] answers = {"B", "A", "C", "D"};
        Boolean[] correct = {false, false, false, false};
        int score = 0;


        System.out.println("What is the capital of France?");
        System.out.println("A. London");
        System.out.println("B. Paris");
        System.out.println("C. Rome");
        System.out.println("D. Berlin");

        System.out.println("Enter your answer: ");
        responses[0] = scanner.next();

        System.out.println("What is the capital of England?");
        System.out.println("A. London");
        System.out.println("B. Paris");
        System.out.println("C. Rome");
        System.out.println("D. Berlin");

        System.out.println("Enter your answer: ");
        responses[1] = scanner.next();

        System.out.println("What is the capital of Italy?");
        System.out.println("A. London");
        System.out.println("B. Paris");
        System.out.println("C. Rome");
        System.out.println("D. Berlin");

        System.out.println("Enter your answer: ");
        responses[2] = scanner.next();

        System.out.println("What is the capital of Germany?");
        System.out.println("A. London");
        System.out.println("B. Paris");
        System.out.println("C. Rome");
        System.out.println("D. Berlin");

        System.out.println("Enter your answer: ");
        responses[3] = scanner.next();

        for(int i = 0; i < responses.length; i++) {
            if(responses[i].equalsIgnoreCase(answers[i])) {
                correct[i] = true;
                score++;
                System.out.println("Answer to question " + (i + 1) + " is correct.");
            } else {
                System.out.println("Answer to question " + (i + 1) + " is incorrect.");
            }
        }

        System.out.println("You got " + score + " out of " + answers.length + " correct!");

    }
}
