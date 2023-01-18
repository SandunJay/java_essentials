package add_numbers;

import java.util.Scanner;

public class AddNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int done = 0;

        do{
            System.out.println("Enter num 1: ");
            double num1 = in.nextDouble();
            System.out.println("Enter num 2");
            double num2 = in.nextDouble();
            double sum = num1+num2;
            System.out.println("Sum = " + sum);

            System.out.println("Would you like to end");
            done = in.nextInt();
        }while(done==1);

    }
}
