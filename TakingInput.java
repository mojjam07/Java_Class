import java.util.Scanner;

public class TakingInput {

    public static void main(String[] args) {
        Scanner query = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = query.nextLine();

        System.out.print("Enter your age: ");
        int age = query.nextInt();

        System.out.println("Hello, " + name + "! You are " + age + " years old.");

        query.close();
    }
}