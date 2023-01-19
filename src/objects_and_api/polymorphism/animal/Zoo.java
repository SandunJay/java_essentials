package objects_and_api.polymorphism.animal;

public class Zoo {

    public static void main(String[] args) {
        Dog rocky = new Dog();
        rocky.fetch();
        rocky.makeSound();
        feed(rocky);

        Animal sasha = new Dog();
        sasha.makeSound();

        sasha = new Cat();
        sasha.makeSound();
        ((Cat)sasha).scratch();
        feed(sasha);

        boolean isDog = sasha instanceof Cat;
        System.out.println(isDog);
    }

    public static void feed(Animal animal){
        boolean animalType;
        if (animal instanceof Dog){
            System.out.println("Dog food");
        } else if (animal instanceof Cat) {
            System.out.println("Cat fod");
        }
        else {
            System.out.println("Invalid type");
        }
    }
}
