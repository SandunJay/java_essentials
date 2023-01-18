package beginner_syntaxes_basics.grade;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        System.out.println("Enter your letter beginner_syntaxes_basics.grade: ");
        Scanner in = new Scanner(System.in);
        String grade = in.next();
        in.close();

        String message;
        switch (grade){
            case "A":
                message = "Excellent Job";
                break;
            case "B":
                message = "Great Job!";
                break;
            case "C":
                message = "Good Job";
                break;
            case "D":
                message = "Work harder!";
                break;
            case "F":
                message = "Oh great :| !";
                break;
            default:
                message = "Invalid input";
                break;
        }
        System.out.println(message);
    }
}
