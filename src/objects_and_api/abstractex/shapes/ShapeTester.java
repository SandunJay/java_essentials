package objects_and_api.abstractex.shapes;

public class ShapeTester {

    public static void main(String[] args){

        Shape rectangle = new Rectangle(5,12);
        System.out.println(rectangle.calculateArea());
    }
}

