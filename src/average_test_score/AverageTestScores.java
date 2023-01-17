package average_test_score;

import java.util.Scanner;

/*
 * NESTED LOOPS:
 * Find the average of each student's test scores
 */
public class AverageTestScores {

    public static void main(String[] args){

        //Initialize what we know
        int numberOfStudents = 24;
        int numberOfTests = 4;

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<numberOfStudents;i++){
            double total = 0;
            for(int j=0; j<numberOfTests; j++){
                System.out.println("Enter the marks for the subject " + (j+1) + ": ");
                double marks = scanner.nextDouble();

                total= total +marks;
            }
            double average = total/numberOfTests;
            System.out.println("Average of student "+ (i+1) +": "+ average);
        }

        scanner.close();
    }
}