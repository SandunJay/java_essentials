package objects;

import java.util.Random;
import java.util.Scanner;

public class HomeAreaCalculatorWithMethods {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args){
        Rectangle kitchen = getRoom();
        Rectangle bathroom = getRoom();
    }
    public static double calculateTotalArea(Rectangle rectangle1,Rectangle rectangle2){
        return rectangle1.calculateArea() + rectangle2.calculateArea();
    }

    public static Rectangle getRoom(){
        System.out.println("Enter the length: ");
        double length = scanner.nextDouble();
        System.out.println("Enter the width: ");
        double width = scanner.nextDouble();
        return new Rectangle(length, width);
    }
}