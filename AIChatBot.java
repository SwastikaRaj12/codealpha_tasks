import java.util.Scanner;

public class SimpleAIChatbot {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("AI Chatbot: Hello! How can I help you today?");

        while (true) {
            System.out.print("You: ");
            String input = scanner.nextLine().toLowerCase();

            if (input.contains("hello") || input.contains("hi")) {
                System.out.println("AI Chatbot: Hi there! 😊");
            } else if (input.contains("how are you")) {
                System.out.println("AI Chatbot: I'm just a program, but I'm doing great! How about you?");
            } else if (input.contains("bye")) {
                System.out.println("AI Chatbot: Goodbye! Have a great day!");
                break;
            } else if (input.contains("your name")) {
                System.out.println("AI Chatbot: I'm your friendly Java chatbot.");
            } else {
                System.out.println("AI Chatbot: I'm not sure how to respond to that.");
            }
        }

        scanner.close();
    }
}
