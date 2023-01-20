package objects_and_api.exception_handling;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleExceptions {

    public static void main(String[] args) {

        File file = new File("files/numbers.txt");
        try {
            Scanner fileReader = new Scanner(file);
            while (fileReader.hasNext()){
                System.out.println(fileReader.hasNext());
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }catch(InputMismatchException e){
            e.printStackTrace();
        } catch (Exception e){

        }
    }
}
