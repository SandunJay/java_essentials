package instant_credit_checker;

import java.util.Scanner;

/*
 * PASSING ARGUMENTS TO METHODS
 * Write an 'instant credit check' program that approves
 * anyone who makes more than $25,000 and has a credit score
 * of 700 or better. Reject all others.
 */
public class InstantCreditCheck {

    public static void main(String args[]){

        //Get input
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your salary:");
        double salary = scanner.nextDouble();
        
        System.out.println("Enter your credit score:");
        int creditScore = scanner.nextInt();
        scanner.close();

        boolean qualified = isQualified(creditScore,salary);
        //Check if the user is qualified
        if (qualified== true){
            System.out.println("Passed");
        }
        else {
            System.out.println("Failed :|");
        }
    }
    public static boolean isQualified(int creditScore, double salary){
        double requiredSalary = 25000;
        int requiredCreditScore = 700;

        if (creditScore > requiredCreditScore && salary > requiredSalary ){
            return true;
        }
        else {
            return false;
        }
    }
}