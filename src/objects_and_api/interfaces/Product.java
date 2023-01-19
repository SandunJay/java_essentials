package objects_and_api.interfaces;

public interface Product {
    String getName();
    String setName(String name);

    default double getPrice(){return 50;};

    default void setPrice(){};
}
