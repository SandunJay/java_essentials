package password_validator;

import java.util.Scanner;

public class PasswordValidator {
    private static String currentUName = "johndoe";
    private static String currentPWord = "ABC_1234";

    public static void main(String[] args) {
        printPasswordRules();
        Scanner in = new Scanner(System.in);
        boolean valid;

        do{
            System.out.println("Enter new password: ");
            var newPWord =in.nextLine();
            valid = changePassword(newPWord);
        }while(!valid);

        System.out.println("New Password is valid");
        in.close();
    }

    public static void printPasswordRules(){
        System.out.println("Your new password must meet the following requirements:");
        System.out.println("* at least 8 characters long");
        System.out.println("* contain an uppercase letter");
        System.out.println("* contain a special character");
        System.out.println("* not contain the username");
        System.out.println("* not the same as the old password");
        System.out.println();
    }

    private static boolean changePassword(String newPWord) {
        boolean valid =true;
        String error = "";

        if(newPWord.length()<8){
            valid = false;
            error +="\n Your Password must be at least 8 characters long.";
        }
        if (newPWord.equals(newPWord.toLowerCase())){
            valid = false;
            error +="\n Must consist at least a uppercase";
        }
        if (newPWord.matches("[a-zA-Z0-9]*")){
            valid = false;
            error +="\n Must consist at least a specialcharacter";
        }
        if (newPWord.toUpperCase().contains(currentUName.toUpperCase())){
            valid = false;
            error +="\n Cannot be the same as previous username";
        }
        if (newPWord.equals(currentPWord)){
            valid = false;
            error +="\n Cannot be the same as old password";
        }
        if(!valid){
            System.out.println(error);
        }
        return valid;
    }
}
