package beginner_syntaxes_basics.story_builder;

import java.util.Scanner;

public class Story {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Let's create a story");
        System.out.println("Enter an adjective");
        String adjective = scanner.next();

        System.out.println("Enter a season of the year");
        String season= scanner.next();

        System.out.println("Enter a whole number: ");
        int number = scanner.nextInt();

        scanner.close();
        System.out.println("On a "+ adjective + " "+ season+" day, I drank a minimum of " +
                ""+number+" cups of coffee."); //append
    }
}
