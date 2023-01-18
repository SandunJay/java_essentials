package beginner_syntaxes_basics.salary_calculator;

import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        int salary = 1000;
        int bonus = 250;
        int quota = 10;

        System.out.println("How many sales have you made ? ");
        Scanner scanner = new Scanner(System.in);
        int sales = scanner.nextInt();
        scanner.close();

        if(sales> quota){
            salary = salary + bonus;
        }

        System.out.println("The salary is " + salary);
    }
}
