package objects_and_api.inheritance.vehicles;

public class Garage {

    public static void main(String[] args) {
        Coupe myCar = new Coupe();

        myCar.setColor("Green");
        System.out.println(
                String.format("My car is %s and has %d doors.", myCar.getColor(),myCar.getDoors())
        );
    }
}
