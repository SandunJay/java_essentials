package grade;

import java.util.Scanner;

public class Grade_Switch_Expression {
    public static void main(String[] args) {
        System.out.println("Enter your letter grade: ");
        Scanner in = new Scanner(System.in);
        String grade = in.next();
        in.close();

        String message = switch (grade){
            case "A" ->"Excellent Job";
            case "B" -> "Great Job!";
            case "C" -> "Good Job";
            case "D" -> "Work harder!";
            case "F" -> "Oh great :| !";
            default -> "Invalid input";
        };
        System.out.println(message);
    }
}
