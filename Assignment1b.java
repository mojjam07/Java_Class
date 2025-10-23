
import java.util.Scanner;

public class Assignment1b {

    public static void main(String[] args) {
        Scanner query = new Scanner(System.in);

        System.out.print("What is your name? ");
        String name = query.nextLine();

        System.out.print("What is your favorite color? ");
        String color = query.nextLine();

        System.out.println("Hello, " + name + "! Your favorite color is " + color + ".");

        query.close();

    }
}
