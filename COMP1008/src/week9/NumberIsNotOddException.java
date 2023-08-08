package week9;

public class NumberIsNotOddException extends IllegalArgumentException{
    public NumberIsNotOddException(){}
    public NumberIsNotOddException(String message) {
        super(message);
    }
}
