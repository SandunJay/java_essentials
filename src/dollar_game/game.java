package dollar_game;

import java.util.Scanner;

public class game {
    public static void main(String[] args) {
        int penny, nickel,dime, quarter;
        float total;

        System.out.println("How manny pennies you got: ");
        Scanner in = new Scanner(System.in);
        penny = in.nextInt();
        System.out.println("How manny nickels you got: ");
        nickel = in.nextInt();
        System.out.println("How manny dimes you got: ");
        dime = in.nextInt();
        System.out.println("How manny quarters you got: ");
        quarter = in.nextInt();

        total = (float) (penny*0.01 + nickel*0.05 +dime*0.1 +quarter*0.25);

        if (total < 1){
            double amountShort = 1 - total;
            System.out.println("You are short: " + amountShort);
        } else if (total > 1) {
            double over = total - 1;
            System.out.println("You are over: " + over);
        }
        else {
            System.out.println("you won");
        }
    }
}
