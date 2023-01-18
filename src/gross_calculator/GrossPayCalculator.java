package gross_calculator;

import java.util.Scanner;

public class GrossPayCalculator {
    public static void main(String[] args) {
        int hours = 0;
        double payGrade = 0;

        System.out.println("How many hours have u worked: ");
        Scanner in = new Scanner(System.in);
        hours = in.nextInt();

        System.out.println("What is your pay Grade: ");
        payGrade = in.nextDouble();

        in.close();

        Double grossPay = hours * payGrade;
        System.out.println("Gross Pay: " + grossPay);

    }
}
