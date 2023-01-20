package objects_and_api.exception_handling;

public class NegativeInputException extends Exception{
    public NegativeInputException(){
        this("Input must be greater than or equal to 0");
    }

    public NegativeInputException(String s) {
        super(s);
    }
}
