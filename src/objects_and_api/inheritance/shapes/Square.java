package objects_and_api.inheritance.shapes;

public class Square extends Rectangle {
    @Override
    public double calculatePerimeter(){
        return sides*length;
    }

    public void print() {
        System.out.println("I am a square");
    }
}
