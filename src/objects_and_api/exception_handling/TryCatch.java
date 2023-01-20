package objects_and_api.exception_handling;

import java.io.File;
import java.io.IOException;

public class TryCatch {

    public static void main(String[] args) {
        File file = new File("resources/nonexistent.txt");
        try {
            file.createNewFile();
        } catch (IOException e) {
            System.out.println("An error has occurred: " +e.getMessage());
            e.printStackTrace();
        }
    }
}
